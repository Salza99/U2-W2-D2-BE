package Davide.U2W2D2.Services;

import Davide.U2W2D2.entities.BlogPost;
import Davide.U2W2D2.entities.Categoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    private List<BlogPost> blogPosts= new ArrayList<>();

    public long save(BlogPost body){
        Random random = new Random();
        body.setId(random.nextInt(1, 1000));
        this.blogPosts.add(body);
        return body.getId();
    }
}
