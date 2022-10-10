package kjs_project1005;

class e6_2_Point {
int x, y;
public e6_2_Point(int x, int y) {
this.x = x;
this.y = y;
}
public String toString() {
return "Point(" + x + "," + y + ")";
}
}
public class ToStringEx {
public static void main(String [] args) {
e6_2_Point p = new e6_2_Point(2,3);
System.out.println(p.toString());
System.out.println(p); // p는 p.toString()으로 자동 변환
System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환
}
}
