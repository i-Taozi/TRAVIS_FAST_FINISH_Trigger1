package org.apache.cayenne.testdo.numeric_types.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.BaseProperty;
import org.apache.cayenne.exp.property.PropertyFactory;

/**
 * Class _BitTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BitTestEntity extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final BaseProperty<Boolean> BIT_COLUMN = PropertyFactory.createBase("bitColumn", Boolean.class);

    protected Boolean bitColumn;


    public void setBitColumn(Boolean bitColumn) {
        beforePropertyWrite("bitColumn", this.bitColumn, bitColumn);
        this.bitColumn = bitColumn;
    }

    public Boolean getBitColumn() {
        beforePropertyRead("bitColumn");
        return this.bitColumn;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "bitColumn":
                return this.bitColumn;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "bitColumn":
                this.bitColumn = (Boolean)val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.bitColumn);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.bitColumn = (Boolean)in.readObject();
    }

}
