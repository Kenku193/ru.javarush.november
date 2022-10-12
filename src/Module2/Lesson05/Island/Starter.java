package Module2.Lesson05.Island;


import Module2.Lesson05.Test;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {


        Animal<Feed> dog = new Animal<>();

        List<Feed> feeds = new ArrayList<>();
        feeds.add(new Bone());
        feeds.add(new Fish());
        feeds.add(new Bone());
        feeds.add(new Fish());

        dog.eat(feeds);


        Animal<Fish> cat = new Animal<>();


        Test<Integer, String> test = new Test<>(1, "privet");
        test.getFirst();

    }
}
