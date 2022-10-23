public class Main {
    public static final String ONE = "Красный";
    public static final String TWO = "Оранжевый";
    public static final String THREE = "Жёлтый";
    public static final String FAUT = "Зелёный";
    public static final String FIVE = "Синий";
    public static final String SIX = "Фиолетовый";

    public static int Red = 1;
    public static int Orange = 2;
    public static int Yellow = 3;
    public static int Green = 4;
    public static int Blue = 5;
    public static int Purple = 6;
    public static int Olive = 7;



    public static void main(String[] args) {
        printRainbowColor(THREE);
        printRainbowColorIfElse(7);

    }

    private static void printRainbowColor(String str){
        switch (str){
            case ONE:
                System.out.println("Красный");
                break;
            case TWO:
                System.out.println("Оранжевый");
                break;
            case THREE:
            case FAUT:
                System.out.println("Оливковый"); //Жёлтый + Зелёный
                break;
            case FIVE:
                System.out.println("Синий");
                break;
            case SIX:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Совпадений не было найдено");
        }
    }
    public static void printRainbowColorIfElse(Integer str){

        if (str == 1){
            System.out.println("Красный");
        }else if (str == 2){
            System.out.println("Оранжевый");
        }else if (str == 3){
            System.out.println("Жёлтый");
        }else if (str == 4){
            System.out.println("Зелёный");
        }else if (str == 5){
            System.out.println("Синий");
        }else if (str == 6){
            System.out.println("Фиолетовый");
        }else if (str == 7) {
            System.out.println("Оливковый");//Жёлтый + Зелёный
        }else {
            System.out.println("Введите цифру от 1 до 7");
        }
    }
}





