//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        System.out.println(list.size());
        list.addLast(30);
        System.out.println(list.size());
        list.addLast(20);
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());

    }
}