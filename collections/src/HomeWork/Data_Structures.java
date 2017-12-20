package HomeWork;

import com.collections.Student;

public class Data_Structures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int sum=0;
			int avg;
			int temp;
			int top;



			Student s[]=new student[10];

			s[0]=new student();
			s[0].name="Sraya";
			s[0].marks=95;

			s[1]=new student();
			s[1].name="siva";
			s[1].marks=88;

			s[2]=new student();
			s[2].name="raja";
			s[2].marks=77;


			s[3]=new student();
			s[3].name="surya";
			s[3].marks=96;

			s[4]=new student();
			s[4].name="sidhu";
			s[4].marks=82;

			s[5]=new student();
			s[5].name="gowtham";
			s[5].marks=90;

			s[6]=new student();
			s[6].name="anusha";
			s[6].marks=67;

			s[7]=new student();
			s[7].name="mouni";
			s[7].marks=37;

			s[8]=new student();
			s[8].name="vijay";
			s[8].marks=28;

			s[9]=new student();
			s[9].name="swetha";
			s[9].marks=60;




			for(int i = 0;i<s.length;i++)
			{
			if(s[i].marks>35)
			{
			System.out.println("pass");
			}
			else
			{
			System.out.println("fail");
			}
			}

			for(int j=0;j<s.length;j++)
			{
			sum=sum+s[j].marks;

			}
			System.out.println("total marks of 10 students :"+sum);

			for(int k=0;k<s.length;k++)
			{
			avg=sum/10;
			}
			System.out.println("aerage of 10 students is :"+avg);

			//marks in order

			for(int i=0;i<s.length;i++)
			 {

			          for(int j=0;j<s.length-i;j++)

			          {

			                if(s.length[j]>s.length[j+1])

			                {

			                      student max = s[j];

			                      s[j]=s[j+1];

			                      s[j+1]=max;

			                }

			          }

			 }


			    

			    for(int i=0;i<s.length;i++)

			    {

			          System.out.println(s[i]);

			    }







			/*  to retrieve top 3 elements
			* 
			* 
			*/

			   for( int  i = 1; i <3; i++) 
			   {
			       
			       
			       System.out.println("List of top 3 students: "+s.name());
			   }
			   
			   
			}



			

			
	}


