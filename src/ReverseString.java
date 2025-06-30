public class ReverseString {
    public void input(String str){
        String[] str1= str.split(" ");
        StringBuilder output = new StringBuilder();
        for(int i=0;i<str1.length;i++){
            output.append(reverse(str1[i])).append(" ");
        }
        System.out.println(output.toString());
    }
    public String reverse(String word){
        char[] c =word.toCharArray();
        int l=0,r=c.length-1;
        while (l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        String word1=new String(c);
        return word1 ;
    }
    public static void main(String[] args) {
ReverseString rs= new ReverseString();
 rs.input("Java is powerful");
    }
}
