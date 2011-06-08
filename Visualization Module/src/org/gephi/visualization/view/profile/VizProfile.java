/*
Copyright 2008-2011 Gephi
Authors : Antonio Patriarca <antoniopatriarca@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.gephi.visualization.view.profile;

import javax.media.opengl.GL;
import org.gephi.visualization.view.pipeline.Pipeline;
import org.gephi.visualization.view.profile.options.VizProfileOptionPanel;

/**
 * A VizProfile represents a set of features and can be used to set
 *
 * Antonio Patriarca <antoniopatriarca@gmail.com>
 */
public interface VizProfile {

    public String name();
    public String description();

    public void loadProperties();
    public void saveProperties();

    public void setProperty(VizProperty property);

    public VizProfileOptionPanel optionPanel();

    public Pipeline createPipeline(GL gl);

}
