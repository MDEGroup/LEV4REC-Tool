/**
 */
package lowcoders.impl;

import lowcoders.LowcodersPackage;
import lowcoders.TextualContent;
import lowcoders.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lowcoders.impl.TextualContentImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link lowcoders.impl.TextualContentImpl#getRootPath <em>Root Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextualContentImpl extends DataStructureImpl implements TextualContent {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected Variable contents;

	/**
	 * The default value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPath()
	 * @generated
	 * @ordered
	 */
	protected String rootPath = ROOT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LowcodersPackage.Literals.TEXTUAL_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getContents() {
		if (contents != null && contents.eIsProxy()) {
			InternalEObject oldContents = (InternalEObject)contents;
			contents = (Variable)eResolveProxy(oldContents);
			if (contents != oldContents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LowcodersPackage.TEXTUAL_CONTENT__CONTENTS, oldContents, contents));
			}
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents(Variable newContents) {
		Variable oldContents = contents;
		contents = newContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.TEXTUAL_CONTENT__CONTENTS, oldContents, contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootPath() {
		return rootPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootPath(String newRootPath) {
		String oldRootPath = rootPath;
		rootPath = newRootPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LowcodersPackage.TEXTUAL_CONTENT__ROOT_PATH, oldRootPath, rootPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LowcodersPackage.TEXTUAL_CONTENT__CONTENTS:
				if (resolve) return getContents();
				return basicGetContents();
			case LowcodersPackage.TEXTUAL_CONTENT__ROOT_PATH:
				return getRootPath();
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
			case LowcodersPackage.TEXTUAL_CONTENT__CONTENTS:
				setContents((Variable)newValue);
				return;
			case LowcodersPackage.TEXTUAL_CONTENT__ROOT_PATH:
				setRootPath((String)newValue);
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
			case LowcodersPackage.TEXTUAL_CONTENT__CONTENTS:
				setContents((Variable)null);
				return;
			case LowcodersPackage.TEXTUAL_CONTENT__ROOT_PATH:
				setRootPath(ROOT_PATH_EDEFAULT);
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
			case LowcodersPackage.TEXTUAL_CONTENT__CONTENTS:
				return contents != null;
			case LowcodersPackage.TEXTUAL_CONTENT__ROOT_PATH:
				return ROOT_PATH_EDEFAULT == null ? rootPath != null : !ROOT_PATH_EDEFAULT.equals(rootPath);
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
		result.append(" (rootPath: ");
		result.append(rootPath);
		result.append(')');
		return result.toString();
	}

} //TextualContentImpl
