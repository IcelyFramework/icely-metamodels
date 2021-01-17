/**
 */
package com.github.icelyframework.staticview.impl;

import com.github.icelyframework.staticview.Property;
import com.github.icelyframework.staticview.StaticviewPackage;
import com.github.icelyframework.staticview.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.impl.PropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.PropertyImpl#isIsNamingProperty <em>Is Naming Property</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.PropertyImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.PropertyImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.PropertyImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.PropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAMING_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean isNamingProperty = IS_NAMING_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticviewPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.PROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNamingProperty() {
		return isNamingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNamingProperty(boolean newIsNamingProperty) {
		boolean oldIsNamingProperty = isNamingProperty;
		isNamingProperty = newIsNamingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.PROPERTY__IS_NAMING_PROPERTY, oldIsNamingProperty, isNamingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.PROPERTY__IS_REQUIRED, oldIsRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.PROPERTY__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.PROPERTY__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeDefinition)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticviewPackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeDefinition newType) {
		TypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticviewPackage.PROPERTY__IS_UNIQUE:
				return isIsUnique();
			case StaticviewPackage.PROPERTY__IS_NAMING_PROPERTY:
				return isIsNamingProperty();
			case StaticviewPackage.PROPERTY__NAME:
				return getName();
			case StaticviewPackage.PROPERTY__IS_REQUIRED:
				return isIsRequired();
			case StaticviewPackage.PROPERTY__MIN:
				return getMin();
			case StaticviewPackage.PROPERTY__MAX:
				return getMax();
			case StaticviewPackage.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case StaticviewPackage.PROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case StaticviewPackage.PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty((Boolean)newValue);
				return;
			case StaticviewPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case StaticviewPackage.PROPERTY__IS_REQUIRED:
				setIsRequired((Boolean)newValue);
				return;
			case StaticviewPackage.PROPERTY__MIN:
				setMin((Integer)newValue);
				return;
			case StaticviewPackage.PROPERTY__MAX:
				setMax((Integer)newValue);
				return;
			case StaticviewPackage.PROPERTY__TYPE:
				setType((TypeDefinition)newValue);
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
			case StaticviewPackage.PROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case StaticviewPackage.PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty(IS_NAMING_PROPERTY_EDEFAULT);
				return;
			case StaticviewPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticviewPackage.PROPERTY__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case StaticviewPackage.PROPERTY__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case StaticviewPackage.PROPERTY__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case StaticviewPackage.PROPERTY__TYPE:
				setType((TypeDefinition)null);
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
			case StaticviewPackage.PROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case StaticviewPackage.PROPERTY__IS_NAMING_PROPERTY:
				return isNamingProperty != IS_NAMING_PROPERTY_EDEFAULT;
			case StaticviewPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticviewPackage.PROPERTY__IS_REQUIRED:
				return isRequired != IS_REQUIRED_EDEFAULT;
			case StaticviewPackage.PROPERTY__MIN:
				return min != MIN_EDEFAULT;
			case StaticviewPackage.PROPERTY__MAX:
				return max != MAX_EDEFAULT;
			case StaticviewPackage.PROPERTY__TYPE:
				return type != null;
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
		result.append(" (isUnique: ");
		result.append(isUnique);
		result.append(", isNamingProperty: ");
		result.append(isNamingProperty);
		result.append(", name: ");
		result.append(name);
		result.append(", isRequired: ");
		result.append(isRequired);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
