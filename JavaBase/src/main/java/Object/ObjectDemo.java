package Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Ëï·ÉÁú");
        st.setAge(28);
        System.out.println(st);
        System.out.println(st.toString());

/*        public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */
    }
}
