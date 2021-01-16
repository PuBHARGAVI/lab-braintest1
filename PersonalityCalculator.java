import java.util.Scanner;
public class PersonalityCalculator
{
	public static void main(String[] options)
	{	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] value=new int[n];
String[] s={"1.I do not expect to be praised by others.","2.I like sitting in the Math class rather than sitting in the Pottery class (I am vividly imaginative & I enjoy classes where I can move around and try things).","3.I always show up in/on time.","4. I do not care to read to the instructions before I start putting something together, I like learning along the way.","5. I am tidy and organized and cannot live in a mess.","6. My thinking is random & unstructured.","7. I am an effective communicator","8. I can picture things clearly in my head.","9. I often come up with new ideas.","10. I am not easily disturbed by events.","11. I rarely cry while watching sad movies or incidents.","12. I am good at laying out a step-by-step plan.","13. I am the happiest when I am creating or expressing myself.","14. I make decisions based on facts, not feelings. (I like info that is precise and measurable).","15. I make a mess of things.","16. I get stressed out easily.","17. I like fantasy and make believe.","18. I prizelogic above all else. (For something to be credible, it needs to be logical).","19. I often forget to put things back in their proper place.","20. I keep my feelings controlled."};
	for(int i=0;i<20;i++){
		System.out.println(s[i]+"? rate yourself(1,2,3,4,5)");
		value[i]=sc.nextInt();
	}
		int a=value[0]+value[1]+value[2]+value[4]+value[7]+value[9]+value[10]+value[11]+value[13]+value[17]+value[19];
		int b=value[3]+value[5]+value[6]+value[8]+value[12]+value[14]+value[15]+value[16]+value[18];
		int sum=66-a+b;
		System.out.println("Your total score is "+sum+".");
		if((sum>=22)&&(sum<=55))
			System.out.println("leftbrained");
		else if((sum>=56)&&(sum<=64))
			System.out.println("No clear preference");
		else if((sum>=65)&&(sum<=100))
             		System.out.println("rightbrained");
		else
		     	System.out.println("false");	
		
	}
	
}

