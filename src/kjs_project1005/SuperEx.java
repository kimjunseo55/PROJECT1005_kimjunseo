
package kjs_project1005;
//아이거 원래 colorpoint 인데 잘못함 바꾸기
class Point {
private int x, y; // 한점을구성하는x, y 좌표
public Point() {
this.x= this.y= 0;
}
public Point(int x, int y) {
this.x= x; this.y= y;
}
public void showPoint() { // 점의좌표출력
System.out.println("(" + x + "," + y + ")");
}
}
class ColorPoint extends Point{
private String color; // 점의색
public ColorPoint(int x, int y, String color) {
super(x, y);// Point의생성자Point(x, y) 호출
this.color= color;
}
public void showColorPoint() { // 컬러점의좌표출력
System.out.print(color);
showPoint(); // Point 클래스의showPoint() 호출
}
}
public class SuperEx{
public static void main(String[] args) {
ColorPoint cp= new ColorPoint(5, 6, "blue");
cp.showColorPoint();
}
}

