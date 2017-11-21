package github.tornaco.xposedmoduletest.bean;

import android.content.ComponentName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "COMPONENT_SETTINGS".
 */
@Entity
public class ComponentSettings {

    @Id
    private Integer id;
    private String packageName;
    private String className;
    private Boolean allow;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated(hash = 8329866)
    public ComponentSettings() {
    }

    public ComponentSettings(Integer id) {
        this.id = id;
    }

    @Generated(hash = 370333133)
    public ComponentSettings(Integer id, String packageName, String className, Boolean allow) {
        this.id = id;
        this.packageName = packageName;
        this.className = className;
        this.allow = allow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Boolean getAllow() {
        return allow;
    }

    public void setAllow(Boolean allow) {
        this.allow = allow;
    }

    // KEEP METHODS - put your custom methods here
    public boolean is(ComponentName componentName) {
        return componentName.getPackageName().equals(packageName)
                && componentName.getClassName().equals(className);
    }

    @Override
    public String toString() {
        return "ComponentSettings{" +
                "id=" + id +
                ", packageName='" + packageName + '\'' +
                ", className='" + className + '\'' +
                ", allow=" + allow +
                '}';
    }
    // KEEP METHODS END

}
