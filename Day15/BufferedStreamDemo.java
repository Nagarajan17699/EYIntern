package Day15;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
public class BufferedStreamDemo {
	public static void main(String[] args)throws Exception {
		String str="Jack and &copy jill went &copy; up the hill..............";
		
		ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
		
		BufferedInputStream bfs=new BufferedInputStream(bis);
		
		System.out.println(bfs.markSupported());
		int c=0;
		boolean mark=false;
		while((c=bfs.read())!=-1) {
			switch((char)c){
				
			case '&':{
				if(!mark) {
					bfs.mark(32);
					mark=true;
				}
				break;
			}
			case ';':{
				if(mark) {
					System.out.print((char)169);
					mark=false;
				}
				break;
			}
			case ' ':{
				if(mark) {
					bfs.reset();
					mark=false;
					System.out.print("&");
				}
				else {
					System.out.print(" ");
				}
					break;
			}
			default:{
				if(!mark) {
					System.out.print((char)c);
				}
			}
			}
		}
	}
}