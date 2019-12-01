public class MyBear {
    String food2;
    String food;
    String food1;
    String name;

  void setName(String nameBear) {
        name = nameBear;
    }

    void myNameIs() {
        System.out.println("Меня зовут" +" "+ name);

    }
    void setFood(String foodBear, String foodBear1, String foodBear2){
      food = foodBear;
      food1 = foodBear1;
      food2 = foodBear2;
    }
    void iEat(){
        System.out.println("Я питаюсь" +" "+ food +"  "+ food1 +"  "+ food2);
    }
}