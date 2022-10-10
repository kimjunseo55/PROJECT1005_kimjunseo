package kjs_project1005Chapter5;

class PointC5_5 {
    private int x, y;
    public PointC5_5(int x, int y) {
        this.x = x; this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x; this.y = y;
    }
}

class ColorPointC5_5 extends PointC5_5 {
    private String colorC5_5;
    public ColorPointC5_5(int x, int y, String colorC5_5) {
        super(x, y);
        this.colorC5_5 = colorC5_5;
    }

    public void setXY(int x, int y) {
        this.move(x, y);
    }

    public void setColorC5_5(String colorC5_5) {
        this.colorC5_5 = colorC5_5;
    }

    @Override
    public String toString() {
        return this.colorC5_5 + "색의 (" + this.getX() + "," + this.getY() + ")의 점";
    }
}

public class C5_5 {
    public static void main(String[] args) {
        ColorPointC5_5 cp = new ColorPointC5_5(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColorC5_5("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}
