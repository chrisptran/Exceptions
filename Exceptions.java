import java.util.ArrayList;

class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();

        list.add(6);
        list.add("my hero");
        list.add("dungeon");

        for (int i = 0; i < list.size(); i++) {

            try {
                Integer castedValue = (Integer) list.get(i);
            } catch(ClassCastException e) {
                System.out.println(e);
                System.out.println(list.get(i));
            }
        }

        System.out.println("All set");
    }
}