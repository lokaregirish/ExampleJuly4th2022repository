package p1;
import p1.Child;
public class Independent {
	Child kk=new Child();
void Displayvar()
{
	//System.out.println(kk.a);
	System.out.println(kk.b);
	System.out.println(kk.c);
	System.out.println(kk.d);
}
	public static void main(String[] args) {
		Independent pp=new Independent();
		pp.Displayvar();

	}

}
