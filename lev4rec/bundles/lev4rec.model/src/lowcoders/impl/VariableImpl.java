/**
 */
package lowcoders.impl;

import lowcoders.DataSource;
import lowcoders.LowcodersPackage;
import lowcoders.Preprocessing;
import lowcoders.Variable;
import lowcoders.VariableType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.VariableImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link lowcoders.impl.VariableImpl#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link lowcoders.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link lowcoders.impl.VariableImpl#isIsMissingValueAllowed <em>Is Missing Value Allowed</em>}</li>
 *   <li>{@link lowcoders.impl.VariableImpl#isIsMultiple <em>Is Multiple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends NamedElementImpl implements Variable {
	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource;

	/**
	 * The cached value of the '{@link #getPreprocessing() <em>Preprocessing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessing()
	 * @generated
	 * @ordered
	 */
	protected Preprocessing preprocessing;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final VariableType TYPE_EDEFAULT = VariableType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VariableType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMissingValueAllowed() <em>Is Missing Value Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMissingValueAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MISSING_VALUE_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMissingValueAllowed() <em>Is Missing Value Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMissingValueAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean isMissingValueAllowed = IS_MISSING_VALUE_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiple = IS_MULTIPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.VARIABLE__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSource(DataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.VARIABLE__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.VARIABLE__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.VARIABLE__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Preprocessing getPreprocessing() {
		return preprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreprocessing(Preprocessing newPreprocessing, NotificationChain msgs) {
		Preprocessing oldPreprocessing = preprocessing;
		preprocessing = newPreprocessing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LowcodersPackage.VARIABLE__PREPROCESSING, oldPreprocessing, newPreprocessing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreprocessing(Preprocessing newPreprocessing) {
		if (newPreprocessing != preprocessing) {
			NotificationChain msgs = null;
			if (preprocessing != null)
				msgs = ((InternalEObject)preprocessing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.VARIABLE__PREPROCESSING, null, msgs);
			if (newPreprocessing != null)
				msgs = ((InternalEObject)newPreprocessing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LowcodersPackage.VARIABLE__PREPROCESSING, null, msgs);
			msgs = basicSetPreprocessing(newPreprocessing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.VARIABLE__PREPROCESSING, newPreprocessing, newPreprocessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VariableType newType) {
		VariableType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMissingValueAllowed() {
		return isMissingValueAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMissingValueAllowed(boolean newIsMissingValueAllowed) {
		boolean oldIsMissingValueAllowed = isMissingValueAllowed;
		isMissingValueAllowed = newIsMissingValueAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.VARIABLE__IS_MISSING_VALUE_ALLOWED, oldIsMissingValueAllowed, isMissingValueAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMultiple() {
		return isMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMultiple(boolean newIsMultiple) {
		boolean oldIsMultiple = isMultiple;
		isMultiple = newIsMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.VARIABLE__IS_MULTIPLE, oldIsMultiple, isMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LowcodersPackage.VARIABLE__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case LowcodersPackage.VARIABLE__PREPROCESSING:
				return basicSetPreprocessing(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.VARIABLE__DATA_SOURCE:
				return getDataSource();
			case LowcodersPackage.VARIABLE__PREPROCESSING:
				return getPreprocessing();
			case LowcodersPackage.VARIABLE__TYPE:
				return getType();
			case LowcodersPackage.VARIABLE__IS_MISSING_VALUE_ALLOWED:
				return isIsMissingValueAllowed();
			case LowcodersPackage.VARIABLE__IS_MULTIPLE:
				return isIsMultiple();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LowcodersPackage.VARIABLE__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case LowcodersPackage.VARIABLE__PREPROCESSING:
				setPreprocessing((Preprocessing)newValue);
				return;
			case LowcodersPackage.VARIABLE__TYPE:
				setType((VariableType)newValue);
				return;
			case LowcodersPackage.VARIABLE__IS_MISSING_VALUE_ALLOWED:
				setIsMissingValueAllowed((Boolean)newValue);
				return;
			case LowcodersPackage.VARIABLE__IS_MULTIPLE:
				setIsMultiple((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LowcodersPackage.VARIABLE__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
			case LowcodersPackage.VARIABLE__PREPROCESSING:
				setPreprocessing((Preprocessing)null);
				return;
			case LowcodersPackage.VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LowcodersPackage.VARIABLE__IS_MISSING_VALUE_ALLOWED:
				setIsMissingValueAllowed(IS_MISSING_VALUE_ALLOWED_EDEFAULT);
				return;
			case LowcodersPackage.VARIABLE__IS_MULTIPLE:
				setIsMultiple(IS_MULTIPLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LowcodersPackage.VARIABLE__DATA_SOURCE:
				return dataSource != null;
			case LowcodersPackage.VARIABLE__PREPROCESSING:
				return preprocessing != null;
			case LowcodersPackage.VARIABLE__TYPE:
				return type != TYPE_EDEFAULT;
			case LowcodersPackage.VARIABLE__IS_MISSING_VALUE_ALLOWED:
				return isMissingValueAllowed != IS_MISSING_VALUE_ALLOWED_EDEFAULT;
			case LowcodersPackage.VARIABLE__IS_MULTIPLE:
				return isMultiple != IS_MULTIPLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", isMissingValueAllowed: ");
		result.append(isMissingValueAllowed);
		result.append(", isMultiple: ");
		result.append(isMultiple);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
