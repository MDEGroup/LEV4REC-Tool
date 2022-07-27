## LEV4REC - Web-based editor

LEV4REC has been developed as a web-based project by using the Spring-Boot framework. Furthermore, we adopt a gateway to solve the cross-origin issue of the DSL editor.  






## LEV4REC environment
To import LEV4REC as an Eclipse project,  you have to download Eclipse JEE (2020-06 distribution) from [here](https://www.eclipse.org/downloads/) and install the following plug-in:

 - EMF modeling tool SDK needed to edit the metamodel and models (update site [here](https://download.eclipse.org/modeling/emf/emf/builds/index.html))
 - FeatureIDE to modify the feature model directly from Eclipse Marketplace (Help > Eclipse Marketplace and then searching for FeatureIDE)
 - Acceleo to generate the source code (update site [here](https://www.eclipse.org/acceleo/download.html))
 - (Optional) ATL to register the metamodel (update site [here](https://download.eclipse.org/mmt/atl/updates/releases/))



## LEV4REC structure

The architecture relies on two different Eclipse projects. One is devoted to extending/personalize the three main components i.e., the feature model, the metamodel, and Acceleo templates. The second one is an Eclipse run-time project that can be used to test the whole LEV4REC workflow from the features' specification to the source code generation. Overall, the system is composed of the following plug-ins: 

- **gateway**: this project is used to handle the cross-orgin request due to the Xtext-based DSL editor
-  **images**: this folde contains the pictures used in the paper

 - **lev4rec.code.template**: this component produces the source code by using Acceleo templates
 - **lev4rec.feature.model**: it represents the feature model and the derived configuration for the two examined RSs in the study
 -  **lev4rec.model.edit**:  it contains the internal Eclipse utilities to generate the metaclasses
 -    **lev4rec.model.editor**:  it contains the presentation layer components for the metaclasses
 - **lev4.rec.model** : it contains the metamodel and the conform models 
 - **lev4rec.ui**: it handles GUI components in the run-time environment
 -  **org.xtext.lev4rec.parent**: it contains the Xtext-based DSL 

 
 
## Installation - Eclipse IDE
To install LEV4REC within Ecplise, please follow these steps:

1. Install **Eclipse Modeling Framework** according to 2020-06 distribution from this link: [Eclipse](https://www.eclipse.org/downloads/).
2. Install [FeatureIDE](https://featureide.github.io/) plugin.
3. In Eclipse, import **lev4rec.code.template**, **lev4.rec.model,** and  **org.xtext.lev4rec.parent** in this order projects by navigating to `File > Import > Existing Projects into Workspace` and pointing the root directory to this. Furthermore, we have to import the Spring project located [here](https://github.com/MDEGroup/LEV4REC-Tool/tree/main/lev4rec/demo). If have installed ATL plug-in, you have to register the metamodel to generate the source code (right-click on the metamodel and choose Register EPackage). If not, you have to edit and save all Acceleo templates (Eclipse registers the metamodel automatically). All projects should compile without any issue.

## Installation - Stand-alone jars

Inside the [lev4rec_standalone](https://github.com/MDEGroup/LEV4REC-Tool/tree/main/lev4rec/lev4rec_standalone)  folder, you can find:

- **demo-0.0.1-SNAPSHOT.jar**: it contains the Spring project
- **gateway-0.0.1-SNAPSHOT.jar** : it contains the gateway used to handle the cross-origin requests
- **xtext_dsl_editor.jar**  : it contains the DSL web project
You have to run the three jars file using the command  `java -jar file.jar`.


## Installation - Docker deployment

Inside the [lev4rec_standalone](https://github.com/MDEGroup/LEV4REC-Tool/tree/main/lev4rec/lev4rec_docker_package)  folder, you can find:

- **apiGateway**: this folder contains the Spring Gateway project and the corresponding Docker configuration file
- **spring** : this folder contains the Spring Web project and the corresponding Docker configuration file
- **xtext**  : this folder contains the Xtext project and the corresponding Docker configuration file
- **docker-compose.yml** : this configuration file is used to compose and deploy the three projects

You have to run `docker_compose.yml` inside a Docker installation. You can use Docker Hub (available [here](https://docs.docker.com/get-docker/) ) 



## Tool Usage
Once you run the three projects, you can go to `http://localhost:8891/lev4rec/` and start to configure the recommender system using the RS configuration form. It is worth noting that some features are currently under development and the system can cover the use case presented in the paper. 

Once you select at least the mandatory features, you can press submit to send the configuration to the Xtext-based editor. The editor generates an initial configuration from the elicited features that can be fine-tuned. By pressing `Ctrl+Space` in the field box. you can obtain additional suggestions concerning the components or their parameters. You can eventually download the Python code to deploy the designed system using the **Generate code** button located at the bottom of the page.
