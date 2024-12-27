class Container {
    public int count;

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}




public class Main {
    public static void main(String[] args) {
        char e = 'ё';
        System.out.println((int)e);
        Container container = new Container();
        container.addCount(5000);
        System.out.println(container.getCount());

        for (int i = 0; i < container.getCount(); i++) {
            if((char) i >= 'а' && (char) i <= 'я' || (char)i == 'ё' || (char) i >= 'А' && (char) i <= 'Я' || (char)i == 'Ё')
                System.out.println((char)i);
        }


    }
}
