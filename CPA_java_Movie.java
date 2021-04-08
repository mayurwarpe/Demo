import java.util.*;
import java.lang.*;
import java.io.*;
class Myclass
{
   public static void main(String []args)
    {
		Scanner sc=new Scanner(System.in);
		Movie[] arr=new Movie[4];
		System.out.println("Hello Mayur...!");

		for(int i=0;i<arr.length;i++)
		{
			int id=sc.nextInt();
			sc.nextLine();
			String dir=sc.nextLine();
			int rate=sc.nextInt();
			int bud=sc.nextInt();
			arr[i]=new Movie(rate,bud,id,dir);

		}
		sc.nextLine();
		String dir1=sc.nextLine();
		int rate1=sc.nextInt();
		int bud1=sc.nextInt();

		int ans1=findAvgBudgetByDirector(arr,dir1);
		if(ans1!=0)
			System.out.println(ans1);
		else
			System.out.println("Sorry-The given director has not yet directed any movie");

		Movie ans=getMovieByRatingBudget(arr,rate1,bud1);
		if(ans!=null)
			System.out.println(ans.getid());
		else
			System.out.println("Sorry-No movie is available with the specified rating and budget requirement");

	
    }
    public static int  findAvgBudgetByDirector(Movie[] arr, String dir1)
    {
    	int sum=0,count=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if((arr[i].getdir()).equalsIgnoreCase(dir1))
    		{
    			sum+=arr[i].getbudget();
    			count++;
    		}
    	}
    	if(count!=0)
    		return (sum/count);
    	else
    		return 0;
    }

    public static Movie getMovieByRatingBudget(Movie[] arr,int rate1,int bud1)
    {
    	Movie obj=null;
    	for(int i=0;i<arr.length;i++)
    	{
    		if( (arr[i].getrating())==rate1 && (arr[i].getbudget())==bud1 && ((arr[i].getbudget())%(arr[i].getrating())==0 ))
    		{
    			obj=arr[i];
    		}
    	}

    	if(obj!=null)
    		return obj;
    	else
    		return null;

    }
}
class Movie
{
	private int rating,budget,movieId;
	private String director;
	public Movie(int rating,int budget,int movieId,String director)
	{
		this.rating=rating;
		this.budget=budget;
		this.movieId=movieId;
		this.director=director;
	}
	int getrating()
	{
		return rating;
	}
	void setratin(int rating)
	{
		this.rating=rating;
	}
	int getbudget()
	{
		return budget;
	}
	void setbudget(int budget)
	{
		this.budget=budget;
	}
	int getid()
	{
		return movieId;
	}
	void setid(int movieId)
	{
		this.movieId=movieId;
	}
	String getdir()
	{
		return director;
	}
	void setdir(String director)
	{
		this.director=director;
	}


}