package kjs_project1005;

class e6_4_Rect {
int width;
int height;
public e6_4_Rect(int width, int height) {
this.width = width;
this.height = height;
}
public boolean equals(Object obj) {
e6_4_Rect p = (e6_4_Rect)obj;
if (width*height == p.width*p.height)
return true;
else
return false;
}
}
public class EqualsEx2 {
public static void main(String[] args) {
	e6_4_Rect a = new e6_4_Rect(2,3);
	e6_4_Rect b = new e6_4_Rect(3,2);
	e6_4_Rect c = new e6_4_Rect(3,4);
if(a.equals(b))
System.out.println("a is equal to b");
if(a.equals(c))
System.out.println("a is equal to c");
if(b.equals(c))
System.out.println("b is equal to c");
}
}