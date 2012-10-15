
package com.force.aus.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_OR_NONE_OPERATION_ROLLED_BACK"/>
 *     &lt;enumeration value="ALREADY_IN_PROCESS"/>
 *     &lt;enumeration value="ASSIGNEE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="BAD_CUSTOM_ENTITY_PARENT_DOMAIN"/>
 *     &lt;enumeration value="BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED"/>
 *     &lt;enumeration value="CANNOT_CASCADE_PRODUCT_ACTIVE"/>
 *     &lt;enumeration value="CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE"/>
 *     &lt;enumeration value="CANNOT_DEACTIVATE_DIVISION"/>
 *     &lt;enumeration value="CANNOT_DELETE_LAST_DATED_CONVERSION_RATE"/>
 *     &lt;enumeration value="CANNOT_DELETE_MANAGED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_DISABLE_LAST_ADMIN"/>
 *     &lt;enumeration value="CANNOT_ENABLE_IP_RESTRICT_REQUESTS"/>
 *     &lt;enumeration value="CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY"/>
 *     &lt;enumeration value="CANNOT_MODIFY_MANAGED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_RENAME_APEX_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_RENAME_APEX_REFERENCED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_RENAME_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_RENAME_REFERENCED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_REPARENT_RECORD"/>
 *     &lt;enumeration value="CANNOT_UPDATE_CONVERTED_LEAD"/>
 *     &lt;enumeration value="CANT_DISABLE_CORP_CURRENCY"/>
 *     &lt;enumeration value="CANT_UNSET_CORP_CURRENCY"/>
 *     &lt;enumeration value="CHILD_SHARE_FAILS_PARENT"/>
 *     &lt;enumeration value="CIRCULAR_DEPENDENCY"/>
 *     &lt;enumeration value="COMMUNITY_NOT_ACCESSIBLE"/>
 *     &lt;enumeration value="CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="CUSTOM_ENTITY_OR_FIELD_LIMIT"/>
 *     &lt;enumeration value="CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="CUSTOM_INDEX_EXISTS"/>
 *     &lt;enumeration value="CUSTOM_LINK_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="CUSTOM_TAB_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="DELETE_FAILED"/>
 *     &lt;enumeration value="DELETE_OPERATION_TOO_LARGE"/>
 *     &lt;enumeration value="DELETE_REQUIRED_ON_CASCADE"/>
 *     &lt;enumeration value="DEPENDENCY_EXISTS"/>
 *     &lt;enumeration value="DUPLICATE_CASE_SOLUTION"/>
 *     &lt;enumeration value="DUPLICATE_COMM_NICKNAME"/>
 *     &lt;enumeration value="DUPLICATE_CUSTOM_ENTITY_DEFINITION"/>
 *     &lt;enumeration value="DUPLICATE_CUSTOM_TAB_MOTIF"/>
 *     &lt;enumeration value="DUPLICATE_DEVELOPER_NAME"/>
 *     &lt;enumeration value="DUPLICATE_EXTERNAL_ID"/>
 *     &lt;enumeration value="DUPLICATE_MASTER_LABEL"/>
 *     &lt;enumeration value="DUPLICATE_SENDER_DISPLAY_NAME"/>
 *     &lt;enumeration value="DUPLICATE_USERNAME"/>
 *     &lt;enumeration value="DUPLICATE_VALUE"/>
 *     &lt;enumeration value="EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR"/>
 *     &lt;enumeration value="EMPTY_SCONTROL_FILE_NAME"/>
 *     &lt;enumeration value="ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE"/>
 *     &lt;enumeration value="ENTITY_IS_ARCHIVED"/>
 *     &lt;enumeration value="ENTITY_IS_DELETED"/>
 *     &lt;enumeration value="ENTITY_IS_LOCKED"/>
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT"/>
 *     &lt;enumeration value="ERROR_IN_MAILER"/>
 *     &lt;enumeration value="FAILED_ACTIVATION"/>
 *     &lt;enumeration value="FIELD_CUSTOM_VALIDATION_EXCEPTION"/>
 *     &lt;enumeration value="FIELD_FILTER_VALIDATION_EXCEPTION"/>
 *     &lt;enumeration value="FIELD_INTEGRITY_EXCEPTION"/>
 *     &lt;enumeration value="FILTERED_LOOKUP_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="HTML_FILE_UPLOAD_NOT_ALLOWED"/>
 *     &lt;enumeration value="IMAGE_TOO_LARGE"/>
 *     &lt;enumeration value="INACTIVE_OWNER_OR_USER"/>
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY"/>
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_OR_READONLY"/>
 *     &lt;enumeration value="INVALID_ACCESS_LEVEL"/>
 *     &lt;enumeration value="INVALID_ARGUMENT_TYPE"/>
 *     &lt;enumeration value="INVALID_ASSIGNEE_TYPE"/>
 *     &lt;enumeration value="INVALID_ASSIGNMENT_RULE"/>
 *     &lt;enumeration value="INVALID_BATCH_OPERATION"/>
 *     &lt;enumeration value="INVALID_CONTENT_TYPE"/>
 *     &lt;enumeration value="INVALID_CREDIT_CARD_INFO"/>
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_KEY"/>
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD"/>
 *     &lt;enumeration value="INVALID_CURRENCY_CONV_RATE"/>
 *     &lt;enumeration value="INVALID_CURRENCY_CORP_RATE"/>
 *     &lt;enumeration value="INVALID_CURRENCY_ISO"/>
 *     &lt;enumeration value="INVALID_DATA_CATEGORY_GROUP_REFERENCE"/>
 *     &lt;enumeration value="INVALID_DATA_URI"/>
 *     &lt;enumeration value="INVALID_EMAIL_ADDRESS"/>
 *     &lt;enumeration value="INVALID_EMPTY_KEY_OWNER"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="INVALID_FIELD_FOR_INSERT_UPDATE"/>
 *     &lt;enumeration value="INVALID_FIELD_WHEN_USING_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_FILTER_ACTION"/>
 *     &lt;enumeration value="INVALID_GOOGLE_DOCS_URL"/>
 *     &lt;enumeration value="INVALID_ID_FIELD"/>
 *     &lt;enumeration value="INVALID_INET_ADDRESS"/>
 *     &lt;enumeration value="INVALID_LINEITEM_CLONE_STATE"/>
 *     &lt;enumeration value="INVALID_MASTER_OR_TRANSLATED_SOLUTION"/>
 *     &lt;enumeration value="INVALID_MESSAGE_ID_REFERENCE"/>
 *     &lt;enumeration value="INVALID_OPERATION"/>
 *     &lt;enumeration value="INVALID_OPERATOR"/>
 *     &lt;enumeration value="INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST"/>
 *     &lt;enumeration value="INVALID_PACKAGE_VERSION"/>
 *     &lt;enumeration value="INVALID_PARTNER_NETWORK_STATUS"/>
 *     &lt;enumeration value="INVALID_PERSON_ACCOUNT_OPERATION"/>
 *     &lt;enumeration value="INVALID_QUERY_LOCATOR"/>
 *     &lt;enumeration value="INVALID_READ_ONLY_USER_DML"/>
 *     &lt;enumeration value="INVALID_SAVE_AS_ACTIVITY_FLAG"/>
 *     &lt;enumeration value="INVALID_SESSION_ID"/>
 *     &lt;enumeration value="INVALID_SETUP_OWNER"/>
 *     &lt;enumeration value="INVALID_STATUS"/>
 *     &lt;enumeration value="INVALID_TYPE"/>
 *     &lt;enumeration value="INVALID_TYPE_FOR_OPERATION"/>
 *     &lt;enumeration value="INVALID_TYPE_ON_FIELD_IN_RECORD"/>
 *     &lt;enumeration value="IP_RANGE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="LICENSE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="LIGHT_PORTAL_USER_EXCEPTION"/>
 *     &lt;enumeration value="LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="MALFORMED_ID"/>
 *     &lt;enumeration value="MANAGER_NOT_DEFINED"/>
 *     &lt;enumeration value="MASSMAIL_RETRY_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="MASS_MAIL_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="MAXIMUM_CCEMAILS_EXCEEDED"/>
 *     &lt;enumeration value="MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED"/>
 *     &lt;enumeration value="MAXIMUM_HIERARCHY_LEVELS_REACHED"/>
 *     &lt;enumeration value="MAXIMUM_SIZE_OF_ATTACHMENT"/>
 *     &lt;enumeration value="MAXIMUM_SIZE_OF_DOCUMENT"/>
 *     &lt;enumeration value="MAX_ACTIONS_PER_RULE_EXCEEDED"/>
 *     &lt;enumeration value="MAX_ACTIVE_RULES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_APPROVAL_STEPS_EXCEEDED"/>
 *     &lt;enumeration value="MAX_FORMULAS_PER_RULE_EXCEEDED"/>
 *     &lt;enumeration value="MAX_RULES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_RULE_ENTRIES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_TASK_DESCRIPTION_EXCEEEDED"/>
 *     &lt;enumeration value="MAX_TM_RULES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_TM_RULE_ITEMS_EXCEEDED"/>
 *     &lt;enumeration value="MERGE_FAILED"/>
 *     &lt;enumeration value="MISSING_ARGUMENT"/>
 *     &lt;enumeration value="MIXED_DML_OPERATION"/>
 *     &lt;enumeration value="NONUNIQUE_SHIPPING_ADDRESS"/>
 *     &lt;enumeration value="NO_APPLICABLE_PROCESS"/>
 *     &lt;enumeration value="NO_ATTACHMENT_PERMISSION"/>
 *     &lt;enumeration value="NO_INACTIVE_DIVISION_MEMBERS"/>
 *     &lt;enumeration value="NO_MASS_MAIL_PERMISSION"/>
 *     &lt;enumeration value="NUMBER_OUTSIDE_VALID_RANGE"/>
 *     &lt;enumeration value="NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED"/>
 *     &lt;enumeration value="OPTED_OUT_OF_MASS_MAIL"/>
 *     &lt;enumeration value="OP_WITH_INVALID_USER_TYPE_EXCEPTION"/>
 *     &lt;enumeration value="PACKAGE_LICENSE_REQUIRED"/>
 *     &lt;enumeration value="PORTAL_NO_ACCESS"/>
 *     &lt;enumeration value="PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT"/>
 *     &lt;enumeration value="PRIVATE_CONTACT_ON_ASSET"/>
 *     &lt;enumeration value="QUERY_TIMEOUT"/>
 *     &lt;enumeration value="RECORD_IN_USE_BY_WORKFLOW"/>
 *     &lt;enumeration value="REQUEST_RUNNING_TOO_LONG"/>
 *     &lt;enumeration value="REQUIRED_FEATURE_MISSING"/>
 *     &lt;enumeration value="REQUIRED_FIELD_MISSING"/>
 *     &lt;enumeration value="SELF_REFERENCE_FROM_TRIGGER"/>
 *     &lt;enumeration value="SHARE_NEEDED_FOR_CHILD_OWNER"/>
 *     &lt;enumeration value="SINGLE_EMAIL_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="STANDARD_PRICE_NOT_DEFINED"/>
 *     &lt;enumeration value="STORAGE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="STRING_TOO_LONG"/>
 *     &lt;enumeration value="TABSET_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="TEMPLATE_NOT_ACTIVE"/>
 *     &lt;enumeration value="TERRITORY_REALIGN_IN_PROGRESS"/>
 *     &lt;enumeration value="TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET"/>
 *     &lt;enumeration value="TOO_MANY_APEX_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_ENUM_VALUE"/>
 *     &lt;enumeration value="TRANSFER_REQUIRES_READ"/>
 *     &lt;enumeration value="UNABLE_TO_LOCK_ROW"/>
 *     &lt;enumeration value="UNAVAILABLE_RECORDTYPE_EXCEPTION"/>
 *     &lt;enumeration value="UNDELETE_FAILED"/>
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/>
 *     &lt;enumeration value="UNSPECIFIED_EMAIL_ADDRESS"/>
 *     &lt;enumeration value="UNSUPPORTED_APEX_TRIGGER_OPERATON"/>
 *     &lt;enumeration value="UNVERIFIED_SENDER_ADDRESS"/>
 *     &lt;enumeration value="USER_OWNS_PORTAL_ACCOUNT_EXCEPTION"/>
 *     &lt;enumeration value="USER_WITH_APEX_SHARES_EXCEPTION"/>
 *     &lt;enumeration value="WEBLINK_SIZE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="WRONG_CONTROLLER_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusCode", namespace = "urn:enterprise.soap.sforce.com")
