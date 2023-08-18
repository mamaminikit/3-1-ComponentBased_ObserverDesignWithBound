/* Kitthanya Teachanontkullawat (Mine) 64050027 
 * Bound Properties */
package resultobserverWithbound;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/*
 * @author mmmaimankarae
 */
public class LivedScoreBean {
    
    private String scoreLine;

    public static final String PROP_SCORELINE = "scoreLine";

    /* method สำหรับผู้ต้องการทราบผลล่าสุด */
    public String getScoreLine() {
        return scoreLine;
    }

    /* รับผลล่าสุด */
    public void setScoreLine(String scoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = scoreLine;
        propertyChangeSupport.firePropertyChange(PROP_SCORELINE, oldScoreLine, scoreLine);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /* ลงทะเบียน */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /* ถอนการลงทะเบียน */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
