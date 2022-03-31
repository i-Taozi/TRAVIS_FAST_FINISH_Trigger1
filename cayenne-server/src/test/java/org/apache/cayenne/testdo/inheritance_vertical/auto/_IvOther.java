package org.apache.cayenne.testdo.inheritance_vertical.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.testdo.inheritance_vertical.IvImpl;
import org.apache.cayenne.testdo.inheritance_vertical.IvImplWithLock;

/**
 * Class _IvOther was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IvOther extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final ListProperty<IvImpl> IMPLS = PropertyFactory.createList("impls", IvImpl.class);
    public static final ListProperty<IvImplWithLock> IMPLS_WITH_LOCK = PropertyFactory.createList("implsWithLock", IvImplWithLock.class);

    protected String name;

    protected Object impls;
    protected Object implsWithLock;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void addToImpls(IvImpl obj) {
        addToManyTarget("impls", obj, true);
    }

    public void removeFromImpls(IvImpl obj) {
        removeToManyTarget("impls", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<IvImpl> getImpls() {
        return (List<IvImpl>)readProperty("impls");
    }

    public void addToImplsWithLock(IvImplWithLock obj) {
        addToManyTarget("implsWithLock", obj, true);
    }

    public void removeFromImplsWithLock(IvImplWithLock obj) {
        removeToManyTarget("implsWithLock", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<IvImplWithLock> getImplsWithLock() {
        return (List<IvImplWithLock>)readProperty("implsWithLock");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "impls":
                return this.impls;
            case "implsWithLock":
                return this.implsWithLock;
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
            case "name":
                this.name = (String)val;
                break;
            case "impls":
                this.impls = val;
                break;
            case "implsWithLock":
                this.implsWithLock = val;
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
        out.writeObject(this.name);
        out.writeObject(this.impls);
        out.writeObject(this.implsWithLock);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.name = (String)in.readObject();
        this.impls = in.readObject();
        this.implsWithLock = in.readObject();
    }

}
