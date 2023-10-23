package exercicioResolvido2.application;

import exercicioResolvido2.entities.Comment;
import exercicioResolvido2.entities.Post;

import java.util.*;

public class secao11ExRes2Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Date moment1 = new Date(2018, 06, 21, 13,05,44);
        Date moment2 = new Date(2018,07,28,23,14,19);
        List<Post> posts = new ArrayList<>();

        Post post1 = new Post(moment1, "Traveling to New Zealand", "I'm going to visit this " +
                "wonderful country", 12);

        Post post2 = new Post(moment2, "Good night guys", "See you tomorrow", 5);

        Comment p1Comment1 = new Comment("Have a nice trip");
        post1.addComment(p1Comment1);
        Comment p1Comment2 = new Comment("Wow that's awesome");
        post1.addComment(p1Comment2);

        Comment p2Comment1 = new Comment("Good night");
        post2.addComment(p2Comment1);
        Comment p2Comment2 = new Comment("May the Force be with you");
        post2.addComment(p2Comment2);

        posts.add(post1);
        posts.add(post2);

        for(Post post : posts) {
            System.out.println(post.getTitle());
            System.out.println(post.getLikes() + " Likes - " + post.getMoment());
            System.out.println(post.getContent());
            System.out.println("Comments:");
            for(Comment comment : post.getComments()) {
                System.out.println(comment.getComment());
            }
            System.out.println();
        }
    }
}
