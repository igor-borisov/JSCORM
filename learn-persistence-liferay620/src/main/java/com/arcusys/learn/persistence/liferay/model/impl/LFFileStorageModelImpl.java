package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFFileStorage;
import com.arcusys.learn.persistence.liferay.model.LFFileStorageModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LFFileStorage service. Represents a row in the &quot;Learn_LFFileStorage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFFileStorageModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFFileStorageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFFileStorageImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFFileStorage
 * @see com.arcusys.learn.persistence.liferay.model.LFFileStorageModel
 * @generated
 */
public class LFFileStorageModelImpl extends BaseModelImpl<LFFileStorage>
    implements LFFileStorageModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f file storage model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFFileStorage} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFFileStorage";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "filename", Types.VARCHAR },
            { "content", Types.CLOB }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFFileStorage (id_ LONG not null primary key,filename VARCHAR(3000) null,content TEXT null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFFileStorage";
    public static final String ORDER_BY_JPQL = " ORDER BY lfFileStorage.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFFileStorage.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFFileStorage"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFFileStorage"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFFileStorage"),
            true);
    public static long FILENAME_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFFileStorage"));
    private static ClassLoader _classLoader = LFFileStorage.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFFileStorage.class
        };
    private long _id;
    private String _filename;
    private String _originalFilename;
    private String _content;
    private long _columnBitmask;
    private LFFileStorage _escapedModel;

    public LFFileStorageModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LFFileStorage.class;
    }

    @Override
    public String getModelClassName() {
        return LFFileStorage.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("filename", getFilename());
        attributes.put("content", getContent());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String filename = (String) attributes.get("filename");

        if (filename != null) {
            setFilename(filename);
        }

        String content = (String) attributes.get("content");

        if (content != null) {
            setContent(content);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @Override
    public String getFilename() {
        if (_filename == null) {
            return StringPool.BLANK;
        } else {
            return _filename;
        }
    }

    @Override
    public void setFilename(String filename) {
        _columnBitmask |= FILENAME_COLUMN_BITMASK;

        if (_originalFilename == null) {
            _originalFilename = _filename;
        }

        _filename = filename;
    }

    public String getOriginalFilename() {
        return GetterUtil.getString(_originalFilename);
    }

    @Override
    public String getContent() {
        if (_content == null) {
            return StringPool.BLANK;
        } else {
            return _content;
        }
    }

    @Override
    public void setContent(String content) {
        _content = content;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFFileStorage.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFFileStorage toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFFileStorage) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFFileStorageImpl lfFileStorageImpl = new LFFileStorageImpl();

        lfFileStorageImpl.setId(getId());
        lfFileStorageImpl.setFilename(getFilename());
        lfFileStorageImpl.setContent(getContent());

        lfFileStorageImpl.resetOriginalValues();

        return lfFileStorageImpl;
    }

    @Override
    public int compareTo(LFFileStorage lfFileStorage) {
        long primaryKey = lfFileStorage.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFFileStorage)) {
            return false;
        }

        LFFileStorage lfFileStorage = (LFFileStorage) obj;

        long primaryKey = lfFileStorage.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFFileStorageModelImpl lfFileStorageModelImpl = this;

        lfFileStorageModelImpl._originalFilename = lfFileStorageModelImpl._filename;

        lfFileStorageModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFFileStorage> toCacheModel() {
        LFFileStorageCacheModel lfFileStorageCacheModel = new LFFileStorageCacheModel();

        lfFileStorageCacheModel.id = getId();

        lfFileStorageCacheModel.filename = getFilename();

        String filename = lfFileStorageCacheModel.filename;

        if ((filename != null) && (filename.length() == 0)) {
            lfFileStorageCacheModel.filename = null;
        }

        lfFileStorageCacheModel.content = getContent();

        String content = lfFileStorageCacheModel.content;

        if ((content != null) && (content.length() == 0)) {
            lfFileStorageCacheModel.content = null;
        }

        return lfFileStorageCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", filename=");
        sb.append(getFilename());
        sb.append(", content=");
        sb.append(getContent());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFFileStorage");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>filename</column-name><column-value><![CDATA[");
        sb.append(getFilename());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>content</column-name><column-value><![CDATA[");
        sb.append(getContent());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}