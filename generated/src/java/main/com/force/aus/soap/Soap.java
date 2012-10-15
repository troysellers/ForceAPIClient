
package com.force.aus.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Soap", targetNamespace = "urn:enterprise.soap.sforce.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Soap {


    /**
     * Login to the Salesforce.com SOAP Api
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.LoginResponse
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws LoginFault_Exception
     */
    @WebMethod
    @WebResult(name = "loginResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public LoginResponse login(
        @WebParam(name = "login", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Login parameters)
        throws InvalidIdFault_Exception, LoginFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe an sObject
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeSObjectResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeSObjectResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeSObjectResponse describeSObject(
        @WebParam(name = "describeSObject", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeSObject parameters)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe a number sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeSObjectsResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeSObjectsResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeSObjectsResponse describeSObjects(
        @WebParam(name = "describeSObjects", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeSObjects parameters)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the Global state
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeGlobalResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeGlobalResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeGlobalResponse describeGlobal(
        @WebParam(name = "describeGlobal", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeGlobal parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Describe all the data category groups available for a given set of types
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeDataCategoryGroupsResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeDataCategoryGroupsResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeDataCategoryGroupsResponse describeDataCategoryGroups(
        @WebParam(name = "describeDataCategoryGroups", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeDataCategoryGroups parameters)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the data category group structures for a given set of pair of types and data category group name
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeDataCategoryGroupStructuresResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeDataCategoryGroupStructuresResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeDataCategoryGroupStructuresResponse describeDataCategoryGroupStructures(
        @WebParam(name = "describeDataCategoryGroupStructures", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeDataCategoryGroupStructures parameters)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the layout of an sObject
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeLayoutResponse
     * @throws InvalidSObjectFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeLayoutResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeLayoutResponse describeLayout(
        @WebParam(name = "describeLayout", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeLayout parameters)
        throws InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Describe the layout of the SoftPhone
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeSoftphoneLayoutResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeSoftphoneLayoutResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeSoftphoneLayoutResponse describeSoftphoneLayout(
        @WebParam(name = "describeSoftphoneLayout", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeSoftphoneLayout parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Describe a list of objects representing the order and scope of objects on a users search result page
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeSearchScopeOrderResponse
     */
    @WebMethod
    @WebResult(name = "describeSearchScopeOrderResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeSearchScopeOrderResponse describeSearchScopeOrder(
        @WebParam(name = "describeSearchScopeOrder", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeSearchScopeOrder parameters);

    /**
     * Describe the tabs that appear on a users page
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DescribeTabsResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "describeTabsResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DescribeTabsResponse describeTabs(
        @WebParam(name = "describeTabs", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        DescribeTabs parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Create a set of new sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.CreateResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "createResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public CreateResponse create(
        @WebParam(name = "create", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Create parameters)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Update a set of sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.UpdateResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "updateResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public UpdateResponse update(
        @WebParam(name = "update", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Update parameters)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Update or insert a set of sObjects based on object id
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.UpsertResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "upsertResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public UpsertResponse upsert(
        @WebParam(name = "upsert", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Upsert parameters)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Merge and update a set of sObjects based on object id
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.MergeResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "mergeResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public MergeResponse merge(
        @WebParam(name = "merge", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Merge parameters)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Delete a set of sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.DeleteResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "deleteResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public DeleteResponse delete(
        @WebParam(name = "delete", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Delete parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Undelete a set of sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.UndeleteResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "undeleteResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public UndeleteResponse undelete(
        @WebParam(name = "undelete", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Undelete parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Empty a set of sObjects from the recycle bin
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.EmptyRecycleBinResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "emptyRecycleBinResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public EmptyRecycleBinResponse emptyRecycleBin(
        @WebParam(name = "emptyRecycleBin", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        EmptyRecycleBin parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Get a set of sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.RetrieveResponse
     * @throws InvalidSObjectFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "retrieveResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public RetrieveResponse retrieve(
        @WebParam(name = "retrieve", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Retrieve parameters)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidSObjectFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Submit an entity to a workflow process or process a workitem
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.ProcessResponse
     * @throws InvalidIdFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "processResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public ProcessResponse process(
        @WebParam(name = "process", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Process parameters)
        throws InvalidIdFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * convert a set of leads
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.ConvertLeadResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "convertLeadResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public ConvertLeadResponse convertLead(
        @WebParam(name = "convertLead", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        ConvertLead parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Logout the current user, invalidating the current session.
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.LogoutResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "logoutResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public LogoutResponse logout(
        @WebParam(name = "logout", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Logout parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Logs out and invalidates session ids
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.InvalidateSessionsResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "invalidateSessionsResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public InvalidateSessionsResponse invalidateSessions(
        @WebParam(name = "invalidateSessions", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        InvalidateSessions parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Get the IDs for deleted sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.GetDeletedResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "getDeletedResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public GetDeletedResponse getDeleted(
        @WebParam(name = "getDeleted", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        GetDeleted parameters)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Get the IDs for updated sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.GetUpdatedResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "getUpdatedResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public GetUpdatedResponse getUpdated(
        @WebParam(name = "getUpdated", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        GetUpdated parameters)
        throws InvalidSObjectFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Create a Query Cursor
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.QueryResponse
     * @throws InvalidQueryLocatorFault_Exception
     * @throws InvalidSObjectFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "queryResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public QueryResponse query(
        @WebParam(name = "query", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Query parameters)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidQueryLocatorFault_Exception, InvalidSObjectFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Create a Query Cursor, including deleted sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.QueryAllResponse
     * @throws InvalidQueryLocatorFault_Exception
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "queryAllResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public QueryAllResponse queryAll(
        @WebParam(name = "queryAll", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        QueryAll parameters)
        throws InvalidFieldFault_Exception, InvalidIdFault_Exception, InvalidQueryLocatorFault_Exception, InvalidSObjectFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Gets the next batch of sObjects from a query
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.QueryMoreResponse
     * @throws InvalidQueryLocatorFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws MalformedQueryFault_Exception
     * @throws InvalidFieldFault_Exception
     */
    @WebMethod
    @WebResult(name = "queryMoreResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public QueryMoreResponse queryMore(
        @WebParam(name = "queryMore", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        QueryMore parameters)
        throws InvalidFieldFault_Exception, InvalidQueryLocatorFault_Exception, MalformedQueryFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Search for sObjects
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.SearchResponse
     * @throws InvalidSObjectFault_Exception
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidFieldFault_Exception
     * @throws MalformedSearchFault_Exception
     */
    @WebMethod
    @WebResult(name = "searchResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public SearchResponse search(
        @WebParam(name = "search", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        Search parameters)
        throws InvalidFieldFault_Exception, InvalidSObjectFault_Exception, MalformedSearchFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Gets server timestamp
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.GetServerTimestampResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "getServerTimestampResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public GetServerTimestampResponse getServerTimestamp(
        @WebParam(name = "getServerTimestamp", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        GetServerTimestamp parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Set a user's password
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.SetPasswordResponse
     * @throws InvalidNewPasswordFault_Exception
     * @throws InvalidIdFault_Exception
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "setPasswordResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public SetPasswordResponse setPassword(
        @WebParam(name = "setPassword", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        SetPassword parameters)
        throws InvalidIdFault_Exception, InvalidNewPasswordFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Reset a user's password
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.ResetPasswordResponse
     * @throws UnexpectedErrorFault_Exception
     * @throws InvalidIdFault_Exception
     */
    @WebMethod
    @WebResult(name = "resetPasswordResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public ResetPasswordResponse resetPassword(
        @WebParam(name = "resetPassword", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        ResetPassword parameters)
        throws InvalidIdFault_Exception, UnexpectedErrorFault_Exception
    ;

    /**
     * Returns standard information relevant to the current user
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.GetUserInfoResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "getUserInfoResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public GetUserInfoResponse getUserInfo(
        @WebParam(name = "getUserInfo", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        GetUserInfo parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Send existing draft EmailMessage
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.SendEmailMessageResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "sendEmailMessageResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public SendEmailMessageResponse sendEmailMessage(
        @WebParam(name = "sendEmailMessage", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        SendEmailMessage parameters)
        throws UnexpectedErrorFault_Exception
    ;

    /**
     * Send outbound email
     * 
     * @param parameters
     * @return
     *     returns com.force.aus.soap.SendEmailResponse
     * @throws UnexpectedErrorFault_Exception
     */
    @WebMethod
    @WebResult(name = "sendEmailResponse", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
    public SendEmailResponse sendEmail(
        @WebParam(name = "sendEmail", targetNamespace = "urn:enterprise.soap.sforce.com", partName = "parameters")
        SendEmail parameters)
        throws UnexpectedErrorFault_Exception
    ;

}
