package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.song(hare);
        ball.run(hare);
        wolf.tryEat(ball);
        ball.song(wolf);
        ball.run(wolf);
        fox.tryEat(ball);
        ball.song(fox);
        fox.eatBall(ball);
    }
}
