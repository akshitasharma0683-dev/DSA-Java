public class searchInString {
    public static void main(String[] args) {
        String name ="Akshita";
        char target = 'i';
        System.out.println(search(name,target));

    }
    static boolean search(String name, char target){

        if (name.equals(null)) {
            return false;
        }

        for (int index = 0; index < name.length(); index++) {
            if (target==name.charAt(index)) {
                return true;
            }
        }

        return false;
    }
}