@XmlEnum
public enum StatusCodeType {

    @XmlEnumValue("ALL_OR_NONE_OPERATION_ROLLED_BACK")
    ALL___OR___NONE___OPERATION___ROLLED___BACK("ALL_OR_NONE_OPERATION_ROLLED_BACK"),
    @XmlEnumValue("ALREADY_IN_PROCESS")
    ALREADY___IN___PROCESS("ALREADY_IN_PROCESS"),
    @XmlEnumValue("ASSIGNEE_TYPE_REQUIRED")
    ASSIGNEE___TYPE___REQUIRED("ASSIGNEE_TYPE_REQUIRED"),
    @XmlEnumValue("BAD_CUSTOM_ENTITY_PARENT_DOMAIN")
    BAD___CUSTOM___ENTITY___PARENT___DOMAIN("BAD_CUSTOM_ENTITY_PARENT_DOMAIN"),
    @XmlEnumValue("BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED")
    BCC___NOT___ALLOWED___IF___BCC___COMPLIANCE___ENABLED("BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED"),
    @XmlEnumValue("CANNOT_CASCADE_PRODUCT_ACTIVE")
    CANNOT___CASCADE___PRODUCT___ACTIVE("CANNOT_CASCADE_PRODUCT_ACTIVE"),
    @XmlEnumValue("CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD")
    CANNOT___CHANGE___FIELD___TYPE___OF___APEX___REFERENCED___FIELD("CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD"),
    @XmlEnumValue("CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD")
    CANNOT___CHANGE___FIELD___TYPE___OF___REFERENCED___FIELD("CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD"),
    @XmlEnumValue("CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE")
    CANNOT___CREATE___ANOTHER___MANAGED___PACKAGE("CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE"),
    @XmlEnumValue("CANNOT_DEACTIVATE_DIVISION")
    CANNOT___DEACTIVATE___DIVISION("CANNOT_DEACTIVATE_DIVISION"),
    @XmlEnumValue("CANNOT_DELETE_LAST_DATED_CONVERSION_RATE")
    CANNOT___DELETE___LAST___DATED___CONVERSION___RATE("CANNOT_DELETE_LAST_DATED_CONVERSION_RATE"),
    @XmlEnumValue("CANNOT_DELETE_MANAGED_OBJECT")
    CANNOT___DELETE___MANAGED___OBJECT("CANNOT_DELETE_MANAGED_OBJECT"),
    @XmlEnumValue("CANNOT_DISABLE_LAST_ADMIN")
    CANNOT___DISABLE___LAST___ADMIN("CANNOT_DISABLE_LAST_ADMIN"),
    @XmlEnumValue("CANNOT_ENABLE_IP_RESTRICT_REQUESTS")
    CANNOT___ENABLE___IP___RESTRICT___REQUESTS("CANNOT_ENABLE_IP_RESTRICT_REQUESTS"),
    @XmlEnumValue("CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY")
    CANNOT___INSERT___UPDATE___ACTIVATE___ENTITY("CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY"),
    @XmlEnumValue("CANNOT_MODIFY_MANAGED_OBJECT")
    CANNOT___MODIFY___MANAGED___OBJECT("CANNOT_MODIFY_MANAGED_OBJECT"),
    @XmlEnumValue("CANNOT_RENAME_APEX_REFERENCED_FIELD")
    CANNOT___RENAME___APEX___REFERENCED___FIELD("CANNOT_RENAME_APEX_REFERENCED_FIELD"),
    @XmlEnumValue("CANNOT_RENAME_APEX_REFERENCED_OBJECT")
    CANNOT___RENAME___APEX___REFERENCED___OBJECT("CANNOT_RENAME_APEX_REFERENCED_OBJECT"),
    @XmlEnumValue("CANNOT_RENAME_REFERENCED_FIELD")
    CANNOT___RENAME___REFERENCED___FIELD("CANNOT_RENAME_REFERENCED_FIELD"),
    @XmlEnumValue("CANNOT_RENAME_REFERENCED_OBJECT")
    CANNOT___RENAME___REFERENCED___OBJECT("CANNOT_RENAME_REFERENCED_OBJECT"),
    @XmlEnumValue("CANNOT_REPARENT_RECORD")
    CANNOT___REPARENT___RECORD("CANNOT_REPARENT_RECORD"),
    @XmlEnumValue("CANNOT_UPDATE_CONVERTED_LEAD")
    CANNOT___UPDATE___CONVERTED___LEAD("CANNOT_UPDATE_CONVERTED_LEAD"),
    @XmlEnumValue("CANT_DISABLE_CORP_CURRENCY")
    CANT___DISABLE___CORP___CURRENCY("CANT_DISABLE_CORP_CURRENCY"),
    @XmlEnumValue("CANT_UNSET_CORP_CURRENCY")
    CANT___UNSET___CORP___CURRENCY("CANT_UNSET_CORP_CURRENCY"),
    @XmlEnumValue("CHILD_SHARE_FAILS_PARENT")
    CHILD___SHARE___FAILS___PARENT("CHILD_SHARE_FAILS_PARENT"),
    @XmlEnumValue("CIRCULAR_DEPENDENCY")
    CIRCULAR___DEPENDENCY("CIRCULAR_DEPENDENCY"),
    @XmlEnumValue("COMMUNITY_NOT_ACCESSIBLE")
    COMMUNITY___NOT___ACCESSIBLE("COMMUNITY_NOT_ACCESSIBLE"),
    @XmlEnumValue("CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED")
    CUSTOM___CLOB___FIELD___LIMIT___EXCEEDED("CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED"),
    @XmlEnumValue("CUSTOM_ENTITY_OR_FIELD_LIMIT")
    CUSTOM___ENTITY___OR___FIELD___LIMIT("CUSTOM_ENTITY_OR_FIELD_LIMIT"),
    @XmlEnumValue("CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED")
    CUSTOM___FIELD___INDEX___LIMIT___EXCEEDED("CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED"),
    @XmlEnumValue("CUSTOM_INDEX_EXISTS")
    CUSTOM___INDEX___EXISTS("CUSTOM_INDEX_EXISTS"),
    @XmlEnumValue("CUSTOM_LINK_LIMIT_EXCEEDED")
    CUSTOM___LINK___LIMIT___EXCEEDED("CUSTOM_LINK_LIMIT_EXCEEDED"),
    @XmlEnumValue("CUSTOM_TAB_LIMIT_EXCEEDED")
    CUSTOM___TAB___LIMIT___EXCEEDED("CUSTOM_TAB_LIMIT_EXCEEDED"),
    @XmlEnumValue("DELETE_FAILED")
    DELETE___FAILED("DELETE_FAILED"),
    @XmlEnumValue("DELETE_OPERATION_TOO_LARGE")
    DELETE___OPERATION___TOO___LARGE("DELETE_OPERATION_TOO_LARGE"),
    @XmlEnumValue("DELETE_REQUIRED_ON_CASCADE")
    DELETE___REQUIRED___ON___CASCADE("DELETE_REQUIRED_ON_CASCADE"),
    @XmlEnumValue("DEPENDENCY_EXISTS")
    DEPENDENCY___EXISTS("DEPENDENCY_EXISTS"),
    @XmlEnumValue("DUPLICATE_CASE_SOLUTION")
    DUPLICATE___CASE___SOLUTION("DUPLICATE_CASE_SOLUTION"),
    @XmlEnumValue("DUPLICATE_COMM_NICKNAME")
    DUPLICATE___COMM___NICKNAME("DUPLICATE_COMM_NICKNAME"),
    @XmlEnumValue("DUPLICATE_CUSTOM_ENTITY_DEFINITION")
    DUPLICATE___CUSTOM___ENTITY___DEFINITION("DUPLICATE_CUSTOM_ENTITY_DEFINITION"),
    @XmlEnumValue("DUPLICATE_CUSTOM_TAB_MOTIF")
    DUPLICATE___CUSTOM___TAB___MOTIF("DUPLICATE_CUSTOM_TAB_MOTIF"),
    @XmlEnumValue("DUPLICATE_DEVELOPER_NAME")
    DUPLICATE___DEVELOPER___NAME("DUPLICATE_DEVELOPER_NAME"),
    @XmlEnumValue("DUPLICATE_EXTERNAL_ID")
    DUPLICATE___EXTERNAL___ID("DUPLICATE_EXTERNAL_ID"),
    @XmlEnumValue("DUPLICATE_MASTER_LABEL")
    DUPLICATE___MASTER___LABEL("DUPLICATE_MASTER_LABEL"),
    @XmlEnumValue("DUPLICATE_SENDER_DISPLAY_NAME")
    DUPLICATE___SENDER___DISPLAY___NAME("DUPLICATE_SENDER_DISPLAY_NAME"),
    @XmlEnumValue("DUPLICATE_USERNAME")
    DUPLICATE___USERNAME("DUPLICATE_USERNAME"),
    @XmlEnumValue("DUPLICATE_VALUE")
    DUPLICATE___VALUE("DUPLICATE_VALUE"),
    @XmlEnumValue("EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR")
    EMAIL___NOT___PROCESSED___DUE___TO___PRIOR___ERROR("EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR"),
    @XmlEnumValue("EMPTY_SCONTROL_FILE_NAME")
    EMPTY___SCONTROL___FILE___NAME("EMPTY_SCONTROL_FILE_NAME"),
    @XmlEnumValue("ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE")
    ENTITY___FAILED___IFLASTMODIFIED___ON___UPDATE("ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE"),
    @XmlEnumValue("ENTITY_IS_ARCHIVED")
    ENTITY___IS___ARCHIVED("ENTITY_IS_ARCHIVED"),
    @XmlEnumValue("ENTITY_IS_DELETED")
    ENTITY___IS___DELETED("ENTITY_IS_DELETED"),
    @XmlEnumValue("ENTITY_IS_LOCKED")
    ENTITY___IS___LOCKED("ENTITY_IS_LOCKED"),
    @XmlEnumValue("ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT")
    ENVIRONMENT___HUB___MEMBERSHIP___CONFLICT("ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT"),
    @XmlEnumValue("ERROR_IN_MAILER")
    ERROR___IN___MAILER("ERROR_IN_MAILER"),
    @XmlEnumValue("FAILED_ACTIVATION")
    FAILED___ACTIVATION("FAILED_ACTIVATION"),
    @XmlEnumValue("FIELD_CUSTOM_VALIDATION_EXCEPTION")
    FIELD___CUSTOM___VALIDATION___EXCEPTION("FIELD_CUSTOM_VALIDATION_EXCEPTION"),
    @XmlEnumValue("FIELD_FILTER_VALIDATION_EXCEPTION")
    FIELD___FILTER___VALIDATION___EXCEPTION("FIELD_FILTER_VALIDATION_EXCEPTION"),
    @XmlEnumValue("FIELD_INTEGRITY_EXCEPTION")
    FIELD___INTEGRITY___EXCEPTION("FIELD_INTEGRITY_EXCEPTION"),
    @XmlEnumValue("FILTERED_LOOKUP_LIMIT_EXCEEDED")
    FILTERED___LOOKUP___LIMIT___EXCEEDED("FILTERED_LOOKUP_LIMIT_EXCEEDED"),
    @XmlEnumValue("HTML_FILE_UPLOAD_NOT_ALLOWED")
    HTML___FILE___UPLOAD___NOT___ALLOWED("HTML_FILE_UPLOAD_NOT_ALLOWED"),
    @XmlEnumValue("IMAGE_TOO_LARGE")
    IMAGE___TOO___LARGE("IMAGE_TOO_LARGE"),
    @XmlEnumValue("INACTIVE_OWNER_OR_USER")
    INACTIVE___OWNER___OR___USER("INACTIVE_OWNER_OR_USER"),
    @XmlEnumValue("INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY")
    INSUFFICIENT___ACCESS___ON___CROSS___REFERENCE___ENTITY("INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY"),
    @XmlEnumValue("INSUFFICIENT_ACCESS_OR_READONLY")
    INSUFFICIENT___ACCESS___OR___READONLY("INSUFFICIENT_ACCESS_OR_READONLY"),
    @XmlEnumValue("INVALID_ACCESS_LEVEL")
    INVALID___ACCESS___LEVEL("INVALID_ACCESS_LEVEL"),
    @XmlEnumValue("INVALID_ARGUMENT_TYPE")
    INVALID___ARGUMENT___TYPE("INVALID_ARGUMENT_TYPE"),
    @XmlEnumValue("INVALID_ASSIGNEE_TYPE")
    INVALID___ASSIGNEE___TYPE("INVALID_ASSIGNEE_TYPE"),
    @XmlEnumValue("INVALID_ASSIGNMENT_RULE")
    INVALID___ASSIGNMENT___RULE("INVALID_ASSIGNMENT_RULE"),
    @XmlEnumValue("INVALID_BATCH_OPERATION")
    INVALID___BATCH___OPERATION("INVALID_BATCH_OPERATION"),
    @XmlEnumValue("INVALID_CONTENT_TYPE")
    INVALID___CONTENT___TYPE("INVALID_CONTENT_TYPE"),
    @XmlEnumValue("INVALID_CREDIT_CARD_INFO")
    INVALID___CREDIT___CARD___INFO("INVALID_CREDIT_CARD_INFO"),
    @XmlEnumValue("INVALID_CROSS_REFERENCE_KEY")
    INVALID___CROSS___REFERENCE___KEY("INVALID_CROSS_REFERENCE_KEY"),
    @XmlEnumValue("INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD")
    INVALID___CROSS___REFERENCE___TYPE___FOR___FIELD("INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD"),
    @XmlEnumValue("INVALID_CURRENCY_CONV_RATE")
    INVALID___CURRENCY___CONV___RATE("INVALID_CURRENCY_CONV_RATE"),
    @XmlEnumValue("INVALID_CURRENCY_CORP_RATE")
    INVALID___CURRENCY___CORP___RATE("INVALID_CURRENCY_CORP_RATE"),
    @XmlEnumValue("INVALID_CURRENCY_ISO")
    INVALID___CURRENCY___ISO("INVALID_CURRENCY_ISO"),
    @XmlEnumValue("INVALID_DATA_CATEGORY_GROUP_REFERENCE")
    INVALID___DATA___CATEGORY___GROUP___REFERENCE("INVALID_DATA_CATEGORY_GROUP_REFERENCE"),
    @XmlEnumValue("INVALID_DATA_URI")
    INVALID___DATA___URI("INVALID_DATA_URI"),
    @XmlEnumValue("INVALID_EMAIL_ADDRESS")
    INVALID___EMAIL___ADDRESS("INVALID_EMAIL_ADDRESS"),
    @XmlEnumValue("INVALID_EMPTY_KEY_OWNER")
    INVALID___EMPTY___KEY___OWNER("INVALID_EMPTY_KEY_OWNER"),
    @XmlEnumValue("INVALID_FIELD")
    INVALID___FIELD("INVALID_FIELD"),
    @XmlEnumValue("INVALID_FIELD_FOR_INSERT_UPDATE")
    INVALID___FIELD___FOR___INSERT___UPDATE("INVALID_FIELD_FOR_INSERT_UPDATE"),
    @XmlEnumValue("INVALID_FIELD_WHEN_USING_TEMPLATE")
    INVALID___FIELD___WHEN___USING___TEMPLATE("INVALID_FIELD_WHEN_USING_TEMPLATE"),
    @XmlEnumValue("INVALID_FILTER_ACTION")
    INVALID___FILTER___ACTION("INVALID_FILTER_ACTION"),
    @XmlEnumValue("INVALID_GOOGLE_DOCS_URL")
    INVALID___GOOGLE___DOCS___URL("INVALID_GOOGLE_DOCS_URL"),
    @XmlEnumValue("INVALID_ID_FIELD")
    INVALID___ID___FIELD("INVALID_ID_FIELD"),
    @XmlEnumValue("INVALID_INET_ADDRESS")
    INVALID___INET___ADDRESS("INVALID_INET_ADDRESS"),
    @XmlEnumValue("INVALID_LINEITEM_CLONE_STATE")
    INVALID___LINEITEM___CLONE___STATE("INVALID_LINEITEM_CLONE_STATE"),
    @XmlEnumValue("INVALID_MASTER_OR_TRANSLATED_SOLUTION")
    INVALID___MASTER___OR___TRANSLATED___SOLUTION("INVALID_MASTER_OR_TRANSLATED_SOLUTION"),
    @XmlEnumValue("INVALID_MESSAGE_ID_REFERENCE")
    INVALID___MESSAGE___ID___REFERENCE("INVALID_MESSAGE_ID_REFERENCE"),
    @XmlEnumValue("INVALID_OPERATION")
    INVALID___OPERATION("INVALID_OPERATION"),
    @XmlEnumValue("INVALID_OPERATOR")
    INVALID___OPERATOR("INVALID_OPERATOR"),
    @XmlEnumValue("INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST")
    INVALID___OR___NULL___FOR___RESTRICTED___PICKLIST("INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST"),
    @XmlEnumValue("INVALID_PACKAGE_VERSION")
    INVALID___PACKAGE___VERSION("INVALID_PACKAGE_VERSION"),
    @XmlEnumValue("INVALID_PARTNER_NETWORK_STATUS")
    INVALID___PARTNER___NETWORK___STATUS("INVALID_PARTNER_NETWORK_STATUS"),
    @XmlEnumValue("INVALID_PERSON_ACCOUNT_OPERATION")
    INVALID___PERSON___ACCOUNT___OPERATION("INVALID_PERSON_ACCOUNT_OPERATION"),
    @XmlEnumValue("INVALID_QUERY_LOCATOR")
    INVALID___QUERY___LOCATOR("INVALID_QUERY_LOCATOR"),
    @XmlEnumValue("INVALID_READ_ONLY_USER_DML")
    INVALID___READ___ONLY___USER___DML("INVALID_READ_ONLY_USER_DML"),
    @XmlEnumValue("INVALID_SAVE_AS_ACTIVITY_FLAG")
    INVALID___SAVE___AS___ACTIVITY___FLAG("INVALID_SAVE_AS_ACTIVITY_FLAG"),
    @XmlEnumValue("INVALID_SESSION_ID")
    INVALID___SESSION___ID("INVALID_SESSION_ID"),
    @XmlEnumValue("INVALID_SETUP_OWNER")
    INVALID___SETUP___OWNER("INVALID_SETUP_OWNER"),
    @XmlEnumValue("INVALID_STATUS")
    INVALID___STATUS("INVALID_STATUS"),
    @XmlEnumValue("INVALID_TYPE")
    INVALID___TYPE("INVALID_TYPE"),
    @XmlEnumValue("INVALID_TYPE_FOR_OPERATION")
    INVALID___TYPE___FOR___OPERATION("INVALID_TYPE_FOR_OPERATION"),
    @XmlEnumValue("INVALID_TYPE_ON_FIELD_IN_RECORD")
    INVALID___TYPE___ON___FIELD___IN___RECORD("INVALID_TYPE_ON_FIELD_IN_RECORD"),
    @XmlEnumValue("IP_RANGE_LIMIT_EXCEEDED")
    IP___RANGE___LIMIT___EXCEEDED("IP_RANGE_LIMIT_EXCEEDED"),
    @XmlEnumValue("LICENSE_LIMIT_EXCEEDED")
    LICENSE___LIMIT___EXCEEDED("LICENSE_LIMIT_EXCEEDED"),
    @XmlEnumValue("LIGHT_PORTAL_USER_EXCEPTION")
    LIGHT___PORTAL___USER___EXCEPTION("LIGHT_PORTAL_USER_EXCEPTION"),
    @XmlEnumValue("LIMIT_EXCEEDED")
    LIMIT___EXCEEDED("LIMIT_EXCEEDED"),
    @XmlEnumValue("MALFORMED_ID")
    MALFORMED___ID("MALFORMED_ID"),
    @XmlEnumValue("MANAGER_NOT_DEFINED")
    MANAGER___NOT___DEFINED("MANAGER_NOT_DEFINED"),
    @XmlEnumValue("MASSMAIL_RETRY_LIMIT_EXCEEDED")
    MASSMAIL___RETRY___LIMIT___EXCEEDED("MASSMAIL_RETRY_LIMIT_EXCEEDED"),
    @XmlEnumValue("MASS_MAIL_LIMIT_EXCEEDED")
    MASS___MAIL___LIMIT___EXCEEDED("MASS_MAIL_LIMIT_EXCEEDED"),
    @XmlEnumValue("MAXIMUM_CCEMAILS_EXCEEDED")
    MAXIMUM___CCEMAILS___EXCEEDED("MAXIMUM_CCEMAILS_EXCEEDED"),
    @XmlEnumValue("MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED")
    MAXIMUM___DASHBOARD___COMPONENTS___EXCEEDED("MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED"),
    @XmlEnumValue("MAXIMUM_HIERARCHY_LEVELS_REACHED")
    MAXIMUM___HIERARCHY___LEVELS___REACHED("MAXIMUM_HIERARCHY_LEVELS_REACHED"),
    @XmlEnumValue("MAXIMUM_SIZE_OF_ATTACHMENT")
    MAXIMUM___SIZE___OF___ATTACHMENT("MAXIMUM_SIZE_OF_ATTACHMENT"),
    @XmlEnumValue("MAXIMUM_SIZE_OF_DOCUMENT")
    MAXIMUM___SIZE___OF___DOCUMENT("MAXIMUM_SIZE_OF_DOCUMENT"),
    @XmlEnumValue("MAX_ACTIONS_PER_RULE_EXCEEDED")
    MAX___ACTIONS___PER___RULE___EXCEEDED("MAX_ACTIONS_PER_RULE_EXCEEDED"),
    @XmlEnumValue("MAX_ACTIVE_RULES_EXCEEDED")
    MAX___ACTIVE___RULES___EXCEEDED("MAX_ACTIVE_RULES_EXCEEDED"),
    @XmlEnumValue("MAX_APPROVAL_STEPS_EXCEEDED")
    MAX___APPROVAL___STEPS___EXCEEDED("MAX_APPROVAL_STEPS_EXCEEDED"),
    @XmlEnumValue("MAX_FORMULAS_PER_RULE_EXCEEDED")
    MAX___FORMULAS___PER___RULE___EXCEEDED("MAX_FORMULAS_PER_RULE_EXCEEDED"),
    @XmlEnumValue("MAX_RULES_EXCEEDED")
    MAX___RULES___EXCEEDED("MAX_RULES_EXCEEDED"),
    @XmlEnumValue("MAX_RULE_ENTRIES_EXCEEDED")
    MAX___RULE___ENTRIES___EXCEEDED("MAX_RULE_ENTRIES_EXCEEDED"),
    @XmlEnumValue("MAX_TASK_DESCRIPTION_EXCEEEDED")
    MAX___TASK___DESCRIPTION___EXCEEEDED("MAX_TASK_DESCRIPTION_EXCEEEDED"),
    @XmlEnumValue("MAX_TM_RULES_EXCEEDED")
    MAX___TM___RULES___EXCEEDED("MAX_TM_RULES_EXCEEDED"),
    @XmlEnumValue("MAX_TM_RULE_ITEMS_EXCEEDED")
    MAX___TM___RULE___ITEMS___EXCEEDED("MAX_TM_RULE_ITEMS_EXCEEDED"),
    @XmlEnumValue("MERGE_FAILED")
    MERGE___FAILED("MERGE_FAILED"),
    @XmlEnumValue("MISSING_ARGUMENT")
    MISSING___ARGUMENT("MISSING_ARGUMENT"),
    @XmlEnumValue("MIXED_DML_OPERATION")
    MIXED___DML___OPERATION("MIXED_DML_OPERATION"),
    @XmlEnumValue("NONUNIQUE_SHIPPING_ADDRESS")
    NONUNIQUE___SHIPPING___ADDRESS("NONUNIQUE_SHIPPING_ADDRESS"),
    @XmlEnumValue("NO_APPLICABLE_PROCESS")
    NO___APPLICABLE___PROCESS("NO_APPLICABLE_PROCESS"),
    @XmlEnumValue("NO_ATTACHMENT_PERMISSION")
    NO___ATTACHMENT___PERMISSION("NO_ATTACHMENT_PERMISSION"),
    @XmlEnumValue("NO_INACTIVE_DIVISION_MEMBERS")
    NO___INACTIVE___DIVISION___MEMBERS("NO_INACTIVE_DIVISION_MEMBERS"),
    @XmlEnumValue("NO_MASS_MAIL_PERMISSION")
    NO___MASS___MAIL___PERMISSION("NO_MASS_MAIL_PERMISSION"),
    @XmlEnumValue("NUMBER_OUTSIDE_VALID_RANGE")
    NUMBER___OUTSIDE___VALID___RANGE("NUMBER_OUTSIDE_VALID_RANGE"),
    @XmlEnumValue("NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED")
    NUM___HISTORY___FIELDS___BY___SOBJECT___EXCEEDED("NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED"),
    @XmlEnumValue("OPTED_OUT_OF_MASS_MAIL")
    OPTED___OUT___OF___MASS___MAIL("OPTED_OUT_OF_MASS_MAIL"),
    @XmlEnumValue("OP_WITH_INVALID_USER_TYPE_EXCEPTION")
    OP___WITH___INVALID___USER___TYPE___EXCEPTION("OP_WITH_INVALID_USER_TYPE_EXCEPTION"),
    @XmlEnumValue("PACKAGE_LICENSE_REQUIRED")
    PACKAGE___LICENSE___REQUIRED("PACKAGE_LICENSE_REQUIRED"),
    @XmlEnumValue("PORTAL_NO_ACCESS")
    PORTAL___NO___ACCESS("PORTAL_NO_ACCESS"),
    @XmlEnumValue("PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT")
    PORTAL___USER___ALREADY___EXISTS___FOR___CONTACT("PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT"),
    @XmlEnumValue("PRIVATE_CONTACT_ON_ASSET")
    PRIVATE___CONTACT___ON___ASSET("PRIVATE_CONTACT_ON_ASSET"),
    @XmlEnumValue("QUERY_TIMEOUT")
    QUERY___TIMEOUT("QUERY_TIMEOUT"),
    @XmlEnumValue("RECORD_IN_USE_BY_WORKFLOW")
    RECORD___IN___USE___BY___WORKFLOW("RECORD_IN_USE_BY_WORKFLOW"),
    @XmlEnumValue("REQUEST_RUNNING_TOO_LONG")
    REQUEST___RUNNING___TOO___LONG("REQUEST_RUNNING_TOO_LONG"),
    @XmlEnumValue("REQUIRED_FEATURE_MISSING")
    REQUIRED___FEATURE___MISSING("REQUIRED_FEATURE_MISSING"),
    @XmlEnumValue("REQUIRED_FIELD_MISSING")
    REQUIRED___FIELD___MISSING("REQUIRED_FIELD_MISSING"),
    @XmlEnumValue("SELF_REFERENCE_FROM_TRIGGER")
    SELF___REFERENCE___FROM___TRIGGER("SELF_REFERENCE_FROM_TRIGGER"),
    @XmlEnumValue("SHARE_NEEDED_FOR_CHILD_OWNER")
    SHARE___NEEDED___FOR___CHILD___OWNER("SHARE_NEEDED_FOR_CHILD_OWNER"),
    @XmlEnumValue("SINGLE_EMAIL_LIMIT_EXCEEDED")
    SINGLE___EMAIL___LIMIT___EXCEEDED("SINGLE_EMAIL_LIMIT_EXCEEDED"),
    @XmlEnumValue("STANDARD_PRICE_NOT_DEFINED")
    STANDARD___PRICE___NOT___DEFINED("STANDARD_PRICE_NOT_DEFINED"),
    @XmlEnumValue("STORAGE_LIMIT_EXCEEDED")
    STORAGE___LIMIT___EXCEEDED("STORAGE_LIMIT_EXCEEDED"),
    @XmlEnumValue("STRING_TOO_LONG")
    STRING___TOO___LONG("STRING_TOO_LONG"),
    @XmlEnumValue("TABSET_LIMIT_EXCEEDED")
    TABSET___LIMIT___EXCEEDED("TABSET_LIMIT_EXCEEDED"),
    @XmlEnumValue("TEMPLATE_NOT_ACTIVE")
    TEMPLATE___NOT___ACTIVE("TEMPLATE_NOT_ACTIVE"),
    @XmlEnumValue("TERRITORY_REALIGN_IN_PROGRESS")
    TERRITORY___REALIGN___IN___PROGRESS("TERRITORY_REALIGN_IN_PROGRESS"),
    @XmlEnumValue("TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET")
    TEXT___DATA___OUTSIDE___SUPPORTED___CHARSET("TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET"),
    @XmlEnumValue("TOO_MANY_APEX_REQUESTS")
    TOO___MANY___APEX___REQUESTS("TOO_MANY_APEX_REQUESTS"),
    @XmlEnumValue("TOO_MANY_ENUM_VALUE")
    TOO___MANY___ENUM___VALUE("TOO_MANY_ENUM_VALUE"),
    @XmlEnumValue("TRANSFER_REQUIRES_READ")
    TRANSFER___REQUIRES___READ("TRANSFER_REQUIRES_READ"),
    @XmlEnumValue("UNABLE_TO_LOCK_ROW")
    UNABLE___TO___LOCK___ROW("UNABLE_TO_LOCK_ROW"),
    @XmlEnumValue("UNAVAILABLE_RECORDTYPE_EXCEPTION")
    UNAVAILABLE___RECORDTYPE___EXCEPTION("UNAVAILABLE_RECORDTYPE_EXCEPTION"),
    @XmlEnumValue("UNDELETE_FAILED")
    UNDELETE___FAILED("UNDELETE_FAILED"),
    @XmlEnumValue("UNKNOWN_EXCEPTION")
    UNKNOWN___EXCEPTION("UNKNOWN_EXCEPTION"),
    @XmlEnumValue("UNSPECIFIED_EMAIL_ADDRESS")
    UNSPECIFIED___EMAIL___ADDRESS("UNSPECIFIED_EMAIL_ADDRESS"),
    @XmlEnumValue("UNSUPPORTED_APEX_TRIGGER_OPERATON")
    UNSUPPORTED___APEX___TRIGGER___OPERATON("UNSUPPORTED_APEX_TRIGGER_OPERATON"),
    @XmlEnumValue("UNVERIFIED_SENDER_ADDRESS")
    UNVERIFIED___SENDER___ADDRESS("UNVERIFIED_SENDER_ADDRESS"),
    @XmlEnumValue("USER_OWNS_PORTAL_ACCOUNT_EXCEPTION")
    USER___OWNS___PORTAL___ACCOUNT___EXCEPTION("USER_OWNS_PORTAL_ACCOUNT_EXCEPTION"),
    @XmlEnumValue("USER_WITH_APEX_SHARES_EXCEPTION")
    USER___WITH___APEX___SHARES___EXCEPTION("USER_WITH_APEX_SHARES_EXCEPTION"),
    @XmlEnumValue("WEBLINK_SIZE_LIMIT_EXCEEDED")
    WEBLINK___SIZE___LIMIT___EXCEEDED("WEBLINK_SIZE_LIMIT_EXCEEDED"),
    @XmlEnumValue("WRONG_CONTROLLER_TYPE")
    WRONG___CONTROLLER___TYPE("WRONG_CONTROLLER_TYPE");
    private final String value;

    StatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCodeType fromValue(String v) {
        for (StatusCodeType c: StatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}