package jia.dong.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("小乔");

//        hero.setSkill(new SkillImpl());
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("飞扇");
            }
        });
        hero.attack();
    }
}
