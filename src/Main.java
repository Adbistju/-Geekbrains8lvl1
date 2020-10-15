import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class Main {

    public static void main(String[] args) throws Exception {
        new Calculate();
    }
    public Object sum() throws Exception{
        Object one = Boolen.str;

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object expResult1 = scriptEngine.eval((String) one);
        Boolen.str=expResult1;
        return expResult1;
    }
}