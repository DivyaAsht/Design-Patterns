import java.util.Hashtable;

public class MonsterRegistry {
    static Hashtable <String, Monster> monsterlist = new Hashtable<String, Monster>();
    static Monster getmonster(String id){
        Monster m = monsterlist.get(id);
        return ((Monster)m.clone());
    }

static void loaddata(){
    BirdMonster bm = new BirdMonster("Bird Monster");
    bm.setid("1");
    monsterlist.put(bm.getid(),bm);
    FishMonster fm = new FishMonster("Fish Monster");
    bm.setid("2");
    monsterlist.put(fm.getid(),fm);
}
}
