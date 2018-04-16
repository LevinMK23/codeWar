package code.cv;

import java.util.HashMap;

public class MyCV {

    public static void main(String[] args) {
        MyCV cv = new MyCV();
        cv
                .eduInItmo(cv)
                .eduInItmo(cv)
                .eduInItmo(cv)
                .eduInItmo(cv)
                .eduInItmo(cv)
                .eduInItmo(cv)
                .send();
    }

    private static class SkillMatrix{
        private int mathmatic, programming, phisic, softskills;

        public SkillMatrix() {
            this.mathmatic = 0;
            this.programming = 0;
            this.phisic = 0;
            this.softskills = 100;
        }

        public int getMathmatic() {
            return mathmatic;
        }

        public int getProgramming() {
            return programming;
        }

        public int getPhisic() {
            return phisic;
        }

        public int getSoftskills() {
            return softskills;
        }

        public void setMathmatic(int mathmatic) {
            this.mathmatic = mathmatic;
        }

        public void setProgramming(int programming) {
            this.programming = programming;
        }

        public void setPhisic(int phisic) {
            this.phisic = phisic;
        }

        public void setSoftskills(int softskills) {
            this.softskills = softskills;
        }
    }
    public final String birthDate = "23.06.1990";
    public String city;
    public final String birthCity = "Sochi";
    private SkillMatrix skills;

    public MyCV() {
        this.city = "St. Petersburg";
        this.skills = new SkillMatrix();
    }
    private void send() {
        HashMap<String, Thread> map = new HashMap<>();
        while (map.isEmpty()) {
            Thread tr = new Thread(() -> {
                if(!map.containsKey(Thread.currentThread().getName())){
                    map.put(Thread.currentThread().getName(),
                            Thread.currentThread());
                }
                else map.remove(Thread.currentThread().getName());
            });
        }
        System.out.println("Good day guys!");
    }

    private MyCV eduInItmo(MyCV cv){
        cv.skills.setMathmatic(skills.getMathmatic() + 50);
        cv.skills.setProgramming(skills.getProgramming() + 100);
        cv.skills.setPhisic(skills.getPhisic() + 15);
        cv.skills.setSoftskills(skills.getSoftskills() - 50);
        return cv;
    }
}
