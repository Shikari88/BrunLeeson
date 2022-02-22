package LessonFour;

public class Climber {
    private  String fuiiName;
    private int age;
    private String email;

    public String getFuiiName() {
        return fuiiName;
    }

    public void setFuiiName(String fuiiName) {
        if(fuiiName.isEmpty() || fuiiName.trim().length()<1) {
            //throw new IllegalAccessException("Значение fullname < 1");

        } else {
            this.fuiiName = fuiiName;
        }
    }


}
