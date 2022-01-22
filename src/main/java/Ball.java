import processing.core.PApplet;

public class Ball extends PApplet {
    Ball ball;
    public static final int HEIGHTFROMTOP = 100;
    public static final int DIAMETER = 10;

    private int width;
    private int height;

    public int ballCounter1 = 0;
    public int ballCounter2 = 0;
    public int ballCounter3 = 0;
    public int ballCounter4 = 0;


    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }


    public int update(int ballCounter,int increment){
        return ballCounter + increment;
    }
    @Override
    public void setup(){
        ball = new Ball();
        ball.setWidth(640);
        ball.setHeight(480);

    }

    @Override
    public void settings(){
        super.settings();
        size(640,480);
    }
    @Override
    public void draw(){

        ellipse(ballCounter1,HEIGHTFROMTOP,DIAMETER,DIAMETER);
        ellipse(ballCounter2,HEIGHTFROMTOP*2,DIAMETER,DIAMETER);
        ellipse(ballCounter3,HEIGHTFROMTOP*3,DIAMETER,DIAMETER);
        ellipse(ballCounter4,HEIGHTFROMTOP*4,DIAMETER,DIAMETER);
        ballCounter1 = ball.update(ballCounter1,1);
        ballCounter2 = ball.update(ballCounter2,2);
        ballCounter3 = ball.update(ballCounter3,3);
        ballCounter4 = ball.update(ballCounter4,4);
    }
    public static void main(String[] args){
        PApplet.main("Ball",args);
    }
}
