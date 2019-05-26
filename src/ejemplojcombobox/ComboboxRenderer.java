package ejemplojcombobox;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author root
 */
public class ComboboxRenderer extends JLabel implements ListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, 
                                                  boolean isSelected, boolean cellHasFocus) {
        
        Item i = (Item) value;
        int selectIndex = i.getId();
                
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());        
        }else{
            setBackground(Color.white);
            setForeground(list.getForeground());            
        }
        

        ImageIcon icon = frameInicio.itemImages[selectIndex];
        String name = frameInicio.itemNames[selectIndex];
        
        setIcon(icon);
        
        if(icon!=null){
           setText(name);
        }else{
            setText("(Imagen no disponible) "+name);
        }

        
        
        return this;

    }
    
}
