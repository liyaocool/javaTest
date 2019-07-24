package hero;

import hero.attribute.Attribute;
import hero.skill.Skill;

public class Hero {
    private Attribute attr = new Attribute();
    private Skill passive = new Skill(); //被动技能
    private Skill skill_1 = new Skill(); //1技能
    private Skill skill_2 = new Skill(); //2技能
    private Skill skill_3 = new Skill(); //3技能
    private Skill skill_4 = new Skill(); //4技能

    //初始化英雄属性
    public void initialAttr(int id, String name) {
        attr.id = id;
        attr.name = name;
    }

    //初始技能
    public void initialSkill(int skillNum, String name, double damage, String detail) {
        switch (skillNum) {
            case 0:
                passive.name = name;
                passive.damage = damage;
                passive.detail = detail;
                break;
            case 1:
                skill_1.name = name;
                skill_1.damage = damage;
                skill_1.detail = detail;
                break;
            case 2:
                skill_2.name = name;
                skill_2.damage = damage;
                skill_2.detail = detail;
                break;
            case 3:
                skill_3.name = name;
                skill_3.damage = damage;
                skill_3.detail = detail;
                break;
            case 4:
                skill_4.name = name;
                skill_4.damage = damage;
                skill_4.detail = detail;
                break;
        }
    }

    //释放技能
    public void ReleaseSkill(int skillNum) {
        switch (skillNum) {
            case 0:
                System.out.println(attr.name+":释放了\"" + passive.name + "\"造成" + passive.damage + "伤害");
                break;
            case 1:
                System.out.println(attr.name+":释放了\"" + skill_1.name + "\"造成" + skill_1.damage + "伤害");
                break;
            case 2:
                System.out.println(attr.name+":释放了\"" + skill_2.name + "\"造成" + skill_2.damage + "伤害");
                break;
            case 3:
                System.out.println(attr.name+":释放了\"" + skill_3.name + "\"造成" + skill_3.damage + "伤害");
                break;
            case 4:
                System.out.println(attr.name+":释放了\"" + skill_4.name + "\"造成" + skill_4.damage + "伤害");
                break;
        }
    }


}
