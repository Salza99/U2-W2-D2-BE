package Davide.U2W2D2.Controller;

import Davide.U2W2D2.Services.BlogPostService;
import Davide.U2W2D2.entities.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public long createNewBlogPost(@RequestBody BlogPost body) {
         return blogPostService.save(body);
    }
}
