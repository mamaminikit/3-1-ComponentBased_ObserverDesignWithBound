/* Kitthanya Teachanontkullawat (Mine) 64050027 
 * Bound Properties */
package resultobserverWithbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * @author mmmaimankarae
 */
public class Subscriber implements PropertyChangeListener {
    /* ต้องการให้แสดงผลล่าสุดยังไง */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: " + evt.getNewValue());
    }
    
}
