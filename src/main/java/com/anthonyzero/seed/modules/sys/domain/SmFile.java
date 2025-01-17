package com.anthonyzero.seed.modules.sys.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sm_file
 */
public class SmFile {
    /**
     * Database Column Remarks:
     *   文件ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_file.file_id
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    private Long fileId;

    /**
     * Database Column Remarks:
     *   文件名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_file.file_name
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    private String fileName;

    /**
     * Database Column Remarks:
     *   文件签名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_file.file_sign
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    private String fileSign;

    /**
     * Database Column Remarks:
     *   文件类型:1 图片2 文档3 其他
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_file.file_type
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    private Integer fileType;

    /**
     * Database Column Remarks:
     *   URL类型 1本地 2*云
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_file.url_type
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    private Integer urlType;

    /**
     * Database Column Remarks:
     *   文件路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_file.file_url
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    private String fileUrl;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sm_file.create_time
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_file.file_id
     *
     * @return the value of sm_file.file_id
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_file.file_id
     *
     * @param fileId the value for sm_file.file_id
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_file.file_name
     *
     * @return the value of sm_file.file_name
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_file.file_name
     *
     * @param fileName the value for sm_file.file_name
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_file.file_sign
     *
     * @return the value of sm_file.file_sign
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public String getFileSign() {
        return fileSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_file.file_sign
     *
     * @param fileSign the value for sm_file.file_sign
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public void setFileSign(String fileSign) {
        this.fileSign = fileSign == null ? null : fileSign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_file.file_type
     *
     * @return the value of sm_file.file_type
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public Integer getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_file.file_type
     *
     * @param fileType the value for sm_file.file_type
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_file.url_type
     *
     * @return the value of sm_file.url_type
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public Integer getUrlType() {
        return urlType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_file.url_type
     *
     * @param urlType the value for sm_file.url_type
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_file.file_url
     *
     * @return the value of sm_file.file_url
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_file.file_url
     *
     * @param fileUrl the value for sm_file.file_url
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sm_file.create_time
     *
     * @return the value of sm_file.create_time
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sm_file.create_time
     *
     * @param createTime the value for sm_file.create_time
     *
     * @mbg.generated Thu Jul 12 11:28:08 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table sm_file
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        fileId("file_id", "fileId", "BIGINT", false),
        fileName("file_name", "fileName", "VARCHAR", false),
        fileSign("file_sign", "fileSign", "VARCHAR", false),
        fileType("file_type", "fileType", "INTEGER", false),
        urlType("url_type", "urlType", "INTEGER", false),
        fileUrl("file_url", "fileUrl", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sm_file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}