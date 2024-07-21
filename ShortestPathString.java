public class ShortestPathString {

    public static void shortestPath(String str){
        int x=0;
        int y=0;

        for(int i=0; i<str.length();i++){

            if(str.charAt(i) == 'W'){
                 x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'E'){
                 x++;
            }
            else{
                 y--;
            }
        }
       System.out.print("The dimentions are:" + "(" + x + "," + y + ")");
       int x2 =  x * x;
       int y2  = y * y;
       float result = (float)Math.sqrt(x2+y2);

       System.out.println("The shortest path is:" + result);
    }
    public static void main(String[]args){
        String str = "WNEENESENNN";
        shortestPath(str);
        }
}
