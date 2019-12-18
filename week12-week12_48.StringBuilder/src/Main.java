
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t.length-1; i++){
            sb.append(t[i]).append(", ");
            
            if((i+1) % 4 == 0 ){
                sb.append("\n ");
            }
        }
        sb.append(t[t.length-1]);
        return "{\n " + sb+ "\n}";
    }
}
