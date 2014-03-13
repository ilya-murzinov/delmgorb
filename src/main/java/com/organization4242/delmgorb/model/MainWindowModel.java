package com.organization4242.delmgorb.model;

import com.organization4242.delmgorb.controller.MainWindowController;

import java.beans.PropertyChangeEvent;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

/**
 * Class is used for storing values from {@link com.organization4242.delmgorb.view.MainWindowView}
 * and pass it to {@link com.organization4242.delmgorb.model.DataModel}.
 *
 * @author Murzinov Ilya
 */
public class MainWindowModel extends AbstractModel implements Serializable {
    private Integer numberOfPoints;
    private Double timeStep;
    private Double timePeriod;
    private IntegrationMethods integrationMethod;
    private Angle angle;
    private Float xMin;
    private Float xMax;
    private Float yMin;
    private Float yMax;
    private Double phi;
    private Double psi;
    private Double theta;
    private Integer numberOfSpheres;
    private InterpolationMethods interpolationMethod = InterpolationMethods.MICROSPHERE;

    private transient Logger logger = Logger.getLogger("Delmgorb.logger");

    public IntegrationMethods getIntegrationMethod() {
        return integrationMethod;
    }

    public Angle getAngle() {
        return angle;
    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public Double getTimeStep() {
        return timeStep;
    }

    public Double getTimePeriod() {
        return timePeriod;
    }

    public Double getPhi() {
        return phi;
    }

    public Double getPsi() {
        return psi;
    }

    public Double getTheta() {
        return theta;
    }

    public Float getXMin() {
        return xMin;
    }

    public Float getXMax() {
        return xMax;
    }

    public Float getYMin() {
        return yMin;
    }

    public Float getYMax() {
        return yMax;
    }

    public Integer getNumberOfSpheres() {
        return numberOfSpheres;
    }

    public InterpolationMethods getInterpolationMethod() {
        return interpolationMethod;
    }

    public void setNumberOfPoints(String numberOfPoints) {
        int oldValue = this.numberOfPoints != null ? this.numberOfPoints : 0;
        this.numberOfPoints = Integer.parseInt(numberOfPoints);
        firePropertyChange(MainWindowController.NUMBER_OF_POINTS, oldValue, numberOfPoints);
    }

    public void setTimeStep(String timeStep) {
        Double oldValue = this.timeStep != null ? this.timeStep : 0d;
        this.timeStep = Double.parseDouble(timeStep);
        firePropertyChange(MainWindowController.TIME_STEP, oldValue, timeStep);
    }

    public void setTimePeriod(String timePeriod) {
        Double oldValue = this.timePeriod != null ? this.timePeriod : 0d;
        this.timePeriod = Double.parseDouble(timePeriod);
        firePropertyChange(MainWindowController.TIME_PERIOD, oldValue, timePeriod);
    }

    public void setIntegrationMethod(String integrationMethod) {
        IntegrationMethods oldValue = this.integrationMethod != null ? this.integrationMethod : null;
        this.integrationMethod = IntegrationMethods.fromString(integrationMethod);
        firePropertyChange(MainWindowController.INTEGRATION_METHOD, oldValue, integrationMethod);
    }

    public void setAngle(String angle) {
        Angle oldValue = this.angle != null ? this.angle : null;
        this.angle = Angle.fromString(angle);
        firePropertyChange(MainWindowController.ANGLE, oldValue, angle);
    }

    public void setXMin(String xMin) {
        Float oldValue = this.xMin != null ? this.xMin : 0f;
        this.xMin = Float.parseFloat(xMin);
        firePropertyChange(MainWindowController.X_MIN, oldValue, xMin);
    }

    public void setXMax(String xMax) {
        Float oldValue = this.xMax != null ? this.xMax : 0f;
        this.xMax = Float.parseFloat(xMax);
        firePropertyChange(MainWindowController.X_MAX, oldValue, xMax);
    }

    public void setYMin(String yMin) {
        Float oldValue = this.yMin != null ? this.yMin : 0f;
        this.yMin = Float.parseFloat(yMin);
        firePropertyChange(MainWindowController.Y_MIN, oldValue, yMin);
    }

    public void setYMax(String yMax) {
        Float oldValue = this.yMax != null ? this.yMax : 0f;
        this.yMax = Float.parseFloat(yMax);
        firePropertyChange(MainWindowController.Y_MAX, oldValue, yMax);
    }

    public void setPhi(String phi) {
        Double oldValue = this.phi != null ? this.phi : 0d;
        this.phi = Double.parseDouble(phi);
        firePropertyChange(MainWindowController.PHI, oldValue, phi);
    }

    public void setPsi(String psi) {
        Double oldValue = this.psi != null ? this.psi : 0d;
        this.psi = Double.parseDouble(psi);
        firePropertyChange(MainWindowController.PSI, oldValue, psi);
    }

    public void setTheta(String theta) {
        Double oldValue = this.theta != null ? this.theta : 0d;
        this.theta = Double.parseDouble(theta);
        firePropertyChange(MainWindowController.THETA, oldValue, theta);
    }

    public void setNumberOfSpheres(String numberOfSpheres) {
        Integer oldValue = this.numberOfSpheres != null ? this.numberOfSpheres : null;
        this.numberOfSpheres = Integer.parseInt(numberOfSpheres);
        firePropertyChange(MainWindowController.NUMBER_OF_SPHERES, oldValue, numberOfSpheres);
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        int oldValue = this.numberOfPoints != null ? this.numberOfPoints : 0;
        this.numberOfPoints = numberOfPoints;
        firePropertyChange(MainWindowController.NUMBER_OF_POINTS, oldValue, numberOfPoints);
    }

    public void setTimeStep(Double timeStep) {
        Double oldValue = this.timeStep != null ? this.timeStep : 0d;
        this.timeStep = timeStep;
        firePropertyChange(MainWindowController.TIME_STEP, oldValue, timeStep);
    }

    public void setTimePeriod(Double timePeriod) {
        Double oldValue = this.timePeriod != null ? this.timePeriod : 0d;
        this.timePeriod = timePeriod;
        firePropertyChange(MainWindowController.TIME_PERIOD, oldValue, timePeriod);
    }

    public void setIntegrationMethod(IntegrationMethods integrationMethod) {
        IntegrationMethods oldValue = this.integrationMethod != null ? this.integrationMethod : null;
        this.integrationMethod = integrationMethod;
        firePropertyChange(MainWindowController.INTEGRATION_METHOD, oldValue, integrationMethod);
    }

    public void setAngle(Angle angle) {
        Angle oldValue = this.angle != null ? this.angle : null;
        this.angle = angle;
        firePropertyChange(MainWindowController.ANGLE, oldValue, angle);
    }

    public void setXMin(Float xMin) {
        Float oldValue = this.xMin != null ? this.xMin : 0f;
        this.xMin = xMin;
        firePropertyChange(MainWindowController.X_MIN, oldValue, xMin);
    }

    public void setXMax(Float xMax) {
        Float oldValue = this.xMax != null ? this.xMax : 0f;
        this.xMax = xMax;
        firePropertyChange(MainWindowController.X_MAX, oldValue, xMax);
    }

    public void setYMin(Float yMin) {
        Float oldValue = this.yMin != null ? this.yMin : 0f;
        this.yMin = yMin;
        firePropertyChange(MainWindowController.Y_MIN, oldValue, yMin);
    }

    public void setYMax(Float yMax) {
        Float oldValue = this.yMax != null ? this.yMax : 0f;
        this.yMax = yMax;
        firePropertyChange(MainWindowController.Y_MAX, oldValue, yMax);
    }

    public void setPhi(Double phi) {
        Double oldValue = this.phi != null ? this.phi : 0d;
        this.phi = phi;
        firePropertyChange(MainWindowController.PHI, oldValue, phi);
    }

    public void setPsi(Double psi) {
        Double oldValue = this.psi != null ? this.psi : 0d;
        this.psi = psi;
        firePropertyChange(MainWindowController.PSI, oldValue, psi);
    }

    public void setTheta(Double theta) {
        Double oldValue = this.theta != null ? this.theta : 0d;
        this.theta = theta;
        firePropertyChange(MainWindowController.THETA, oldValue, theta);
    }

    public void setNumberOfSpheres(Integer numberOfSpheres) {
        Integer oldValue = this.numberOfSpheres != null ? this.numberOfSpheres : null;
        this.numberOfSpheres = numberOfSpheres;
        firePropertyChange(MainWindowController.NUMBER_OF_SPHERES, oldValue, numberOfSpheres);
    }

    public MainWindowModel() {

    }

    public void setDefaults() {
        setNumberOfPoints(10);
        setTimeStep(0.5);
        setTimePeriod(100d);
        setXMin(1f);
        setXMax(2f);
        setYMin(0.05f);
        setYMax(1f);
        setAngle(Angle.PSI);
        setIntegrationMethod(IntegrationMethods.DORMAND_PRINCE_8);
        setPhi(0.01);
        setPsi(0.01);
        setTheta(0.01);
        setNumberOfSpheres(50);
    }

    public void update(MainWindowModel mainWindowModel) {
        setNumberOfPoints(mainWindowModel.getNumberOfPoints());
        setTimeStep(mainWindowModel.getTimeStep());
        setTimePeriod(mainWindowModel.getTimePeriod());
        setXMin(mainWindowModel.getXMin());
        setXMax(mainWindowModel.getXMax());
        setYMin(mainWindowModel.getYMin());
        setYMax(mainWindowModel.getYMax());
        setIntegrationMethod(mainWindowModel.getIntegrationMethod());
        setAngle(mainWindowModel.getAngle());
        setPhi(mainWindowModel.getPhi());
        setPsi(mainWindowModel.getPsi());
        setTheta(mainWindowModel.getTheta());
        setNumberOfSpheres(mainWindowModel.getNumberOfSpheres());
    }

    @Override
    public void viewPropertyChange(PropertyChangeEvent pce) {
        try {
            MainWindowModel.class.getMethod("set"+pce.getPropertyName(), String.class).invoke(this, pce.getNewValue());
        } catch (NoSuchMethodException ex) {
            logger.severe(ex.getMessage());
        } catch (SecurityException ex) {
            logger.severe(ex.getMessage());
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
            logger.severe(ex.getMessage());
        } catch (IllegalAccessException ex) {
            logger.severe(ex.getMessage());
        }
    }
}
