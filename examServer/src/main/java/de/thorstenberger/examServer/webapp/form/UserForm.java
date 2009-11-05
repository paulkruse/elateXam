package de.thorstenberger.examServer.webapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import de.thorstenberger.examServer.webapp.form.BaseForm;

/**
 * Generated by XDoclet/actionform. This class can be further processed with XDoclet/webdoclet/strutsconfigxml and XDoclet/webdoclet/strutsvalidationxml.
 *
 * @struts.form name="userForm" 
 */
public class UserForm
    extends    BaseForm
    implements java.io.Serializable
{

    protected String id;

    protected String username;

    protected String password;

    protected String confirmPassword;

    protected String passwordHint;

    protected String firstName;

    protected String lastName;

    protected String email;

    protected String phoneNumber;

    protected String website;

    protected String fullName;

    protected AddressForm address = new AddressForm();

    protected transient java.util.Set roles = new java.util.HashSet();

    protected String authorities;

    protected String version;

    protected boolean enabled;

    protected boolean accountExpired;

    protected boolean accountNonExpired;

    protected boolean accountLocked;

    protected boolean accountNonLocked;

    protected boolean credentialsExpired;

    protected boolean credentialsNonExpired;

    /** Default empty constructor. */
    public UserForm() {}

    public String getId()
    {
        return this.id;
    }
   /**
    */

    public void setId( String id )
    {
        this.id = id;
    }

    public String getUsername()
    {
        return this.username;
    }
   /**
    * @struts.validator type="required"
    */

    public void setUsername( String username )
    {
        this.username = username;
    }

    public String getPassword()
    {
        return this.password;
    }
   /**
    * @struts.validator type="required"
    * @struts.validator type="twofields" msgkey="errors.twofields"
    * @struts.validator-args arg1resource="userForm.password"
    * @struts.validator-args arg1resource="userForm.confirmPassword"
    * @struts.validator-var name="secondProperty" value="confirmPassword"
    */

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getConfirmPassword()
    {
        return this.confirmPassword;
    }
   /**
    * @struts.validator type="required"
    */

    public void setConfirmPassword( String confirmPassword )
    {
        this.confirmPassword = confirmPassword;
    }

    public String getPasswordHint()
    {
        return this.passwordHint;
    }
   /**
    * @struts.validator type="required"
    */

    public void setPasswordHint( String passwordHint )
    {
        this.passwordHint = passwordHint;
    }

    public String getFirstName()
    {
        return this.firstName;
    }
   /**
    * @struts.validator type="required"
    */

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
   /**
    * @struts.validator type="required"
    */

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return this.email;
    }
   /**
    * @struts.validator type="required"
    * @struts.validator type="email"
    */

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
   /**
    * @struts.validator type="mask" msgkey="errors.phone"
    * @struts.validator-var name="mask" value="${phone}"
    */

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite()
    {
        return this.website;
    }
   /**
    * @struts.validator type="required"
    */

    public void setWebsite( String website )
    {
        this.website = website;
    }

    public String getFullName()
    {
        return this.fullName;
    }
   /**
    */

    public void setFullName( String fullName )
    {
        this.fullName = fullName;
    }

    public AddressForm getAddressForm()
    {
        return this.address;
    }
   /**
    * @struts.validator
    */

    public void setAddressForm( AddressForm address )
    {
        this.address = address;
    }

    /** 
     *  Getter/Setter pair so BeanUtil.copyProperties(dest, orig) will work 
     *  Any properties modified in the web tier should use the get/setAddressForm 
     *  methods.
     */
    public de.thorstenberger.examServer.model.Address getAddress() throws Exception
    {
        return (de.thorstenberger.examServer.model.Address) de.thorstenberger.examServer.util.ConvertUtil.convert(this.address);
    }

    public void setAddress(de.thorstenberger.examServer.model.Address address) throws Exception
    {
        setAddressForm((AddressForm) de.thorstenberger.examServer.util.ConvertUtil.convert(address));
    }

    public java.util.Set getRoles()
    {
        return this.roles;
    }
   /**
    */

    public void setRoles( java.util.Set roles )
    {
        this.roles = roles;
    }

    public String getAuthorities()
    {
        return this.authorities;
    }
   /**
    */

    public void setAuthorities( String authorities )
    {
        this.authorities = authorities;
    }

    public String getVersion()
    {
        return this.version;
    }
   /**
    */

    public void setVersion( String version )
    {
        this.version = version;
    }

    public boolean isEnabled()
    {
        return this.enabled;
    }
   /**
    */

    public void setEnabled( boolean enabled )
    {
        this.enabled = enabled;
    }

    public boolean isAccountExpired()
    {
        return this.accountExpired;
    }
   /**
    */

    public void setAccountExpired( boolean accountExpired )
    {
        this.accountExpired = accountExpired;
    }

    public boolean isAccountNonExpired()
    {
        return this.accountNonExpired;
    }
   /**
    */

    public void setAccountNonExpired( boolean accountNonExpired )
    {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isAccountLocked()
    {
        return this.accountLocked;
    }
   /**
    */

    public void setAccountLocked( boolean accountLocked )
    {
        this.accountLocked = accountLocked;
    }

    public boolean isAccountNonLocked()
    {
        return this.accountNonLocked;
    }
   /**
    */

    public void setAccountNonLocked( boolean accountNonLocked )
    {
        this.accountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsExpired()
    {
        return this.credentialsExpired;
    }
   /**
    */

    public void setCredentialsExpired( boolean credentialsExpired )
    {
        this.credentialsExpired = credentialsExpired;
    }

    public boolean isCredentialsNonExpired()
    {
        return this.credentialsNonExpired;
    }
   /**
    */

    public void setCredentialsNonExpired( boolean credentialsNonExpired )
    {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public String[] getUserRoles() {
        de.thorstenberger.examServer.model.Role role;
        String[] userRoles = new String[roles.size()];
        int i = 0;
        for (java.util.Iterator iter = roles.iterator(); iter.hasNext();) {
            role = (de.thorstenberger.examServer.model.Role) iter.next();
            userRoles[i] = role.getName();
            i++;
        }
        return userRoles;
    }

    /**
     * Note that this is not used - it's just needed by Struts.  If you look
     * in UserAction - you'll see that request.getParameterValues("userRoles")
     * is used instead.
     * 
     * @param roles
     */
    public void setUserRoles(String[] roles) {}

    /**
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *                                                javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        // reset any boolean data types to false

        this.enabled = false;

        this.accountExpired = false;

        this.accountNonExpired = false;

        this.accountLocked = false;

        this.accountNonLocked = false;

        this.credentialsExpired = false;

        this.credentialsNonExpired = false;

    }

}
