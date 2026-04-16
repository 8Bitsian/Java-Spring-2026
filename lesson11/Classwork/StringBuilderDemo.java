public class StringBuilderDemo {
    public static void main(String[] args) {
        // 1. Create String Builder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial value: " + sb);

        // 2. append()
        sb.append(" World!");
        System.out.println("After append:  " + sb);

        // 3. insert()
        sb.insert(5, ", ");
        System.out.println("After insert:  " + sb);

        // 4. replace()
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // 5. delete
        sb.delete(5, 6);
        System.out.println("After delete:  " + sb);

        // 6. reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Final String: " + sb.toString());
    }
}
