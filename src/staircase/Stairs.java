package staircase;


public class Stairs {
    // Complete the staircase function below.
	public static void staircase(int n) {
        String str = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            	if(j <= i) {
            		str = "#" + str;
            	}
            	else{
            		//System.out.println("SPACE");
            		str = " " + str;
            	}

            }
            
            System.out.println(str);
            str = "";

        }
    }

    public static void main(String[] args) {
        staircase(6);

    }
}