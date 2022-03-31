package org.apache.cayenne.testdo.meaningful_pk.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.testdo.meaningful_pk.MeaningfulPkDep2;

/**
 * Class _MeaningfulPk was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MeaningfulPk extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String PK_PK_COLUMN = "PK";

    public static final StringProperty<String> PK = PropertyFactory.createString("pk", String.class);
    public static final EntityProperty<MeaningfulPkDep2> MEANINGFUL_PK_DEP2S = PropertyFactory.createEntity("meaningfulPkDep2s", MeaningfulPkDep2.class);

    protected String pk;

    protected Object meaningfulPkDep2s;

    public void setPk(String pk) {
        beforePropertyWrite("pk", this.pk, pk);
        this.pk = pk;
    }

    public String getPk() {
        beforePropertyRead("pk");
        return this.pk;
    }

    public void setMeaningfulPkDep2s(MeaningfulPkDep2 meaningfulPkDep2s) {
        setToOneTarget("meaningfulPkDep2s", meaningfulPkDep2s, true);
    }

    public MeaningfulPkDep2 getMeaningfulPkDep2s() {
        return (MeaningfulPkDep2)readProperty("meaningfulPkDep2s");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "pk":
                return this.pk;
            case "meaningfulPkDep2s":
                return this.meaningfulPkDep2s;
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
            case "pk":
                this.pk = (String)val;
                break;
            case "meaningfulPkDep2s":
                this.meaningfulPkDep2s = val;
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
        out.writeObject(this.pk);
        out.writeObject(this.meaningfulPkDep2s);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.pk = (String)in.readObject();
        this.meaningfulPkDep2s = in.readObject();
    }

}
