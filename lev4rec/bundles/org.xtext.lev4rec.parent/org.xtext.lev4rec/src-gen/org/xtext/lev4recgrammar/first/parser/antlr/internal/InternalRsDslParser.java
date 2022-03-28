package org.xtext.lev4recgrammar.first.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.lev4recgrammar.first.services.RsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RSModel'", "'{'", "'dataset'", "'presentationLayer'", "'evaluation'", "'recommendationSystem'", "'feedback'", "'}'", "'Evaluation'", "'baselines'", "','", "'metrics'", "'validationTechnique'", "'FeedbackComponent'", "'library'", "'query'", "'expressedFeedback'", "'isMissingValueAllowed'", "'isMultiple'", "'Variable'", "'type'", "'dataSource'", "'preprocessing'", "'isBuiltIn'", "'UnsupervisedDataset'", "'datasetManipulationLibrary'", "'path'", "'indipendentVariables'", "'dataStructure'", "'SupervisedDataset'", "'dependatVariable'", "'Preprocessing'", "'preprocessigTechnique'", "'metadata'", "'CodeRepository'", "'CommunicationChannel'", "'BugTrackingSystem'", "'DependencyManager'", "'File'", "'sourcePath'", "'encoding'", "'Graph'", "'nodes'", "'('", "')'", "'relations'", "'Matrix'", "'columns'", "'Tree'", "'TextualContent'", "'rootPath'", "'contents'", "'ARFF'", "'variables'", "'VariableRelation'", "'source'", "'target'", "'ordered'", "'RecommendedItem'", "'outcame'", "'WebIService'", "'recommendations'", "'WebApplication'", "'port'", "'host'", "'IDEIntegration'", "'VSCodePlugin'", "'handler'", "'TraversableGraph'", "'RawOutcomes'", "'format'", "'RecommendationHandler'", "'webService'", "'context'", "'usage'", "'RecommendationUsage'", "'usageType'", "'recommendedItems'", "'guielements'", "'isProactiveSystem'", "'RecommendationContext'", "'userContext'", "'condition'", "'ProactiveHandler'", "'ReactiveHandler'", "'event'", "'GUIElement'", "'-'", "'UserStudy'", "'nOfRecommendations'", "'analysis'", "'CrossValidation'", "'numberOfFold'", "'groundTruthExtractor'", "'ContextValidation'", "'testContext'", "'RandomSplitting'", "'AutomatedValidation'", "'GroundTruthExtraction'", "'sizeGT'", "'splittingRules'", "'targetVariable'", "'RecommendationSetting'", "'key'", "'value'", "'MachineLearningBasedRS'", "'generator'", "'numEpochs'", "'learningRate'", "'miniBatchSize'", "'settings'", "'scope'", "'FilteringRS'", "'filteringRSAlgorithm'", "'similarityCalculator'", "'cutoff'", "'neighborhood'", "'DataMiningRS'", "'dataMiningRSAlgorithm'", "'CustomRecommender'", "'description'", "'requiredTools'", "'GeneticAlgorithm'", "'fitnessFunction'", "'searchStrategy'", "'mutationOperator'", "'DeepNN'", "'numHiddenLayer'", "'ConvolutionalNN'", "'Bayesian'", "'RecurrentNN'", "'SVM'", "'kernel'", "'DecisionTree'", "'FeedForwardNN'", "'solver'", "'alpha'", "'activationFunction'", "'randomState'", "'.'", "'E'", "'e'", "'ImplicitFeedback'", "'item'", "'HybridFeedback'", "'AdditiveFeedback'", "'numOfInsertion'", "'recommender'", "'Rating'", "'DUPLICATES_REMOVAL'", "'NLP'", "'NORMALIZATION'", "'MISSING_DATA_MANIPULATION'", "'VECTORIZATION'", "'FEATURE_SCALING'", "'TFIDF'", "'PANDAS'", "'NUMPY'", "'String'", "'Boolean'", "'CategoricalData'", "'Integer'", "'Float'", "'FLASK'", "'SPRING'", "'Transformative'", "'Visualization'", "'Click'", "'Selection'", "'CSV'", "'PRECISION'", "'RECALL'", "'F1_MEASURE'", "'CATALOG_COVERAGE'", "'NOVELTY'", "'SALE_DIVERSITY'", "'NDCG'", "'ITEM_COVERAGE'", "'EPC'", "'GINI'", "'FIELD_STUDIES'", "'CONTROLLED_EXPERIMENT'", "'QUALITATIVE'", "'QUANTITATIVE'", "'SKLEARN'", "'SURPRISE'", "'TENSOR_FLOW'", "'PYTORCH'", "'ELLIOT'", "'CONTENT_BASED'", "'DEMOGRAPHIC'", "'USER_BASED'", "'ITEM_BASED'", "'CONTEXT_AWARE'", "'HYBRID'", "'COSINE_SIMILARITY'", "'JACCARD_DISTANCE'", "'WORD_EMBEDDINGS'", "'LEVENSHTEIN_DISTANCE'", "'SVD'", "'GRAPH_BASED'", "'MSD'", "'EUCLIDEAN_DISTANCE'", "'CLUSTERING'", "'FREQUENT_ITEM_SET'", "'ASSOCIATION_RULE'", "'EVENT_STREAM'", "'TEXT_MINING'", "'SIMULATED_ANNELING'", "'HILL_CLIMBING'", "'GRADIENT_DESCENT'", "'EGGHOLDER_FUNCTION'", "'FIT_BIT'", "'CROSSOVER'", "'SHRINK_MUTATION'", "'REPACE_MUTATION'", "'PARTIAL_HYPER_MUTATION'", "'DUPLICATION'", "'PRECOMPUTED'", "'LINEAR'", "'POLY'", "'RBF'", "'SIGMOID'", "'ADAM'", "'LBFGS'", "'SGD'", "'RELU'", "'TANH'", "'LIGHTFM'", "'LIGHTGBM'", "'POSITIVE'", "'NEGATIVE'", "'NUMERICAL'", "'ORDINAL'", "'UNARY'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__100=100;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__102=102;
    public static final int T__223=223;
    public static final int T__101=101;
    public static final int T__222=222;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__218=218;
    public static final int T__12=12;
    public static final int T__217=217;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__219=219;
    public static final int T__214=214;
    public static final int T__213=213;
    public static final int T__216=216;
    public static final int T__215=215;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__207=207;
    public static final int T__23=23;
    public static final int T__206=206;
    public static final int T__24=24;
    public static final int T__209=209;
    public static final int T__25=25;
    public static final int T__208=208;
    public static final int T__203=203;
    public static final int T__202=202;
    public static final int T__20=20;
    public static final int T__205=205;
    public static final int T__21=21;
    public static final int T__204=204;
    public static final int T__122=122;
    public static final int T__243=243;
    public static final int T__121=121;
    public static final int T__242=242;
    public static final int T__124=124;
    public static final int T__245=245;
    public static final int T__123=123;
    public static final int T__244=244;
    public static final int T__120=120;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__119=119;
    public static final int T__118=118;
    public static final int T__239=239;
    public static final int T__115=115;
    public static final int T__236=236;
    public static final int EOF=-1;
    public static final int T__114=114;
    public static final int T__235=235;
    public static final int T__117=117;
    public static final int T__238=238;
    public static final int T__116=116;
    public static final int T__237=237;
    public static final int T__111=111;
    public static final int T__232=232;
    public static final int T__110=110;
    public static final int T__231=231;
    public static final int T__113=113;
    public static final int T__234=234;
    public static final int T__112=112;
    public static final int T__233=233;
    public static final int T__230=230;
    public static final int T__108=108;
    public static final int T__229=229;
    public static final int T__107=107;
    public static final int T__228=228;
    public static final int T__109=109;
    public static final int T__104=104;
    public static final int T__225=225;
    public static final int T__103=103;
    public static final int T__224=224;
    public static final int T__106=106;
    public static final int T__227=227;
    public static final int T__105=105;
    public static final int T__226=226;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__201=201;
    public static final int T__200=200;
    public static final int T__91=91;
    public static final int T__188=188;
    public static final int T__92=92;
    public static final int T__187=187;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__189=189;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__90=90;
    public static final int T__185=185;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__199=199;
    public static final int T__81=81;
    public static final int T__198=198;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int RULE_WS=9;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalRsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRsDsl.g"; }



     	private RsDslGrammarAccess grammarAccess;

        public InternalRsDslParser(TokenStream input, RsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RSModel";
       	}

       	@Override
       	protected RsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRSModel"
    // InternalRsDsl.g:65:1: entryRuleRSModel returns [EObject current=null] : iv_ruleRSModel= ruleRSModel EOF ;
    public final EObject entryRuleRSModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSModel = null;


        try {
            // InternalRsDsl.g:65:48: (iv_ruleRSModel= ruleRSModel EOF )
            // InternalRsDsl.g:66:2: iv_ruleRSModel= ruleRSModel EOF
            {
             newCompositeNode(grammarAccess.getRSModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRSModel=ruleRSModel();

            state._fsp--;

             current =iv_ruleRSModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRSModel"


    // $ANTLR start "ruleRSModel"
    // InternalRsDsl.g:72:1: ruleRSModel returns [EObject current=null] : (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' ( (lv_dataset_4_0= ruleDataset ) ) )? (otherlv_5= 'presentationLayer' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) )? (otherlv_7= 'evaluation' ( (lv_evaluation_8_0= ruleEvaluation ) ) )? otherlv_9= 'recommendationSystem' ( (lv_recommendationSystem_10_0= ruleRecommendationSystem ) ) (otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleFeedbackComponent ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleRSModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dataset_4_0 = null;

        EObject lv_presentationLayer_6_0 = null;

        EObject lv_evaluation_8_0 = null;

        EObject lv_recommendationSystem_10_0 = null;

        EObject lv_feedback_12_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:78:2: ( (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' ( (lv_dataset_4_0= ruleDataset ) ) )? (otherlv_5= 'presentationLayer' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) )? (otherlv_7= 'evaluation' ( (lv_evaluation_8_0= ruleEvaluation ) ) )? otherlv_9= 'recommendationSystem' ( (lv_recommendationSystem_10_0= ruleRecommendationSystem ) ) (otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleFeedbackComponent ) ) )? otherlv_13= '}' ) )
            // InternalRsDsl.g:79:2: (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' ( (lv_dataset_4_0= ruleDataset ) ) )? (otherlv_5= 'presentationLayer' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) )? (otherlv_7= 'evaluation' ( (lv_evaluation_8_0= ruleEvaluation ) ) )? otherlv_9= 'recommendationSystem' ( (lv_recommendationSystem_10_0= ruleRecommendationSystem ) ) (otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleFeedbackComponent ) ) )? otherlv_13= '}' )
            {
            // InternalRsDsl.g:79:2: (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' ( (lv_dataset_4_0= ruleDataset ) ) )? (otherlv_5= 'presentationLayer' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) )? (otherlv_7= 'evaluation' ( (lv_evaluation_8_0= ruleEvaluation ) ) )? otherlv_9= 'recommendationSystem' ( (lv_recommendationSystem_10_0= ruleRecommendationSystem ) ) (otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleFeedbackComponent ) ) )? otherlv_13= '}' )
            // InternalRsDsl.g:80:3: otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' ( (lv_dataset_4_0= ruleDataset ) ) )? (otherlv_5= 'presentationLayer' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) )? (otherlv_7= 'evaluation' ( (lv_evaluation_8_0= ruleEvaluation ) ) )? otherlv_9= 'recommendationSystem' ( (lv_recommendationSystem_10_0= ruleRecommendationSystem ) ) (otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleFeedbackComponent ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRSModelAccess().getRSModelKeyword_0());
            		
            // InternalRsDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRSModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRSModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRSModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:107:3: (otherlv_3= 'dataset' ( (lv_dataset_4_0= ruleDataset ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRsDsl.g:108:4: otherlv_3= 'dataset' ( (lv_dataset_4_0= ruleDataset ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRSModelAccess().getDatasetKeyword_3_0());
                    			
                    // InternalRsDsl.g:112:4: ( (lv_dataset_4_0= ruleDataset ) )
                    // InternalRsDsl.g:113:5: (lv_dataset_4_0= ruleDataset )
                    {
                    // InternalRsDsl.g:113:5: (lv_dataset_4_0= ruleDataset )
                    // InternalRsDsl.g:114:6: lv_dataset_4_0= ruleDataset
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getDatasetDatasetParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_dataset_4_0=ruleDataset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"dataset",
                    							lv_dataset_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Dataset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:132:3: (otherlv_5= 'presentationLayer' ( (lv_presentationLayer_6_0= rulePresentationLayer ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRsDsl.g:133:4: otherlv_5= 'presentationLayer' ( (lv_presentationLayer_6_0= rulePresentationLayer ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getRSModelAccess().getPresentationLayerKeyword_4_0());
                    			
                    // InternalRsDsl.g:137:4: ( (lv_presentationLayer_6_0= rulePresentationLayer ) )
                    // InternalRsDsl.g:138:5: (lv_presentationLayer_6_0= rulePresentationLayer )
                    {
                    // InternalRsDsl.g:138:5: (lv_presentationLayer_6_0= rulePresentationLayer )
                    // InternalRsDsl.g:139:6: lv_presentationLayer_6_0= rulePresentationLayer
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getPresentationLayerPresentationLayerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_presentationLayer_6_0=rulePresentationLayer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"presentationLayer",
                    							lv_presentationLayer_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PresentationLayer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:157:3: (otherlv_7= 'evaluation' ( (lv_evaluation_8_0= ruleEvaluation ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRsDsl.g:158:4: otherlv_7= 'evaluation' ( (lv_evaluation_8_0= ruleEvaluation ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getRSModelAccess().getEvaluationKeyword_5_0());
                    			
                    // InternalRsDsl.g:162:4: ( (lv_evaluation_8_0= ruleEvaluation ) )
                    // InternalRsDsl.g:163:5: (lv_evaluation_8_0= ruleEvaluation )
                    {
                    // InternalRsDsl.g:163:5: (lv_evaluation_8_0= ruleEvaluation )
                    // InternalRsDsl.g:164:6: lv_evaluation_8_0= ruleEvaluation
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getEvaluationEvaluationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_evaluation_8_0=ruleEvaluation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"evaluation",
                    							lv_evaluation_8_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Evaluation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getRSModelAccess().getRecommendationSystemKeyword_6());
            		
            // InternalRsDsl.g:186:3: ( (lv_recommendationSystem_10_0= ruleRecommendationSystem ) )
            // InternalRsDsl.g:187:4: (lv_recommendationSystem_10_0= ruleRecommendationSystem )
            {
            // InternalRsDsl.g:187:4: (lv_recommendationSystem_10_0= ruleRecommendationSystem )
            // InternalRsDsl.g:188:5: lv_recommendationSystem_10_0= ruleRecommendationSystem
            {

            					newCompositeNode(grammarAccess.getRSModelAccess().getRecommendationSystemRecommendationSystemParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_recommendationSystem_10_0=ruleRecommendationSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRSModelRule());
            					}
            					set(
            						current,
            						"recommendationSystem",
            						lv_recommendationSystem_10_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:205:3: (otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleFeedbackComponent ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRsDsl.g:206:4: otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleFeedbackComponent ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getRSModelAccess().getFeedbackKeyword_8_0());
                    			
                    // InternalRsDsl.g:210:4: ( (lv_feedback_12_0= ruleFeedbackComponent ) )
                    // InternalRsDsl.g:211:5: (lv_feedback_12_0= ruleFeedbackComponent )
                    {
                    // InternalRsDsl.g:211:5: (lv_feedback_12_0= ruleFeedbackComponent )
                    // InternalRsDsl.g:212:6: lv_feedback_12_0= ruleFeedbackComponent
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getFeedbackFeedbackComponentParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_feedback_12_0=ruleFeedbackComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"feedback",
                    							lv_feedback_12_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.FeedbackComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRSModelAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSModel"


    // $ANTLR start "entryRuleDataset"
    // InternalRsDsl.g:238:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalRsDsl.g:238:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalRsDsl.g:239:2: iv_ruleDataset= ruleDataset EOF
            {
             newCompositeNode(grammarAccess.getDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataset=ruleDataset();

            state._fsp--;

             current =iv_ruleDataset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataset"


    // $ANTLR start "ruleDataset"
    // InternalRsDsl.g:245:1: ruleDataset returns [EObject current=null] : (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        EObject this_UnsupervisedDataset_0 = null;

        EObject this_SupervisedDataset_1 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:251:2: ( (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset ) )
            // InternalRsDsl.g:252:2: (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset )
            {
            // InternalRsDsl.g:252:2: (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 34:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==40) ) {
                    alt5=2;
                }
                else if ( (LA5_1==35) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRsDsl.g:253:3: this_UnsupervisedDataset_0= ruleUnsupervisedDataset
                    {

                    			newCompositeNode(grammarAccess.getDatasetAccess().getUnsupervisedDatasetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnsupervisedDataset_0=ruleUnsupervisedDataset();

                    state._fsp--;


                    			current = this_UnsupervisedDataset_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:262:3: this_SupervisedDataset_1= ruleSupervisedDataset
                    {

                    			newCompositeNode(grammarAccess.getDatasetAccess().getSupervisedDatasetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupervisedDataset_1=ruleSupervisedDataset();

                    state._fsp--;


                    			current = this_SupervisedDataset_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataset"


    // $ANTLR start "entryRulePresentationLayer"
    // InternalRsDsl.g:274:1: entryRulePresentationLayer returns [EObject current=null] : iv_rulePresentationLayer= rulePresentationLayer EOF ;
    public final EObject entryRulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationLayer = null;


        try {
            // InternalRsDsl.g:274:58: (iv_rulePresentationLayer= rulePresentationLayer EOF )
            // InternalRsDsl.g:275:2: iv_rulePresentationLayer= rulePresentationLayer EOF
            {
             newCompositeNode(grammarAccess.getPresentationLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentationLayer=rulePresentationLayer();

            state._fsp--;

             current =iv_rulePresentationLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresentationLayer"


    // $ANTLR start "rulePresentationLayer"
    // InternalRsDsl.g:281:1: rulePresentationLayer returns [EObject current=null] : (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes ) ;
    public final EObject rulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject this_WebIService_0 = null;

        EObject this_WebApplication_1 = null;

        EObject this_IDEIntegration_Impl_2 = null;

        EObject this_VSCodePlugin_3 = null;

        EObject this_TraversableGraph_4 = null;

        EObject this_RawOutcomes_5 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:287:2: ( (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes ) )
            // InternalRsDsl.g:288:2: (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes )
            {
            // InternalRsDsl.g:288:2: (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt6=1;
                }
                break;
            case 73:
                {
                alt6=2;
                }
                break;
            case 76:
                {
                alt6=3;
                }
                break;
            case 77:
                {
                alt6=4;
                }
                break;
            case 79:
                {
                alt6=5;
                }
                break;
            case 80:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRsDsl.g:289:3: this_WebIService_0= ruleWebIService
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getWebIServiceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WebIService_0=ruleWebIService();

                    state._fsp--;


                    			current = this_WebIService_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:298:3: this_WebApplication_1= ruleWebApplication
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getWebApplicationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WebApplication_1=ruleWebApplication();

                    state._fsp--;


                    			current = this_WebApplication_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:307:3: this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getIDEIntegration_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IDEIntegration_Impl_2=ruleIDEIntegration_Impl();

                    state._fsp--;


                    			current = this_IDEIntegration_Impl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:316:3: this_VSCodePlugin_3= ruleVSCodePlugin
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getVSCodePluginParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VSCodePlugin_3=ruleVSCodePlugin();

                    state._fsp--;


                    			current = this_VSCodePlugin_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:325:3: this_TraversableGraph_4= ruleTraversableGraph
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getTraversableGraphParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TraversableGraph_4=ruleTraversableGraph();

                    state._fsp--;


                    			current = this_TraversableGraph_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:334:3: this_RawOutcomes_5= ruleRawOutcomes
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getRawOutcomesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RawOutcomes_5=ruleRawOutcomes();

                    state._fsp--;


                    			current = this_RawOutcomes_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresentationLayer"


    // $ANTLR start "entryRuleRecommendationSystem"
    // InternalRsDsl.g:346:1: entryRuleRecommendationSystem returns [EObject current=null] : iv_ruleRecommendationSystem= ruleRecommendationSystem EOF ;
    public final EObject entryRuleRecommendationSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationSystem = null;


        try {
            // InternalRsDsl.g:346:61: (iv_ruleRecommendationSystem= ruleRecommendationSystem EOF )
            // InternalRsDsl.g:347:2: iv_ruleRecommendationSystem= ruleRecommendationSystem EOF
            {
             newCompositeNode(grammarAccess.getRecommendationSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecommendationSystem=ruleRecommendationSystem();

            state._fsp--;

             current =iv_ruleRecommendationSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecommendationSystem"


    // $ANTLR start "ruleRecommendationSystem"
    // InternalRsDsl.g:353:1: ruleRecommendationSystem returns [EObject current=null] : (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN ) ;
    public final EObject ruleRecommendationSystem() throws RecognitionException {
        EObject current = null;

        EObject this_MachineLearningBasedRS_Impl_0 = null;

        EObject this_FilteringRS_1 = null;

        EObject this_DataMiningRS_2 = null;

        EObject this_CustomRecommender_3 = null;

        EObject this_GeneticAlgorithm_4 = null;

        EObject this_DeepNN_5 = null;

        EObject this_ConvolutionalNN_6 = null;

        EObject this_Bayesian_7 = null;

        EObject this_RecurrentNN_8 = null;

        EObject this_SVM_9 = null;

        EObject this_DecisionTree_10 = null;

        EObject this_FeedForwardNN_11 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:359:2: ( (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN ) )
            // InternalRsDsl.g:360:2: (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN )
            {
            // InternalRsDsl.g:360:2: (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt7=1;
                }
                break;
            case 123:
                {
                alt7=2;
                }
                break;
            case 128:
                {
                alt7=3;
                }
                break;
            case 130:
                {
                alt7=4;
                }
                break;
            case 133:
                {
                alt7=5;
                }
                break;
            case 137:
                {
                alt7=6;
                }
                break;
            case 139:
                {
                alt7=7;
                }
                break;
            case 140:
                {
                alt7=8;
                }
                break;
            case 141:
                {
                alt7=9;
                }
                break;
            case 142:
                {
                alt7=10;
                }
                break;
            case 144:
                {
                alt7=11;
                }
                break;
            case 145:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRsDsl.g:361:3: this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getMachineLearningBasedRS_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MachineLearningBasedRS_Impl_0=ruleMachineLearningBasedRS_Impl();

                    state._fsp--;


                    			current = this_MachineLearningBasedRS_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:370:3: this_FilteringRS_1= ruleFilteringRS
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getFilteringRSParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilteringRS_1=ruleFilteringRS();

                    state._fsp--;


                    			current = this_FilteringRS_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:379:3: this_DataMiningRS_2= ruleDataMiningRS
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getDataMiningRSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataMiningRS_2=ruleDataMiningRS();

                    state._fsp--;


                    			current = this_DataMiningRS_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:388:3: this_CustomRecommender_3= ruleCustomRecommender
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getCustomRecommenderParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomRecommender_3=ruleCustomRecommender();

                    state._fsp--;


                    			current = this_CustomRecommender_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:397:3: this_GeneticAlgorithm_4= ruleGeneticAlgorithm
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getGeneticAlgorithmParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneticAlgorithm_4=ruleGeneticAlgorithm();

                    state._fsp--;


                    			current = this_GeneticAlgorithm_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:406:3: this_DeepNN_5= ruleDeepNN
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getDeepNNParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeepNN_5=ruleDeepNN();

                    state._fsp--;


                    			current = this_DeepNN_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:415:3: this_ConvolutionalNN_6= ruleConvolutionalNN
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getConvolutionalNNParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConvolutionalNN_6=ruleConvolutionalNN();

                    state._fsp--;


                    			current = this_ConvolutionalNN_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRsDsl.g:424:3: this_Bayesian_7= ruleBayesian
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getBayesianParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bayesian_7=ruleBayesian();

                    state._fsp--;


                    			current = this_Bayesian_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRsDsl.g:433:3: this_RecurrentNN_8= ruleRecurrentNN
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getRecurrentNNParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecurrentNN_8=ruleRecurrentNN();

                    state._fsp--;


                    			current = this_RecurrentNN_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRsDsl.g:442:3: this_SVM_9= ruleSVM
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getSVMParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVM_9=ruleSVM();

                    state._fsp--;


                    			current = this_SVM_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRsDsl.g:451:3: this_DecisionTree_10= ruleDecisionTree
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getDecisionTreeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecisionTree_10=ruleDecisionTree();

                    state._fsp--;


                    			current = this_DecisionTree_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRsDsl.g:460:3: this_FeedForwardNN_11= ruleFeedForwardNN
                    {

                    			newCompositeNode(grammarAccess.getRecommendationSystemAccess().getFeedForwardNNParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeedForwardNN_11=ruleFeedForwardNN();

                    state._fsp--;


                    			current = this_FeedForwardNN_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecommendationSystem"


    // $ANTLR start "entryRuleValidationTechnique"
    // InternalRsDsl.g:472:1: entryRuleValidationTechnique returns [EObject current=null] : iv_ruleValidationTechnique= ruleValidationTechnique EOF ;
    public final EObject entryRuleValidationTechnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationTechnique = null;


        try {
            // InternalRsDsl.g:472:60: (iv_ruleValidationTechnique= ruleValidationTechnique EOF )
            // InternalRsDsl.g:473:2: iv_ruleValidationTechnique= ruleValidationTechnique EOF
            {
             newCompositeNode(grammarAccess.getValidationTechniqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidationTechnique=ruleValidationTechnique();

            state._fsp--;

             current =iv_ruleValidationTechnique; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidationTechnique"


    // $ANTLR start "ruleValidationTechnique"
    // InternalRsDsl.g:479:1: ruleValidationTechnique returns [EObject current=null] : (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl ) ;
    public final EObject ruleValidationTechnique() throws RecognitionException {
        EObject current = null;

        EObject this_UserStudy_0 = null;

        EObject this_CrossValidation_1 = null;

        EObject this_ContextValidation_2 = null;

        EObject this_RandomSplitting_3 = null;

        EObject this_AutomatedValidation_Impl_4 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:485:2: ( (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl ) )
            // InternalRsDsl.g:486:2: (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl )
            {
            // InternalRsDsl.g:486:2: (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt8=1;
                }
                break;
            case 102:
                {
                alt8=2;
                }
                break;
            case 105:
                {
                alt8=3;
                }
                break;
            case 107:
                {
                alt8=4;
                }
                break;
            case 108:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRsDsl.g:487:3: this_UserStudy_0= ruleUserStudy
                    {

                    			newCompositeNode(grammarAccess.getValidationTechniqueAccess().getUserStudyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UserStudy_0=ruleUserStudy();

                    state._fsp--;


                    			current = this_UserStudy_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:496:3: this_CrossValidation_1= ruleCrossValidation
                    {

                    			newCompositeNode(grammarAccess.getValidationTechniqueAccess().getCrossValidationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossValidation_1=ruleCrossValidation();

                    state._fsp--;


                    			current = this_CrossValidation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:505:3: this_ContextValidation_2= ruleContextValidation
                    {

                    			newCompositeNode(grammarAccess.getValidationTechniqueAccess().getContextValidationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextValidation_2=ruleContextValidation();

                    state._fsp--;


                    			current = this_ContextValidation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:514:3: this_RandomSplitting_3= ruleRandomSplitting
                    {

                    			newCompositeNode(grammarAccess.getValidationTechniqueAccess().getRandomSplittingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RandomSplitting_3=ruleRandomSplitting();

                    state._fsp--;


                    			current = this_RandomSplitting_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:523:3: this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl
                    {

                    			newCompositeNode(grammarAccess.getValidationTechniqueAccess().getAutomatedValidation_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutomatedValidation_Impl_4=ruleAutomatedValidation_Impl();

                    state._fsp--;


                    			current = this_AutomatedValidation_Impl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationTechnique"


    // $ANTLR start "entryRuleFeedback"
    // InternalRsDsl.g:535:1: entryRuleFeedback returns [EObject current=null] : iv_ruleFeedback= ruleFeedback EOF ;
    public final EObject entryRuleFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedback = null;


        try {
            // InternalRsDsl.g:535:49: (iv_ruleFeedback= ruleFeedback EOF )
            // InternalRsDsl.g:536:2: iv_ruleFeedback= ruleFeedback EOF
            {
             newCompositeNode(grammarAccess.getFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedback=ruleFeedback();

            state._fsp--;

             current =iv_ruleFeedback; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeedback"


    // $ANTLR start "ruleFeedback"
    // InternalRsDsl.g:542:1: ruleFeedback returns [EObject current=null] : (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating ) ;
    public final EObject ruleFeedback() throws RecognitionException {
        EObject current = null;

        EObject this_ImplicitFeedback_0 = null;

        EObject this_HybridFeedback_1 = null;

        EObject this_AdditiveFeedback_2 = null;

        EObject this_Rating_3 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:548:2: ( (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating ) )
            // InternalRsDsl.g:549:2: (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating )
            {
            // InternalRsDsl.g:549:2: (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 153:
                {
                alt9=1;
                }
                break;
            case 155:
                {
                alt9=2;
                }
                break;
            case 156:
                {
                alt9=3;
                }
                break;
            case 159:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRsDsl.g:550:3: this_ImplicitFeedback_0= ruleImplicitFeedback
                    {

                    			newCompositeNode(grammarAccess.getFeedbackAccess().getImplicitFeedbackParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplicitFeedback_0=ruleImplicitFeedback();

                    state._fsp--;


                    			current = this_ImplicitFeedback_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:559:3: this_HybridFeedback_1= ruleHybridFeedback
                    {

                    			newCompositeNode(grammarAccess.getFeedbackAccess().getHybridFeedbackParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HybridFeedback_1=ruleHybridFeedback();

                    state._fsp--;


                    			current = this_HybridFeedback_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:568:3: this_AdditiveFeedback_2= ruleAdditiveFeedback
                    {

                    			newCompositeNode(grammarAccess.getFeedbackAccess().getAdditiveFeedbackParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdditiveFeedback_2=ruleAdditiveFeedback();

                    state._fsp--;


                    			current = this_AdditiveFeedback_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:577:3: this_Rating_3= ruleRating
                    {

                    			newCompositeNode(grammarAccess.getFeedbackAccess().getRatingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rating_3=ruleRating();

                    state._fsp--;


                    			current = this_Rating_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeedback"


    // $ANTLR start "entryRuleDataSource"
    // InternalRsDsl.g:589:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalRsDsl.g:589:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalRsDsl.g:590:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalRsDsl.g:596:1: ruleDataSource returns [EObject current=null] : (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        EObject this_CodeRepository_0 = null;

        EObject this_CommunicationChannel_1 = null;

        EObject this_BugTrackingSystem_2 = null;

        EObject this_DependencyManager_3 = null;

        EObject this_File_4 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:602:2: ( (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile ) )
            // InternalRsDsl.g:603:2: (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile )
            {
            // InternalRsDsl.g:603:2: (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 44:
            case 45:
                {
                alt10=1;
                }
                break;
            case 46:
                {
                alt10=2;
                }
                break;
            case 47:
                {
                alt10=3;
                }
                break;
            case 48:
                {
                alt10=4;
                }
                break;
            case 49:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRsDsl.g:604:3: this_CodeRepository_0= ruleCodeRepository
                    {

                    			newCompositeNode(grammarAccess.getDataSourceAccess().getCodeRepositoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeRepository_0=ruleCodeRepository();

                    state._fsp--;


                    			current = this_CodeRepository_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:613:3: this_CommunicationChannel_1= ruleCommunicationChannel
                    {

                    			newCompositeNode(grammarAccess.getDataSourceAccess().getCommunicationChannelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommunicationChannel_1=ruleCommunicationChannel();

                    state._fsp--;


                    			current = this_CommunicationChannel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:622:3: this_BugTrackingSystem_2= ruleBugTrackingSystem
                    {

                    			newCompositeNode(grammarAccess.getDataSourceAccess().getBugTrackingSystemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BugTrackingSystem_2=ruleBugTrackingSystem();

                    state._fsp--;


                    			current = this_BugTrackingSystem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:631:3: this_DependencyManager_3= ruleDependencyManager
                    {

                    			newCompositeNode(grammarAccess.getDataSourceAccess().getDependencyManagerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependencyManager_3=ruleDependencyManager();

                    state._fsp--;


                    			current = this_DependencyManager_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:640:3: this_File_4= ruleFile
                    {

                    			newCompositeNode(grammarAccess.getDataSourceAccess().getFileParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_File_4=ruleFile();

                    state._fsp--;


                    			current = this_File_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleDataStructure"
    // InternalRsDsl.g:652:1: entryRuleDataStructure returns [EObject current=null] : iv_ruleDataStructure= ruleDataStructure EOF ;
    public final EObject entryRuleDataStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataStructure = null;


        try {
            // InternalRsDsl.g:652:54: (iv_ruleDataStructure= ruleDataStructure EOF )
            // InternalRsDsl.g:653:2: iv_ruleDataStructure= ruleDataStructure EOF
            {
             newCompositeNode(grammarAccess.getDataStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataStructure=ruleDataStructure();

            state._fsp--;

             current =iv_ruleDataStructure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataStructure"


    // $ANTLR start "ruleDataStructure"
    // InternalRsDsl.g:659:1: ruleDataStructure returns [EObject current=null] : (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF ) ;
    public final EObject ruleDataStructure() throws RecognitionException {
        EObject current = null;

        EObject this_Graph_Impl_0 = null;

        EObject this_Matrix_1 = null;

        EObject this_Tree_2 = null;

        EObject this_TextualContent_3 = null;

        EObject this_ARFF_4 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:665:2: ( (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF ) )
            // InternalRsDsl.g:666:2: (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF )
            {
            // InternalRsDsl.g:666:2: (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt11=1;
                }
                break;
            case 57:
                {
                alt11=2;
                }
                break;
            case 59:
                {
                alt11=3;
                }
                break;
            case 60:
                {
                alt11=4;
                }
                break;
            case 63:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRsDsl.g:667:3: this_Graph_Impl_0= ruleGraph_Impl
                    {

                    			newCompositeNode(grammarAccess.getDataStructureAccess().getGraph_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Graph_Impl_0=ruleGraph_Impl();

                    state._fsp--;


                    			current = this_Graph_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:676:3: this_Matrix_1= ruleMatrix
                    {

                    			newCompositeNode(grammarAccess.getDataStructureAccess().getMatrixParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Matrix_1=ruleMatrix();

                    state._fsp--;


                    			current = this_Matrix_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:685:3: this_Tree_2= ruleTree
                    {

                    			newCompositeNode(grammarAccess.getDataStructureAccess().getTreeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tree_2=ruleTree();

                    state._fsp--;


                    			current = this_Tree_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:694:3: this_TextualContent_3= ruleTextualContent
                    {

                    			newCompositeNode(grammarAccess.getDataStructureAccess().getTextualContentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextualContent_3=ruleTextualContent();

                    state._fsp--;


                    			current = this_TextualContent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:703:3: this_ARFF_4= ruleARFF
                    {

                    			newCompositeNode(grammarAccess.getDataStructureAccess().getARFFParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ARFF_4=ruleARFF();

                    state._fsp--;


                    			current = this_ARFF_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataStructure"


    // $ANTLR start "entryRuleEString"
    // InternalRsDsl.g:715:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRsDsl.g:715:47: (iv_ruleEString= ruleEString EOF )
            // InternalRsDsl.g:716:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRsDsl.g:722:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:728:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRsDsl.g:729:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRsDsl.g:729:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRsDsl.g:730:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:738:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEvaluation"
    // InternalRsDsl.g:749:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // InternalRsDsl.g:749:51: (iv_ruleEvaluation= ruleEvaluation EOF )
            // InternalRsDsl.g:750:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalRsDsl.g:756:1: ruleEvaluation returns [EObject current=null] : ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '{' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'metrics' otherlv_11= '{' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= '}' )? (otherlv_16= 'validationTechnique' otherlv_17= '{' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_baselines_6_0 = null;

        AntlrDatatypeRuleToken lv_baselines_8_0 = null;

        Enumerator lv_metrics_12_0 = null;

        Enumerator lv_metrics_14_0 = null;

        EObject lv_validationTechnique_18_0 = null;

        EObject lv_validationTechnique_20_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:762:2: ( ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '{' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'metrics' otherlv_11= '{' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= '}' )? (otherlv_16= 'validationTechnique' otherlv_17= '{' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalRsDsl.g:763:2: ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '{' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'metrics' otherlv_11= '{' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= '}' )? (otherlv_16= 'validationTechnique' otherlv_17= '{' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:763:2: ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '{' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'metrics' otherlv_11= '{' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= '}' )? (otherlv_16= 'validationTechnique' otherlv_17= '{' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalRsDsl.g:764:3: () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '{' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'metrics' otherlv_11= '{' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= '}' )? (otherlv_16= 'validationTechnique' otherlv_17= '{' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalRsDsl.g:764:3: ()
            // InternalRsDsl.g:765:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvaluationAccess().getEvaluationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEvaluationKeyword_1());
            		
            // InternalRsDsl.g:775:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:776:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:776:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:777:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEvaluationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:798:3: (otherlv_4= 'baselines' otherlv_5= '{' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRsDsl.g:799:4: otherlv_4= 'baselines' otherlv_5= '{' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvaluationAccess().getBaselinesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:807:4: ( (lv_baselines_6_0= ruleEString ) )
                    // InternalRsDsl.g:808:5: (lv_baselines_6_0= ruleEString )
                    {
                    // InternalRsDsl.g:808:5: (lv_baselines_6_0= ruleEString )
                    // InternalRsDsl.g:809:6: lv_baselines_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getBaselinesEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_baselines_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    						}
                    						add(
                    							current,
                    							"baselines",
                    							lv_baselines_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:826:4: (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRsDsl.g:827:5: otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEvaluationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:831:5: ( (lv_baselines_8_0= ruleEString ) )
                    	    // InternalRsDsl.g:832:6: (lv_baselines_8_0= ruleEString )
                    	    {
                    	    // InternalRsDsl.g:832:6: (lv_baselines_8_0= ruleEString )
                    	    // InternalRsDsl.g:833:7: lv_baselines_8_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationAccess().getBaselinesEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_baselines_8_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"baselines",
                    	    								lv_baselines_8_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:856:3: (otherlv_10= 'metrics' otherlv_11= '{' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRsDsl.g:857:4: otherlv_10= 'metrics' otherlv_11= '{' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getMetricsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:865:4: ( (lv_metrics_12_0= ruleMetric ) )
                    // InternalRsDsl.g:866:5: (lv_metrics_12_0= ruleMetric )
                    {
                    // InternalRsDsl.g:866:5: (lv_metrics_12_0= ruleMetric )
                    // InternalRsDsl.g:867:6: lv_metrics_12_0= ruleMetric
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getMetricsMetricEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_metrics_12_0=ruleMetric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    						}
                    						add(
                    							current,
                    							"metrics",
                    							lv_metrics_12_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Metric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:884:4: (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRsDsl.g:885:5: otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEvaluationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:889:5: ( (lv_metrics_14_0= ruleMetric ) )
                    	    // InternalRsDsl.g:890:6: (lv_metrics_14_0= ruleMetric )
                    	    {
                    	    // InternalRsDsl.g:890:6: (lv_metrics_14_0= ruleMetric )
                    	    // InternalRsDsl.g:891:7: lv_metrics_14_0= ruleMetric
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationAccess().getMetricsMetricEnumRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_metrics_14_0=ruleMetric();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metrics",
                    	    								lv_metrics_14_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.Metric");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:914:3: (otherlv_16= 'validationTechnique' otherlv_17= '{' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRsDsl.g:915:4: otherlv_16= 'validationTechnique' otherlv_17= '{' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEvaluationAccess().getValidationTechniqueKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:923:4: ( (lv_validationTechnique_18_0= ruleValidationTechnique ) )
                    // InternalRsDsl.g:924:5: (lv_validationTechnique_18_0= ruleValidationTechnique )
                    {
                    // InternalRsDsl.g:924:5: (lv_validationTechnique_18_0= ruleValidationTechnique )
                    // InternalRsDsl.g:925:6: lv_validationTechnique_18_0= ruleValidationTechnique
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getValidationTechniqueValidationTechniqueParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_validationTechnique_18_0=ruleValidationTechnique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    						}
                    						add(
                    							current,
                    							"validationTechnique",
                    							lv_validationTechnique_18_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.ValidationTechnique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:942:4: (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRsDsl.g:943:5: otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) )
                    	    {
                    	    otherlv_19=(Token)match(input,21,FOLLOW_21); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEvaluationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:947:5: ( (lv_validationTechnique_20_0= ruleValidationTechnique ) )
                    	    // InternalRsDsl.g:948:6: (lv_validationTechnique_20_0= ruleValidationTechnique )
                    	    {
                    	    // InternalRsDsl.g:948:6: (lv_validationTechnique_20_0= ruleValidationTechnique )
                    	    // InternalRsDsl.g:949:7: lv_validationTechnique_20_0= ruleValidationTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationAccess().getValidationTechniqueValidationTechniqueParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_validationTechnique_20_0=ruleValidationTechnique();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"validationTechnique",
                    	    								lv_validationTechnique_20_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.ValidationTechnique");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleFeedbackComponent"
    // InternalRsDsl.g:980:1: entryRuleFeedbackComponent returns [EObject current=null] : iv_ruleFeedbackComponent= ruleFeedbackComponent EOF ;
    public final EObject entryRuleFeedbackComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackComponent = null;


        try {
            // InternalRsDsl.g:980:58: (iv_ruleFeedbackComponent= ruleFeedbackComponent EOF )
            // InternalRsDsl.g:981:2: iv_ruleFeedbackComponent= ruleFeedbackComponent EOF
            {
             newCompositeNode(grammarAccess.getFeedbackComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedbackComponent=ruleFeedbackComponent();

            state._fsp--;

             current =iv_ruleFeedbackComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeedbackComponent"


    // $ANTLR start "ruleFeedbackComponent"
    // InternalRsDsl.g:987:1: ruleFeedbackComponent returns [EObject current=null] : ( () otherlv_1= 'FeedbackComponent' otherlv_2= '{' (otherlv_3= 'library' ( (lv_library_4_0= ruleFeedbackLibType ) ) )? (otherlv_5= 'query' ( (lv_query_6_0= ruleRecommendationContext ) ) )? (otherlv_7= 'expressedFeedback' ( (lv_expressedFeedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleFeedbackComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_library_4_0 = null;

        EObject lv_query_6_0 = null;

        EObject lv_expressedFeedback_8_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:993:2: ( ( () otherlv_1= 'FeedbackComponent' otherlv_2= '{' (otherlv_3= 'library' ( (lv_library_4_0= ruleFeedbackLibType ) ) )? (otherlv_5= 'query' ( (lv_query_6_0= ruleRecommendationContext ) ) )? (otherlv_7= 'expressedFeedback' ( (lv_expressedFeedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' ) )
            // InternalRsDsl.g:994:2: ( () otherlv_1= 'FeedbackComponent' otherlv_2= '{' (otherlv_3= 'library' ( (lv_library_4_0= ruleFeedbackLibType ) ) )? (otherlv_5= 'query' ( (lv_query_6_0= ruleRecommendationContext ) ) )? (otherlv_7= 'expressedFeedback' ( (lv_expressedFeedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' )
            {
            // InternalRsDsl.g:994:2: ( () otherlv_1= 'FeedbackComponent' otherlv_2= '{' (otherlv_3= 'library' ( (lv_library_4_0= ruleFeedbackLibType ) ) )? (otherlv_5= 'query' ( (lv_query_6_0= ruleRecommendationContext ) ) )? (otherlv_7= 'expressedFeedback' ( (lv_expressedFeedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' )
            // InternalRsDsl.g:995:3: () otherlv_1= 'FeedbackComponent' otherlv_2= '{' (otherlv_3= 'library' ( (lv_library_4_0= ruleFeedbackLibType ) ) )? (otherlv_5= 'query' ( (lv_query_6_0= ruleRecommendationContext ) ) )? (otherlv_7= 'expressedFeedback' ( (lv_expressedFeedback_8_0= ruleFeedback ) ) )? otherlv_9= '}'
            {
            // InternalRsDsl.g:995:3: ()
            // InternalRsDsl.g:996:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeedbackComponentAccess().getFeedbackComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFeedbackComponentAccess().getFeedbackComponentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFeedbackComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:1010:3: (otherlv_3= 'library' ( (lv_library_4_0= ruleFeedbackLibType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRsDsl.g:1011:4: otherlv_3= 'library' ( (lv_library_4_0= ruleFeedbackLibType ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeedbackComponentAccess().getLibraryKeyword_3_0());
                    			
                    // InternalRsDsl.g:1015:4: ( (lv_library_4_0= ruleFeedbackLibType ) )
                    // InternalRsDsl.g:1016:5: (lv_library_4_0= ruleFeedbackLibType )
                    {
                    // InternalRsDsl.g:1016:5: (lv_library_4_0= ruleFeedbackLibType )
                    // InternalRsDsl.g:1017:6: lv_library_4_0= ruleFeedbackLibType
                    {

                    						newCompositeNode(grammarAccess.getFeedbackComponentAccess().getLibraryFeedbackLibTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_library_4_0=ruleFeedbackLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackComponentRule());
                    						}
                    						set(
                    							current,
                    							"library",
                    							lv_library_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.FeedbackLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:1035:3: (otherlv_5= 'query' ( (lv_query_6_0= ruleRecommendationContext ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRsDsl.g:1036:4: otherlv_5= 'query' ( (lv_query_6_0= ruleRecommendationContext ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getFeedbackComponentAccess().getQueryKeyword_4_0());
                    			
                    // InternalRsDsl.g:1040:4: ( (lv_query_6_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:1041:5: (lv_query_6_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:1041:5: (lv_query_6_0= ruleRecommendationContext )
                    // InternalRsDsl.g:1042:6: lv_query_6_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getFeedbackComponentAccess().getQueryRecommendationContextParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_query_6_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackComponentRule());
                    						}
                    						set(
                    							current,
                    							"query",
                    							lv_query_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:1060:3: (otherlv_7= 'expressedFeedback' ( (lv_expressedFeedback_8_0= ruleFeedback ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRsDsl.g:1061:4: otherlv_7= 'expressedFeedback' ( (lv_expressedFeedback_8_0= ruleFeedback ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeedbackComponentAccess().getExpressedFeedbackKeyword_5_0());
                    			
                    // InternalRsDsl.g:1065:4: ( (lv_expressedFeedback_8_0= ruleFeedback ) )
                    // InternalRsDsl.g:1066:5: (lv_expressedFeedback_8_0= ruleFeedback )
                    {
                    // InternalRsDsl.g:1066:5: (lv_expressedFeedback_8_0= ruleFeedback )
                    // InternalRsDsl.g:1067:6: lv_expressedFeedback_8_0= ruleFeedback
                    {

                    						newCompositeNode(grammarAccess.getFeedbackComponentAccess().getExpressedFeedbackFeedbackParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_expressedFeedback_8_0=ruleFeedback();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackComponentRule());
                    						}
                    						set(
                    							current,
                    							"expressedFeedback",
                    							lv_expressedFeedback_8_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Feedback");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFeedbackComponentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeedbackComponent"


    // $ANTLR start "entryRuleVariable"
    // InternalRsDsl.g:1093:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalRsDsl.g:1093:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalRsDsl.g:1094:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalRsDsl.g:1100:1: ruleVariable returns [EObject current=null] : ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_isMissingValueAllowed_0_0=null;
        Token lv_isMultiple_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_dataSource_8_0 = null;

        EObject lv_preprocessing_10_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:1106:2: ( ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' ) )
            // InternalRsDsl.g:1107:2: ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' )
            {
            // InternalRsDsl.g:1107:2: ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' )
            // InternalRsDsl.g:1108:3: ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}'
            {
            // InternalRsDsl.g:1108:3: ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRsDsl.g:1109:4: (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' )
                    {
                    // InternalRsDsl.g:1109:4: (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' )
                    // InternalRsDsl.g:1110:5: lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed'
                    {
                    lv_isMissingValueAllowed_0_0=(Token)match(input,28,FOLLOW_28); 

                    					newLeafNode(lv_isMissingValueAllowed_0_0, grammarAccess.getVariableAccess().getIsMissingValueAllowedIsMissingValueAllowedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "isMissingValueAllowed", lv_isMissingValueAllowed_0_0 != null, "isMissingValueAllowed");
                    				

                    }


                    }
                    break;

            }

            // InternalRsDsl.g:1122:3: ( (lv_isMultiple_1_0= 'isMultiple' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRsDsl.g:1123:4: (lv_isMultiple_1_0= 'isMultiple' )
                    {
                    // InternalRsDsl.g:1123:4: (lv_isMultiple_1_0= 'isMultiple' )
                    // InternalRsDsl.g:1124:5: lv_isMultiple_1_0= 'isMultiple'
                    {
                    lv_isMultiple_1_0=(Token)match(input,29,FOLLOW_29); 

                    					newLeafNode(lv_isMultiple_1_0, grammarAccess.getVariableAccess().getIsMultipleIsMultipleKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "isMultiple", lv_isMultiple_1_0 != null, "isMultiple");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVariableKeyword_2());
            		
            // InternalRsDsl.g:1140:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:1141:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:1141:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:1142:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getTypeKeyword_5());
            		
            // InternalRsDsl.g:1167:3: ( (lv_type_6_0= ruleVariableType ) )
            // InternalRsDsl.g:1168:4: (lv_type_6_0= ruleVariableType )
            {
            // InternalRsDsl.g:1168:4: (lv_type_6_0= ruleVariableType )
            // InternalRsDsl.g:1169:5: lv_type_6_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeVariableTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_6_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.VariableType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getDataSourceKeyword_7());
            		
            // InternalRsDsl.g:1190:3: ( (lv_dataSource_8_0= ruleDataSource ) )
            // InternalRsDsl.g:1191:4: (lv_dataSource_8_0= ruleDataSource )
            {
            // InternalRsDsl.g:1191:4: (lv_dataSource_8_0= ruleDataSource )
            // InternalRsDsl.g:1192:5: lv_dataSource_8_0= ruleDataSource
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getDataSourceDataSourceParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_34);
            lv_dataSource_8_0=ruleDataSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"dataSource",
            						lv_dataSource_8_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.DataSource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:1209:3: (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRsDsl.g:1210:4: otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getPreprocessingKeyword_9_0());
                    			
                    // InternalRsDsl.g:1214:4: ( (lv_preprocessing_10_0= rulePreprocessing ) )
                    // InternalRsDsl.g:1215:5: (lv_preprocessing_10_0= rulePreprocessing )
                    {
                    // InternalRsDsl.g:1215:5: (lv_preprocessing_10_0= rulePreprocessing )
                    // InternalRsDsl.g:1216:6: lv_preprocessing_10_0= rulePreprocessing
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getPreprocessingPreprocessingParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_preprocessing_10_0=rulePreprocessing();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"preprocessing",
                    							lv_preprocessing_10_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Preprocessing");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleUnsupervisedDataset"
    // InternalRsDsl.g:1242:1: entryRuleUnsupervisedDataset returns [EObject current=null] : iv_ruleUnsupervisedDataset= ruleUnsupervisedDataset EOF ;
    public final EObject entryRuleUnsupervisedDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsupervisedDataset = null;


        try {
            // InternalRsDsl.g:1242:60: (iv_ruleUnsupervisedDataset= ruleUnsupervisedDataset EOF )
            // InternalRsDsl.g:1243:2: iv_ruleUnsupervisedDataset= ruleUnsupervisedDataset EOF
            {
             newCompositeNode(grammarAccess.getUnsupervisedDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnsupervisedDataset=ruleUnsupervisedDataset();

            state._fsp--;

             current =iv_ruleUnsupervisedDataset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsupervisedDataset"


    // $ANTLR start "ruleUnsupervisedDataset"
    // InternalRsDsl.g:1249:1: ruleUnsupervisedDataset returns [EObject current=null] : ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleUnsupervisedDataset() throws RecognitionException {
        EObject current = null;

        Token lv_isBuiltIn_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_preprocessing_6_0 = null;

        Enumerator lv_preprocessing_8_0 = null;

        Enumerator lv_datasetManipulationLibrary_12_0 = null;

        Enumerator lv_datasetManipulationLibrary_14_0 = null;

        AntlrDatatypeRuleToken lv_path_17_0 = null;

        EObject lv_indipendentVariables_20_0 = null;

        EObject lv_indipendentVariables_22_0 = null;

        EObject lv_dataStructure_25_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:1255:2: ( ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' ) )
            // InternalRsDsl.g:1256:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' )
            {
            // InternalRsDsl.g:1256:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' )
            // InternalRsDsl.g:1257:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}'
            {
            // InternalRsDsl.g:1257:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRsDsl.g:1258:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    {
                    // InternalRsDsl.g:1258:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    // InternalRsDsl.g:1259:5: lv_isBuiltIn_0_0= 'isBuiltIn'
                    {
                    lv_isBuiltIn_0_0=(Token)match(input,34,FOLLOW_36); 

                    					newLeafNode(lv_isBuiltIn_0_0, grammarAccess.getUnsupervisedDatasetAccess().getIsBuiltInIsBuiltInKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsupervisedDatasetRule());
                    					}
                    					setWithLastConsumed(current, "isBuiltIn", lv_isBuiltIn_0_0 != null, "isBuiltIn");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUnsupervisedDatasetAccess().getUnsupervisedDatasetKeyword_1());
            		
            // InternalRsDsl.g:1275:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:1276:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:1276:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:1277:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getUnsupervisedDatasetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:1298:3: (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRsDsl.g:1299:4: otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnsupervisedDatasetAccess().getPreprocessingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getUnsupervisedDatasetAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:1307:4: ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) )
                    // InternalRsDsl.g:1308:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    {
                    // InternalRsDsl.g:1308:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    // InternalRsDsl.g:1309:6: lv_preprocessing_6_0= rulePreprocessingTechnique
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_preprocessing_6_0=rulePreprocessingTechnique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
                    						}
                    						add(
                    							current,
                    							"preprocessing",
                    							lv_preprocessing_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PreprocessingTechnique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:1326:4: (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==21) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalRsDsl.g:1327:5: otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_38); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUnsupervisedDatasetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:1331:5: ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    // InternalRsDsl.g:1332:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    {
                    	    // InternalRsDsl.g:1332:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    // InternalRsDsl.g:1333:7: lv_preprocessing_8_0= rulePreprocessingTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_preprocessing_8_0=rulePreprocessingTechnique();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"preprocessing",
                    	    								lv_preprocessing_8_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.PreprocessingTechnique");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_39); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnsupervisedDatasetAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1356:3: (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRsDsl.g:1357:4: otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnsupervisedDatasetAccess().getDatasetManipulationLibraryKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnsupervisedDatasetAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:1365:4: ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) )
                    // InternalRsDsl.g:1366:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    {
                    // InternalRsDsl.g:1366:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    // InternalRsDsl.g:1367:6: lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_datasetManipulationLibrary_12_0=ruleDatasetManipulationLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
                    						}
                    						add(
                    							current,
                    							"datasetManipulationLibrary",
                    							lv_datasetManipulationLibrary_12_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.DatasetManipulationLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:1384:4: (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==21) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRsDsl.g:1385:5: otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_40); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getUnsupervisedDatasetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:1389:5: ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    // InternalRsDsl.g:1390:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    {
                    	    // InternalRsDsl.g:1390:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    // InternalRsDsl.g:1391:7: lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_datasetManipulationLibrary_14_0=ruleDatasetManipulationLibrary();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"datasetManipulationLibrary",
                    	    								lv_datasetManipulationLibrary_14_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.DatasetManipulationLibrary");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_41); 

                    				newLeafNode(otherlv_15, grammarAccess.getUnsupervisedDatasetAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getUnsupervisedDatasetAccess().getPathKeyword_6());
            		
            // InternalRsDsl.g:1418:3: ( (lv_path_17_0= ruleEString ) )
            // InternalRsDsl.g:1419:4: (lv_path_17_0= ruleEString )
            {
            // InternalRsDsl.g:1419:4: (lv_path_17_0= ruleEString )
            // InternalRsDsl.g:1420:5: lv_path_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getPathEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_42);
            lv_path_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_17_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:1437:3: (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRsDsl.g:1438:4: otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getUnsupervisedDatasetAccess().getIndipendentVariablesKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_19, grammarAccess.getUnsupervisedDatasetAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:1446:4: ( (lv_indipendentVariables_20_0= ruleVariable ) )
                    // InternalRsDsl.g:1447:5: (lv_indipendentVariables_20_0= ruleVariable )
                    {
                    // InternalRsDsl.g:1447:5: (lv_indipendentVariables_20_0= ruleVariable )
                    // InternalRsDsl.g:1448:6: lv_indipendentVariables_20_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_indipendentVariables_20_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
                    						}
                    						add(
                    							current,
                    							"indipendentVariables",
                    							lv_indipendentVariables_20_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:1465:4: (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==21) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalRsDsl.g:1466:5: otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    {
                    	    otherlv_21=(Token)match(input,21,FOLLOW_43); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getUnsupervisedDatasetAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:1470:5: ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    // InternalRsDsl.g:1471:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    {
                    	    // InternalRsDsl.g:1471:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    // InternalRsDsl.g:1472:7: lv_indipendentVariables_22_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_indipendentVariables_22_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"indipendentVariables",
                    	    								lv_indipendentVariables_22_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,18,FOLLOW_44); 

                    				newLeafNode(otherlv_23, grammarAccess.getUnsupervisedDatasetAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1495:3: (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRsDsl.g:1496:4: otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    {
                    otherlv_24=(Token)match(input,39,FOLLOW_45); 

                    				newLeafNode(otherlv_24, grammarAccess.getUnsupervisedDatasetAccess().getDataStructureKeyword_9_0());
                    			
                    // InternalRsDsl.g:1500:4: ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    // InternalRsDsl.g:1501:5: (lv_dataStructure_25_0= ruleDataStructure )
                    {
                    // InternalRsDsl.g:1501:5: (lv_dataStructure_25_0= ruleDataStructure )
                    // InternalRsDsl.g:1502:6: lv_dataStructure_25_0= ruleDataStructure
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getDataStructureDataStructureParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_dataStructure_25_0=ruleDataStructure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnsupervisedDatasetRule());
                    						}
                    						set(
                    							current,
                    							"dataStructure",
                    							lv_dataStructure_25_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.DataStructure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getUnsupervisedDatasetAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsupervisedDataset"


    // $ANTLR start "entryRuleSupervisedDataset"
    // InternalRsDsl.g:1528:1: entryRuleSupervisedDataset returns [EObject current=null] : iv_ruleSupervisedDataset= ruleSupervisedDataset EOF ;
    public final EObject entryRuleSupervisedDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupervisedDataset = null;


        try {
            // InternalRsDsl.g:1528:58: (iv_ruleSupervisedDataset= ruleSupervisedDataset EOF )
            // InternalRsDsl.g:1529:2: iv_ruleSupervisedDataset= ruleSupervisedDataset EOF
            {
             newCompositeNode(grammarAccess.getSupervisedDatasetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupervisedDataset=ruleSupervisedDataset();

            state._fsp--;

             current =iv_ruleSupervisedDataset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSupervisedDataset"


    // $ANTLR start "ruleSupervisedDataset"
    // InternalRsDsl.g:1535:1: ruleSupervisedDataset returns [EObject current=null] : ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' ) ;
    public final EObject ruleSupervisedDataset() throws RecognitionException {
        EObject current = null;

        Token lv_isBuiltIn_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_preprocessing_6_0 = null;

        Enumerator lv_preprocessing_8_0 = null;

        Enumerator lv_datasetManipulationLibrary_12_0 = null;

        Enumerator lv_datasetManipulationLibrary_14_0 = null;

        AntlrDatatypeRuleToken lv_path_17_0 = null;

        EObject lv_indipendentVariables_20_0 = null;

        EObject lv_indipendentVariables_22_0 = null;

        EObject lv_dataStructure_25_0 = null;

        EObject lv_dependatVariable_27_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:1541:2: ( ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' ) )
            // InternalRsDsl.g:1542:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' )
            {
            // InternalRsDsl.g:1542:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' )
            // InternalRsDsl.g:1543:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}'
            {
            // InternalRsDsl.g:1543:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRsDsl.g:1544:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    {
                    // InternalRsDsl.g:1544:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    // InternalRsDsl.g:1545:5: lv_isBuiltIn_0_0= 'isBuiltIn'
                    {
                    lv_isBuiltIn_0_0=(Token)match(input,34,FOLLOW_46); 

                    					newLeafNode(lv_isBuiltIn_0_0, grammarAccess.getSupervisedDatasetAccess().getIsBuiltInIsBuiltInKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSupervisedDatasetRule());
                    					}
                    					setWithLastConsumed(current, "isBuiltIn", lv_isBuiltIn_0_0 != null, "isBuiltIn");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSupervisedDatasetAccess().getSupervisedDatasetKeyword_1());
            		
            // InternalRsDsl.g:1561:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:1562:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:1562:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:1563:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getSupervisedDatasetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:1584:3: (otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRsDsl.g:1585:4: otherlv_4= 'preprocessing' otherlv_5= '{' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSupervisedDatasetAccess().getPreprocessingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getSupervisedDatasetAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:1593:4: ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) )
                    // InternalRsDsl.g:1594:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    {
                    // InternalRsDsl.g:1594:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    // InternalRsDsl.g:1595:6: lv_preprocessing_6_0= rulePreprocessingTechnique
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_preprocessing_6_0=rulePreprocessingTechnique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
                    						}
                    						add(
                    							current,
                    							"preprocessing",
                    							lv_preprocessing_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PreprocessingTechnique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:1612:4: (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRsDsl.g:1613:5: otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_38); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSupervisedDatasetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:1617:5: ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    // InternalRsDsl.g:1618:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    {
                    	    // InternalRsDsl.g:1618:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    // InternalRsDsl.g:1619:7: lv_preprocessing_8_0= rulePreprocessingTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_preprocessing_8_0=rulePreprocessingTechnique();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"preprocessing",
                    	    								lv_preprocessing_8_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.PreprocessingTechnique");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_39); 

                    				newLeafNode(otherlv_9, grammarAccess.getSupervisedDatasetAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1642:3: (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRsDsl.g:1643:4: otherlv_10= 'datasetManipulationLibrary' otherlv_11= '{' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getSupervisedDatasetAccess().getDatasetManipulationLibraryKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_11, grammarAccess.getSupervisedDatasetAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:1651:4: ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) )
                    // InternalRsDsl.g:1652:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    {
                    // InternalRsDsl.g:1652:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    // InternalRsDsl.g:1653:6: lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_datasetManipulationLibrary_12_0=ruleDatasetManipulationLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
                    						}
                    						add(
                    							current,
                    							"datasetManipulationLibrary",
                    							lv_datasetManipulationLibrary_12_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.DatasetManipulationLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:1670:4: (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRsDsl.g:1671:5: otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_40); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSupervisedDatasetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:1675:5: ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    // InternalRsDsl.g:1676:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    {
                    	    // InternalRsDsl.g:1676:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    // InternalRsDsl.g:1677:7: lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_datasetManipulationLibrary_14_0=ruleDatasetManipulationLibrary();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"datasetManipulationLibrary",
                    	    								lv_datasetManipulationLibrary_14_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.DatasetManipulationLibrary");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_41); 

                    				newLeafNode(otherlv_15, grammarAccess.getSupervisedDatasetAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getSupervisedDatasetAccess().getPathKeyword_6());
            		
            // InternalRsDsl.g:1704:3: ( (lv_path_17_0= ruleEString ) )
            // InternalRsDsl.g:1705:4: (lv_path_17_0= ruleEString )
            {
            // InternalRsDsl.g:1705:4: (lv_path_17_0= ruleEString )
            // InternalRsDsl.g:1706:5: lv_path_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getPathEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_47);
            lv_path_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_17_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:1723:3: (otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRsDsl.g:1724:4: otherlv_18= 'indipendentVariables' otherlv_19= '{' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getSupervisedDatasetAccess().getIndipendentVariablesKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_19, grammarAccess.getSupervisedDatasetAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:1732:4: ( (lv_indipendentVariables_20_0= ruleVariable ) )
                    // InternalRsDsl.g:1733:5: (lv_indipendentVariables_20_0= ruleVariable )
                    {
                    // InternalRsDsl.g:1733:5: (lv_indipendentVariables_20_0= ruleVariable )
                    // InternalRsDsl.g:1734:6: lv_indipendentVariables_20_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_indipendentVariables_20_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
                    						}
                    						add(
                    							current,
                    							"indipendentVariables",
                    							lv_indipendentVariables_20_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:1751:4: (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRsDsl.g:1752:5: otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    {
                    	    otherlv_21=(Token)match(input,21,FOLLOW_43); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getSupervisedDatasetAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:1756:5: ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    // InternalRsDsl.g:1757:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    {
                    	    // InternalRsDsl.g:1757:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    // InternalRsDsl.g:1758:7: lv_indipendentVariables_22_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_indipendentVariables_22_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"indipendentVariables",
                    	    								lv_indipendentVariables_22_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,18,FOLLOW_48); 

                    				newLeafNode(otherlv_23, grammarAccess.getSupervisedDatasetAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1781:3: (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRsDsl.g:1782:4: otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    {
                    otherlv_24=(Token)match(input,39,FOLLOW_45); 

                    				newLeafNode(otherlv_24, grammarAccess.getSupervisedDatasetAccess().getDataStructureKeyword_9_0());
                    			
                    // InternalRsDsl.g:1786:4: ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    // InternalRsDsl.g:1787:5: (lv_dataStructure_25_0= ruleDataStructure )
                    {
                    // InternalRsDsl.g:1787:5: (lv_dataStructure_25_0= ruleDataStructure )
                    // InternalRsDsl.g:1788:6: lv_dataStructure_25_0= ruleDataStructure
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDataStructureDataStructureParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_dataStructure_25_0=ruleDataStructure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
                    						}
                    						set(
                    							current,
                    							"dataStructure",
                    							lv_dataStructure_25_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.DataStructure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,41,FOLLOW_43); 

            			newLeafNode(otherlv_26, grammarAccess.getSupervisedDatasetAccess().getDependatVariableKeyword_10());
            		
            // InternalRsDsl.g:1810:3: ( (lv_dependatVariable_27_0= ruleVariable ) )
            // InternalRsDsl.g:1811:4: (lv_dependatVariable_27_0= ruleVariable )
            {
            // InternalRsDsl.g:1811:4: (lv_dependatVariable_27_0= ruleVariable )
            // InternalRsDsl.g:1812:5: lv_dependatVariable_27_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDependatVariableVariableParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_15);
            lv_dependatVariable_27_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisedDatasetRule());
            					}
            					set(
            						current,
            						"dependatVariable",
            						lv_dependatVariable_27_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_28=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSupervisedDatasetAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupervisedDataset"


    // $ANTLR start "entryRulePreprocessing"
    // InternalRsDsl.g:1837:1: entryRulePreprocessing returns [EObject current=null] : iv_rulePreprocessing= rulePreprocessing EOF ;
    public final EObject entryRulePreprocessing() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreprocessing = null;


        try {
            // InternalRsDsl.g:1837:54: (iv_rulePreprocessing= rulePreprocessing EOF )
            // InternalRsDsl.g:1838:2: iv_rulePreprocessing= rulePreprocessing EOF
            {
             newCompositeNode(grammarAccess.getPreprocessingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreprocessing=rulePreprocessing();

            state._fsp--;

             current =iv_rulePreprocessing; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreprocessing"


    // $ANTLR start "rulePreprocessing"
    // InternalRsDsl.g:1844:1: rulePreprocessing returns [EObject current=null] : ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '{' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePreprocessing() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_preprocessigTechnique_5_0 = null;

        Enumerator lv_preprocessigTechnique_7_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:1850:2: ( ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '{' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRsDsl.g:1851:2: ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '{' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRsDsl.g:1851:2: ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '{' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRsDsl.g:1852:3: () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '{' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRsDsl.g:1852:3: ()
            // InternalRsDsl.g:1853:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPreprocessingAccess().getPreprocessingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPreprocessingAccess().getPreprocessingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getPreprocessingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:1867:3: (otherlv_3= 'preprocessigTechnique' otherlv_4= '{' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRsDsl.g:1868:4: otherlv_3= 'preprocessigTechnique' otherlv_4= '{' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPreprocessingAccess().getPreprocessigTechniqueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getPreprocessingAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRsDsl.g:1876:4: ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) )
                    // InternalRsDsl.g:1877:5: (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique )
                    {
                    // InternalRsDsl.g:1877:5: (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique )
                    // InternalRsDsl.g:1878:6: lv_preprocessigTechnique_5_0= rulePreprocessingTechnique
                    {

                    						newCompositeNode(grammarAccess.getPreprocessingAccess().getPreprocessigTechniquePreprocessingTechniqueEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_preprocessigTechnique_5_0=rulePreprocessingTechnique();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPreprocessingRule());
                    						}
                    						add(
                    							current,
                    							"preprocessigTechnique",
                    							lv_preprocessigTechnique_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PreprocessingTechnique");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:1895:4: (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==21) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalRsDsl.g:1896:5: otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_38); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPreprocessingAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRsDsl.g:1900:5: ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) )
                    	    // InternalRsDsl.g:1901:6: (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique )
                    	    {
                    	    // InternalRsDsl.g:1901:6: (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique )
                    	    // InternalRsDsl.g:1902:7: lv_preprocessigTechnique_7_0= rulePreprocessingTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getPreprocessingAccess().getPreprocessigTechniquePreprocessingTechniqueEnumRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_preprocessigTechnique_7_0=rulePreprocessingTechnique();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPreprocessingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"preprocessigTechnique",
                    	    								lv_preprocessigTechnique_7_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.PreprocessingTechnique");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getPreprocessingAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPreprocessingAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreprocessing"


    // $ANTLR start "entryRuleCodeRepository"
    // InternalRsDsl.g:1933:1: entryRuleCodeRepository returns [EObject current=null] : iv_ruleCodeRepository= ruleCodeRepository EOF ;
    public final EObject entryRuleCodeRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRepository = null;


        try {
            // InternalRsDsl.g:1933:55: (iv_ruleCodeRepository= ruleCodeRepository EOF )
            // InternalRsDsl.g:1934:2: iv_ruleCodeRepository= ruleCodeRepository EOF
            {
             newCompositeNode(grammarAccess.getCodeRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeRepository=ruleCodeRepository();

            state._fsp--;

             current =iv_ruleCodeRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeRepository"


    // $ANTLR start "ruleCodeRepository"
    // InternalRsDsl.g:1940:1: ruleCodeRepository returns [EObject current=null] : ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleCodeRepository() throws RecognitionException {
        EObject current = null;

        Token lv_metadata_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:1946:2: ( ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalRsDsl.g:1947:2: ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:1947:2: ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) )
            // InternalRsDsl.g:1948:3: () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalRsDsl.g:1948:3: ()
            // InternalRsDsl.g:1949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeRepositoryAccess().getCodeRepositoryAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:1955:3: ( (lv_metadata_1_0= 'metadata' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRsDsl.g:1956:4: (lv_metadata_1_0= 'metadata' )
                    {
                    // InternalRsDsl.g:1956:4: (lv_metadata_1_0= 'metadata' )
                    // InternalRsDsl.g:1957:5: lv_metadata_1_0= 'metadata'
                    {
                    lv_metadata_1_0=(Token)match(input,44,FOLLOW_51); 

                    					newLeafNode(lv_metadata_1_0, grammarAccess.getCodeRepositoryAccess().getMetadataMetadataKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCodeRepositoryRule());
                    					}
                    					setWithLastConsumed(current, "metadata", lv_metadata_1_0 != null, "metadata");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCodeRepositoryAccess().getCodeRepositoryKeyword_2());
            		
            // InternalRsDsl.g:1973:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:1974:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:1974:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:1975:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCodeRepositoryAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeRepositoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeRepository"


    // $ANTLR start "entryRuleCommunicationChannel"
    // InternalRsDsl.g:1996:1: entryRuleCommunicationChannel returns [EObject current=null] : iv_ruleCommunicationChannel= ruleCommunicationChannel EOF ;
    public final EObject entryRuleCommunicationChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationChannel = null;


        try {
            // InternalRsDsl.g:1996:61: (iv_ruleCommunicationChannel= ruleCommunicationChannel EOF )
            // InternalRsDsl.g:1997:2: iv_ruleCommunicationChannel= ruleCommunicationChannel EOF
            {
             newCompositeNode(grammarAccess.getCommunicationChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationChannel=ruleCommunicationChannel();

            state._fsp--;

             current =iv_ruleCommunicationChannel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommunicationChannel"


    // $ANTLR start "ruleCommunicationChannel"
    // InternalRsDsl.g:2003:1: ruleCommunicationChannel returns [EObject current=null] : ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2009:2: ( ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRsDsl.g:2010:2: ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:2010:2: ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRsDsl.g:2011:3: () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRsDsl.g:2011:3: ()
            // InternalRsDsl.g:2012:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationChannelAccess().getCommunicationChannelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommunicationChannelAccess().getCommunicationChannelKeyword_1());
            		
            // InternalRsDsl.g:2022:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2023:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2023:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2024:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommunicationChannelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationChannelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommunicationChannel"


    // $ANTLR start "entryRuleBugTrackingSystem"
    // InternalRsDsl.g:2045:1: entryRuleBugTrackingSystem returns [EObject current=null] : iv_ruleBugTrackingSystem= ruleBugTrackingSystem EOF ;
    public final EObject entryRuleBugTrackingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBugTrackingSystem = null;


        try {
            // InternalRsDsl.g:2045:58: (iv_ruleBugTrackingSystem= ruleBugTrackingSystem EOF )
            // InternalRsDsl.g:2046:2: iv_ruleBugTrackingSystem= ruleBugTrackingSystem EOF
            {
             newCompositeNode(grammarAccess.getBugTrackingSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBugTrackingSystem=ruleBugTrackingSystem();

            state._fsp--;

             current =iv_ruleBugTrackingSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBugTrackingSystem"


    // $ANTLR start "ruleBugTrackingSystem"
    // InternalRsDsl.g:2052:1: ruleBugTrackingSystem returns [EObject current=null] : ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBugTrackingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2058:2: ( ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRsDsl.g:2059:2: ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:2059:2: ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRsDsl.g:2060:3: () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRsDsl.g:2060:3: ()
            // InternalRsDsl.g:2061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBugTrackingSystemAccess().getBugTrackingSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBugTrackingSystemAccess().getBugTrackingSystemKeyword_1());
            		
            // InternalRsDsl.g:2071:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2072:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2072:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2073:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBugTrackingSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBugTrackingSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBugTrackingSystem"


    // $ANTLR start "entryRuleDependencyManager"
    // InternalRsDsl.g:2094:1: entryRuleDependencyManager returns [EObject current=null] : iv_ruleDependencyManager= ruleDependencyManager EOF ;
    public final EObject entryRuleDependencyManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyManager = null;


        try {
            // InternalRsDsl.g:2094:58: (iv_ruleDependencyManager= ruleDependencyManager EOF )
            // InternalRsDsl.g:2095:2: iv_ruleDependencyManager= ruleDependencyManager EOF
            {
             newCompositeNode(grammarAccess.getDependencyManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyManager=ruleDependencyManager();

            state._fsp--;

             current =iv_ruleDependencyManager; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyManager"


    // $ANTLR start "ruleDependencyManager"
    // InternalRsDsl.g:2101:1: ruleDependencyManager returns [EObject current=null] : ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDependencyManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2107:2: ( ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRsDsl.g:2108:2: ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:2108:2: ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRsDsl.g:2109:3: () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRsDsl.g:2109:3: ()
            // InternalRsDsl.g:2110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependencyManagerAccess().getDependencyManagerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyManagerAccess().getDependencyManagerKeyword_1());
            		
            // InternalRsDsl.g:2120:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2121:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2121:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2122:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDependencyManagerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependencyManagerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyManager"


    // $ANTLR start "entryRuleFile"
    // InternalRsDsl.g:2143:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalRsDsl.g:2143:45: (iv_ruleFile= ruleFile EOF )
            // InternalRsDsl.g:2144:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalRsDsl.g:2150:1: ruleFile returns [EObject current=null] : ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_sourcePath_5_0 = null;

        AntlrDatatypeRuleToken lv_encoding_7_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2156:2: ( ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:2157:2: ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:2157:2: ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:2158:3: () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:2158:3: ()
            // InternalRsDsl.g:2159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getFileKeyword_1());
            		
            // InternalRsDsl.g:2169:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2170:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2170:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2171:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2192:3: (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRsDsl.g:2193:4: otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFileAccess().getSourcePathKeyword_4_0());
                    			
                    // InternalRsDsl.g:2197:4: ( (lv_sourcePath_5_0= ruleEString ) )
                    // InternalRsDsl.g:2198:5: (lv_sourcePath_5_0= ruleEString )
                    {
                    // InternalRsDsl.g:2198:5: (lv_sourcePath_5_0= ruleEString )
                    // InternalRsDsl.g:2199:6: lv_sourcePath_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileAccess().getSourcePathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_sourcePath_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileRule());
                    						}
                    						set(
                    							current,
                    							"sourcePath",
                    							lv_sourcePath_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:2217:3: (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRsDsl.g:2218:4: otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFileAccess().getEncodingKeyword_5_0());
                    			
                    // InternalRsDsl.g:2222:4: ( (lv_encoding_7_0= ruleEString ) )
                    // InternalRsDsl.g:2223:5: (lv_encoding_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:2223:5: (lv_encoding_7_0= ruleEString )
                    // InternalRsDsl.g:2224:6: lv_encoding_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileAccess().getEncodingEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_encoding_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileRule());
                    						}
                    						set(
                    							current,
                    							"encoding",
                    							lv_encoding_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFileAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleGraph_Impl"
    // InternalRsDsl.g:2250:1: entryRuleGraph_Impl returns [EObject current=null] : iv_ruleGraph_Impl= ruleGraph_Impl EOF ;
    public final EObject entryRuleGraph_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph_Impl = null;


        try {
            // InternalRsDsl.g:2250:51: (iv_ruleGraph_Impl= ruleGraph_Impl EOF )
            // InternalRsDsl.g:2251:2: iv_ruleGraph_Impl= ruleGraph_Impl EOF
            {
             newCompositeNode(grammarAccess.getGraph_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph_Impl=ruleGraph_Impl();

            state._fsp--;

             current =iv_ruleGraph_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraph_Impl"


    // $ANTLR start "ruleGraph_Impl"
    // InternalRsDsl.g:2257:1: ruleGraph_Impl returns [EObject current=null] : ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleGraph_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_relations_11_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2263:2: ( ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) )
            // InternalRsDsl.g:2264:2: ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            {
            // InternalRsDsl.g:2264:2: ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            // InternalRsDsl.g:2265:3: () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}'
            {
            // InternalRsDsl.g:2265:3: ()
            // InternalRsDsl.g:2266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraph_ImplAccess().getGraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGraph_ImplAccess().getGraphKeyword_1());
            		
            // InternalRsDsl.g:2276:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2277:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2277:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2278:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraph_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraph_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getGraph_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2299:3: (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRsDsl.g:2300:4: otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_55); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraph_ImplAccess().getNodesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getGraph_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2308:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2309:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2309:5: ( ruleEString )
                    // InternalRsDsl.g:2310:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraph_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraph_ImplAccess().getNodesVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2324:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==21) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalRsDsl.g:2325:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGraph_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2329:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2330:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2330:6: ( ruleEString )
                    	    // InternalRsDsl.g:2331:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGraph_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGraph_ImplAccess().getNodesVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,55,FOLLOW_57); 

                    				newLeafNode(otherlv_9, grammarAccess.getGraph_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:2351:3: (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRsDsl.g:2352:4: otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) )
                    {
                    otherlv_10=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraph_ImplAccess().getRelationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:2356:4: ( (lv_relations_11_0= ruleVariableRelation ) )
                    // InternalRsDsl.g:2357:5: (lv_relations_11_0= ruleVariableRelation )
                    {
                    // InternalRsDsl.g:2357:5: (lv_relations_11_0= ruleVariableRelation )
                    // InternalRsDsl.g:2358:6: lv_relations_11_0= ruleVariableRelation
                    {

                    						newCompositeNode(grammarAccess.getGraph_ImplAccess().getRelationsVariableRelationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_relations_11_0=ruleVariableRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGraph_ImplRule());
                    						}
                    						set(
                    							current,
                    							"relations",
                    							lv_relations_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.VariableRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getGraph_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraph_Impl"


    // $ANTLR start "entryRuleMatrix"
    // InternalRsDsl.g:2384:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalRsDsl.g:2384:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalRsDsl.g:2385:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalRsDsl.g:2391:1: ruleMatrix returns [EObject current=null] : ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2397:2: ( ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalRsDsl.g:2398:2: ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalRsDsl.g:2398:2: ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalRsDsl.g:2399:3: () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalRsDsl.g:2399:3: ()
            // InternalRsDsl.g:2400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatrixAccess().getMatrixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getMatrixKeyword_1());
            		
            // InternalRsDsl.g:2410:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2411:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2411:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2412:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMatrixAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatrixRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2433:3: (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRsDsl.g:2434:4: otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_55); 

                    				newLeafNode(otherlv_4, grammarAccess.getMatrixAccess().getColumnsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2442:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2443:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2443:5: ( ruleEString )
                    // InternalRsDsl.g:2444:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMatrixRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMatrixAccess().getColumnsVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2458:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==21) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalRsDsl.g:2459:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMatrixAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2463:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2464:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2464:6: ( ruleEString )
                    	    // InternalRsDsl.g:2465:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMatrixRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMatrixAccess().getColumnsVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,55,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getMatrixAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMatrixAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleTree"
    // InternalRsDsl.g:2493:1: entryRuleTree returns [EObject current=null] : iv_ruleTree= ruleTree EOF ;
    public final EObject entryRuleTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTree = null;


        try {
            // InternalRsDsl.g:2493:45: (iv_ruleTree= ruleTree EOF )
            // InternalRsDsl.g:2494:2: iv_ruleTree= ruleTree EOF
            {
             newCompositeNode(grammarAccess.getTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTree=ruleTree();

            state._fsp--;

             current =iv_ruleTree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTree"


    // $ANTLR start "ruleTree"
    // InternalRsDsl.g:2500:1: ruleTree returns [EObject current=null] : ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_relations_11_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2506:2: ( ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) )
            // InternalRsDsl.g:2507:2: ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            {
            // InternalRsDsl.g:2507:2: ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            // InternalRsDsl.g:2508:3: () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}'
            {
            // InternalRsDsl.g:2508:3: ()
            // InternalRsDsl.g:2509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTreeAccess().getTreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTreeAccess().getTreeKeyword_1());
            		
            // InternalRsDsl.g:2519:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2520:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2520:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2521:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTreeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTreeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getTreeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2542:3: (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==53) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRsDsl.g:2543:4: otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_55); 

                    				newLeafNode(otherlv_4, grammarAccess.getTreeAccess().getNodesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTreeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2551:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2552:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2552:5: ( ruleEString )
                    // InternalRsDsl.g:2553:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTreeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTreeAccess().getNodesVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2567:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==21) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRsDsl.g:2568:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTreeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2572:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2573:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2573:6: ( ruleEString )
                    	    // InternalRsDsl.g:2574:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTreeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTreeAccess().getNodesVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,55,FOLLOW_57); 

                    				newLeafNode(otherlv_9, grammarAccess.getTreeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:2594:3: (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRsDsl.g:2595:4: otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) )
                    {
                    otherlv_10=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_10, grammarAccess.getTreeAccess().getRelationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:2599:4: ( (lv_relations_11_0= ruleVariableRelation ) )
                    // InternalRsDsl.g:2600:5: (lv_relations_11_0= ruleVariableRelation )
                    {
                    // InternalRsDsl.g:2600:5: (lv_relations_11_0= ruleVariableRelation )
                    // InternalRsDsl.g:2601:6: lv_relations_11_0= ruleVariableRelation
                    {

                    						newCompositeNode(grammarAccess.getTreeAccess().getRelationsVariableRelationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_relations_11_0=ruleVariableRelation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTreeRule());
                    						}
                    						set(
                    							current,
                    							"relations",
                    							lv_relations_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.VariableRelation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTreeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTree"


    // $ANTLR start "entryRuleTextualContent"
    // InternalRsDsl.g:2627:1: entryRuleTextualContent returns [EObject current=null] : iv_ruleTextualContent= ruleTextualContent EOF ;
    public final EObject entryRuleTextualContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualContent = null;


        try {
            // InternalRsDsl.g:2627:55: (iv_ruleTextualContent= ruleTextualContent EOF )
            // InternalRsDsl.g:2628:2: iv_ruleTextualContent= ruleTextualContent EOF
            {
             newCompositeNode(grammarAccess.getTextualContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextualContent=ruleTextualContent();

            state._fsp--;

             current =iv_ruleTextualContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextualContent"


    // $ANTLR start "ruleTextualContent"
    // InternalRsDsl.g:2634:1: ruleTextualContent returns [EObject current=null] : ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleTextualContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_rootPath_5_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2640:2: ( ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:2641:2: ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:2641:2: ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:2642:3: () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:2642:3: ()
            // InternalRsDsl.g:2643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextualContentAccess().getTextualContentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTextualContentAccess().getTextualContentKeyword_1());
            		
            // InternalRsDsl.g:2653:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2654:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2654:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2655:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextualContentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextualContentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_3, grammarAccess.getTextualContentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2676:3: (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==61) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRsDsl.g:2677:4: otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextualContentAccess().getRootPathKeyword_4_0());
                    			
                    // InternalRsDsl.g:2681:4: ( (lv_rootPath_5_0= ruleEString ) )
                    // InternalRsDsl.g:2682:5: (lv_rootPath_5_0= ruleEString )
                    {
                    // InternalRsDsl.g:2682:5: (lv_rootPath_5_0= ruleEString )
                    // InternalRsDsl.g:2683:6: lv_rootPath_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextualContentAccess().getRootPathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_rootPath_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextualContentRule());
                    						}
                    						set(
                    							current,
                    							"rootPath",
                    							lv_rootPath_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:2701:3: (otherlv_6= 'contents' ( ( ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRsDsl.g:2702:4: otherlv_6= 'contents' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextualContentAccess().getContentsKeyword_5_0());
                    			
                    // InternalRsDsl.g:2706:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2707:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2707:5: ( ruleEString )
                    // InternalRsDsl.g:2708:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextualContentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextualContentAccess().getContentsVariableCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTextualContentAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextualContent"


    // $ANTLR start "entryRuleARFF"
    // InternalRsDsl.g:2731:1: entryRuleARFF returns [EObject current=null] : iv_ruleARFF= ruleARFF EOF ;
    public final EObject entryRuleARFF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARFF = null;


        try {
            // InternalRsDsl.g:2731:45: (iv_ruleARFF= ruleARFF EOF )
            // InternalRsDsl.g:2732:2: iv_ruleARFF= ruleARFF EOF
            {
             newCompositeNode(grammarAccess.getARFFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleARFF=ruleARFF();

            state._fsp--;

             current =iv_ruleARFF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARFF"


    // $ANTLR start "ruleARFF"
    // InternalRsDsl.g:2738:1: ruleARFF returns [EObject current=null] : ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleARFF() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2744:2: ( ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalRsDsl.g:2745:2: ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalRsDsl.g:2745:2: ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalRsDsl.g:2746:3: () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalRsDsl.g:2746:3: ()
            // InternalRsDsl.g:2747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getARFFAccess().getARFFAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getARFFAccess().getARFFKeyword_1());
            		
            // InternalRsDsl.g:2757:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2758:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2758:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2759:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getARFFAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getARFFRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getARFFAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2780:3: (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==64) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRsDsl.g:2781:4: otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_55); 

                    				newLeafNode(otherlv_4, grammarAccess.getARFFAccess().getVariablesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getARFFAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2789:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2790:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2790:5: ( ruleEString )
                    // InternalRsDsl.g:2791:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getARFFRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getARFFAccess().getVariablesVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2805:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==21) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalRsDsl.g:2806:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getARFFAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2810:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2811:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2811:6: ( ruleEString )
                    	    // InternalRsDsl.g:2812:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getARFFRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getARFFAccess().getVariablesVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,55,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getARFFAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getARFFAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleARFF"


    // $ANTLR start "entryRuleVariableRelation"
    // InternalRsDsl.g:2840:1: entryRuleVariableRelation returns [EObject current=null] : iv_ruleVariableRelation= ruleVariableRelation EOF ;
    public final EObject entryRuleVariableRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRelation = null;


        try {
            // InternalRsDsl.g:2840:57: (iv_ruleVariableRelation= ruleVariableRelation EOF )
            // InternalRsDsl.g:2841:2: iv_ruleVariableRelation= ruleVariableRelation EOF
            {
             newCompositeNode(grammarAccess.getVariableRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableRelation=ruleVariableRelation();

            state._fsp--;

             current =iv_ruleVariableRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableRelation"


    // $ANTLR start "ruleVariableRelation"
    // InternalRsDsl.g:2847:1: ruleVariableRelation returns [EObject current=null] : ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVariableRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRsDsl.g:2853:2: ( ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:2854:2: ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:2854:2: ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:2855:3: () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRsDsl.g:2855:3: ()
            // InternalRsDsl.g:2856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableRelationAccess().getVariableRelationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableRelationAccess().getVariableRelationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:2870:3: (otherlv_3= 'source' ( ( ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==66) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRsDsl.g:2871:4: otherlv_3= 'source' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableRelationAccess().getSourceKeyword_3_0());
                    			
                    // InternalRsDsl.g:2875:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2876:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2876:5: ( ruleEString )
                    // InternalRsDsl.g:2877:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableRelationAccess().getSourceVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:2892:3: (otherlv_5= 'target' ( ( ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==67) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRsDsl.g:2893:4: otherlv_5= 'target' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,67,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableRelationAccess().getTargetKeyword_4_0());
                    			
                    // InternalRsDsl.g:2897:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2898:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2898:5: ( ruleEString )
                    // InternalRsDsl.g:2899:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableRelationAccess().getTargetVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableRelationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableRelation"


    // $ANTLR start "entryRuleRecommendedItem"
    // InternalRsDsl.g:2922:1: entryRuleRecommendedItem returns [EObject current=null] : iv_ruleRecommendedItem= ruleRecommendedItem EOF ;
    public final EObject entryRuleRecommendedItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendedItem = null;


        try {
            // InternalRsDsl.g:2922:56: (iv_ruleRecommendedItem= ruleRecommendedItem EOF )
            // InternalRsDsl.g:2923:2: iv_ruleRecommendedItem= ruleRecommendedItem EOF
            {
             newCompositeNode(grammarAccess.getRecommendedItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecommendedItem=ruleRecommendedItem();

            state._fsp--;

             current =iv_ruleRecommendedItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecommendedItem"


    // $ANTLR start "ruleRecommendedItem"
    // InternalRsDsl.g:2929:1: ruleRecommendedItem returns [EObject current=null] : ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleRecommendedItem() throws RecognitionException {
        EObject current = null;

        Token lv_ordered_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2935:2: ( ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalRsDsl.g:2936:2: ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalRsDsl.g:2936:2: ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalRsDsl.g:2937:3: () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            // InternalRsDsl.g:2937:3: ()
            // InternalRsDsl.g:2938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendedItemAccess().getRecommendedItemAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:2944:3: ( (lv_ordered_1_0= 'ordered' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==68) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRsDsl.g:2945:4: (lv_ordered_1_0= 'ordered' )
                    {
                    // InternalRsDsl.g:2945:4: (lv_ordered_1_0= 'ordered' )
                    // InternalRsDsl.g:2946:5: lv_ordered_1_0= 'ordered'
                    {
                    lv_ordered_1_0=(Token)match(input,68,FOLLOW_65); 

                    					newLeafNode(lv_ordered_1_0, grammarAccess.getRecommendedItemAccess().getOrderedOrderedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecommendedItemRule());
                    					}
                    					setWithLastConsumed(current, "ordered", lv_ordered_1_0 != null, "ordered");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendedItemAccess().getRecommendedItemKeyword_2());
            		
            // InternalRsDsl.g:2962:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:2963:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:2963:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:2964:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecommendedItemAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecommendedItemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_4, grammarAccess.getRecommendedItemAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRsDsl.g:2985:3: (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==70) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRsDsl.g:2986:4: otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecommendedItemAccess().getOutcameKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecommendedItemAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRsDsl.g:2994:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2995:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2995:5: ( ruleEString )
                    // InternalRsDsl.g:2996:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendedItemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendedItemAccess().getOutcameVariableCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:3010:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==21) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalRsDsl.g:3011:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRecommendedItemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:3015:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:3016:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:3016:6: ( ruleEString )
                    	    // InternalRsDsl.g:3017:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRecommendedItemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRecommendedItemAccess().getOutcameVariableCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,55,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecommendedItemAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRecommendedItemAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecommendedItem"


    // $ANTLR start "entryRuleWebIService"
    // InternalRsDsl.g:3045:1: entryRuleWebIService returns [EObject current=null] : iv_ruleWebIService= ruleWebIService EOF ;
    public final EObject entryRuleWebIService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebIService = null;


        try {
            // InternalRsDsl.g:3045:52: (iv_ruleWebIService= ruleWebIService EOF )
            // InternalRsDsl.g:3046:2: iv_ruleWebIService= ruleWebIService EOF
            {
             newCompositeNode(grammarAccess.getWebIServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebIService=ruleWebIService();

            state._fsp--;

             current =iv_ruleWebIService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebIService"


    // $ANTLR start "ruleWebIService"
    // InternalRsDsl.g:3052:1: ruleWebIService returns [EObject current=null] : ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleWebIService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_library_5_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3058:2: ( ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:3059:2: ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:3059:2: ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:3060:3: () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:3060:3: ()
            // InternalRsDsl.g:3061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWebIServiceAccess().getWebIServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWebIServiceAccess().getWebIServiceKeyword_1());
            		
            // InternalRsDsl.g:3071:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3072:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3072:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3073:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWebIServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebIServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_3, grammarAccess.getWebIServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3094:3: (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==25) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRsDsl.g:3095:4: otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_68); 

                    				newLeafNode(otherlv_4, grammarAccess.getWebIServiceAccess().getLibraryKeyword_4_0());
                    			
                    // InternalRsDsl.g:3099:4: ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    // InternalRsDsl.g:3100:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    {
                    // InternalRsDsl.g:3100:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    // InternalRsDsl.g:3101:6: lv_library_5_0= ruleWebInterfaceLibrary
                    {

                    						newCompositeNode(grammarAccess.getWebIServiceAccess().getLibraryWebInterfaceLibraryEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_library_5_0=ruleWebInterfaceLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWebIServiceRule());
                    						}
                    						set(
                    							current,
                    							"library",
                    							lv_library_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.WebInterfaceLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3119:3: (otherlv_6= 'recommendations' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==72) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRsDsl.g:3120:4: otherlv_6= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWebIServiceAccess().getRecommendationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:3124:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3125:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3125:5: ( ruleEString )
                    // InternalRsDsl.g:3126:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWebIServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWebIServiceAccess().getRecommendationsRecommendedItemCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWebIServiceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebIService"


    // $ANTLR start "entryRuleWebApplication"
    // InternalRsDsl.g:3149:1: entryRuleWebApplication returns [EObject current=null] : iv_ruleWebApplication= ruleWebApplication EOF ;
    public final EObject entryRuleWebApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebApplication = null;


        try {
            // InternalRsDsl.g:3149:55: (iv_ruleWebApplication= ruleWebApplication EOF )
            // InternalRsDsl.g:3150:2: iv_ruleWebApplication= ruleWebApplication EOF
            {
             newCompositeNode(grammarAccess.getWebApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebApplication=ruleWebApplication();

            state._fsp--;

             current =iv_ruleWebApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebApplication"


    // $ANTLR start "ruleWebApplication"
    // InternalRsDsl.g:3156:1: ruleWebApplication returns [EObject current=null] : ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleWebApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_library_5_0 = null;

        AntlrDatatypeRuleToken lv_port_7_0 = null;

        AntlrDatatypeRuleToken lv_host_9_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3162:2: ( ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalRsDsl.g:3163:2: ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalRsDsl.g:3163:2: ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalRsDsl.g:3164:3: () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalRsDsl.g:3164:3: ()
            // InternalRsDsl.g:3165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWebApplicationAccess().getWebApplicationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWebApplicationAccess().getWebApplicationKeyword_1());
            		
            // InternalRsDsl.g:3175:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3176:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3176:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3177:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWebApplicationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebApplicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getWebApplicationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3198:3: (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==25) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRsDsl.g:3199:4: otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_68); 

                    				newLeafNode(otherlv_4, grammarAccess.getWebApplicationAccess().getLibraryKeyword_4_0());
                    			
                    // InternalRsDsl.g:3203:4: ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    // InternalRsDsl.g:3204:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    {
                    // InternalRsDsl.g:3204:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    // InternalRsDsl.g:3205:6: lv_library_5_0= ruleWebInterfaceLibrary
                    {

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getLibraryWebInterfaceLibraryEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_library_5_0=ruleWebInterfaceLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWebApplicationRule());
                    						}
                    						set(
                    							current,
                    							"library",
                    							lv_library_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.WebInterfaceLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3223:3: (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==74) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRsDsl.g:3224:4: otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWebApplicationAccess().getPortKeyword_5_0());
                    			
                    // InternalRsDsl.g:3228:4: ( (lv_port_7_0= ruleEString ) )
                    // InternalRsDsl.g:3229:5: (lv_port_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:3229:5: (lv_port_7_0= ruleEString )
                    // InternalRsDsl.g:3230:6: lv_port_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getPortEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_port_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWebApplicationRule());
                    						}
                    						set(
                    							current,
                    							"port",
                    							lv_port_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3248:3: (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==75) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRsDsl.g:3249:4: otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getWebApplicationAccess().getHostKeyword_6_0());
                    			
                    // InternalRsDsl.g:3253:4: ( (lv_host_9_0= ruleEString ) )
                    // InternalRsDsl.g:3254:5: (lv_host_9_0= ruleEString )
                    {
                    // InternalRsDsl.g:3254:5: (lv_host_9_0= ruleEString )
                    // InternalRsDsl.g:3255:6: lv_host_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getHostEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_host_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWebApplicationRule());
                    						}
                    						set(
                    							current,
                    							"host",
                    							lv_host_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3273:3: (otherlv_10= 'recommendations' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==72) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRsDsl.g:3274:4: otherlv_10= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getWebApplicationAccess().getRecommendationsKeyword_7_0());
                    			
                    // InternalRsDsl.g:3278:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3279:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3279:5: ( ruleEString )
                    // InternalRsDsl.g:3280:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWebApplicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getRecommendationsRecommendedItemCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getWebApplicationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebApplication"


    // $ANTLR start "entryRuleIDEIntegration_Impl"
    // InternalRsDsl.g:3303:1: entryRuleIDEIntegration_Impl returns [EObject current=null] : iv_ruleIDEIntegration_Impl= ruleIDEIntegration_Impl EOF ;
    public final EObject entryRuleIDEIntegration_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDEIntegration_Impl = null;


        try {
            // InternalRsDsl.g:3303:60: (iv_ruleIDEIntegration_Impl= ruleIDEIntegration_Impl EOF )
            // InternalRsDsl.g:3304:2: iv_ruleIDEIntegration_Impl= ruleIDEIntegration_Impl EOF
            {
             newCompositeNode(grammarAccess.getIDEIntegration_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDEIntegration_Impl=ruleIDEIntegration_Impl();

            state._fsp--;

             current =iv_ruleIDEIntegration_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDEIntegration_Impl"


    // $ANTLR start "ruleIDEIntegration_Impl"
    // InternalRsDsl.g:3310:1: ruleIDEIntegration_Impl returns [EObject current=null] : ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleIDEIntegration_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3316:2: ( ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRsDsl.g:3317:2: ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRsDsl.g:3317:2: ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalRsDsl.g:3318:3: () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRsDsl.g:3318:3: ()
            // InternalRsDsl.g:3319:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIDEIntegration_ImplAccess().getIDEIntegrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIDEIntegration_ImplAccess().getIDEIntegrationKeyword_1());
            		
            // InternalRsDsl.g:3329:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3330:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3330:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3331:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIDEIntegration_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIDEIntegration_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getIDEIntegration_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3352:3: (otherlv_4= 'recommendations' ( ( ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==72) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRsDsl.g:3353:4: otherlv_4= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIDEIntegration_ImplAccess().getRecommendationsKeyword_4_0());
                    			
                    // InternalRsDsl.g:3357:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3358:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3358:5: ( ruleEString )
                    // InternalRsDsl.g:3359:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIDEIntegration_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIDEIntegration_ImplAccess().getRecommendationsRecommendedItemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIDEIntegration_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDEIntegration_Impl"


    // $ANTLR start "entryRuleVSCodePlugin"
    // InternalRsDsl.g:3382:1: entryRuleVSCodePlugin returns [EObject current=null] : iv_ruleVSCodePlugin= ruleVSCodePlugin EOF ;
    public final EObject entryRuleVSCodePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSCodePlugin = null;


        try {
            // InternalRsDsl.g:3382:53: (iv_ruleVSCodePlugin= ruleVSCodePlugin EOF )
            // InternalRsDsl.g:3383:2: iv_ruleVSCodePlugin= ruleVSCodePlugin EOF
            {
             newCompositeNode(grammarAccess.getVSCodePluginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVSCodePlugin=ruleVSCodePlugin();

            state._fsp--;

             current =iv_ruleVSCodePlugin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVSCodePlugin"


    // $ANTLR start "ruleVSCodePlugin"
    // InternalRsDsl.g:3389:1: ruleVSCodePlugin returns [EObject current=null] : (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' ) ;
    public final EObject ruleVSCodePlugin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3395:2: ( (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' ) )
            // InternalRsDsl.g:3396:2: (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalRsDsl.g:3396:2: (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' )
            // InternalRsDsl.g:3397:3: otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVSCodePluginAccess().getVSCodePluginKeyword_0());
            		
            // InternalRsDsl.g:3401:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:3402:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:3402:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:3403:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVSCodePluginAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVSCodePluginRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_2, grammarAccess.getVSCodePluginAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:3424:3: (otherlv_3= 'recommendations' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==72) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRsDsl.g:3425:4: otherlv_3= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVSCodePluginAccess().getRecommendationsKeyword_3_0());
                    			
                    // InternalRsDsl.g:3429:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3430:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3430:5: ( ruleEString )
                    // InternalRsDsl.g:3431:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVSCodePluginRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVSCodePluginAccess().getRecommendationsRecommendedItemCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,78,FOLLOW_55); 

            			newLeafNode(otherlv_5, grammarAccess.getVSCodePluginAccess().getHandlerKeyword_4());
            		
            otherlv_6=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getVSCodePluginAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRsDsl.g:3454:3: ( ( ruleEString ) )
            // InternalRsDsl.g:3455:4: ( ruleEString )
            {
            // InternalRsDsl.g:3455:4: ( ruleEString )
            // InternalRsDsl.g:3456:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVSCodePluginRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVSCodePluginAccess().getHandlerRecommendationHandlerCrossReference_6_0());
            				
            pushFollow(FOLLOW_56);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:3470:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==21) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalRsDsl.g:3471:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getVSCodePluginAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRsDsl.g:3475:4: ( ( ruleEString ) )
            	    // InternalRsDsl.g:3476:5: ( ruleEString )
            	    {
            	    // InternalRsDsl.g:3476:5: ( ruleEString )
            	    // InternalRsDsl.g:3477:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVSCodePluginRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getVSCodePluginAccess().getHandlerRecommendationHandlerCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_10=(Token)match(input,55,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getVSCodePluginAccess().getRightParenthesisKeyword_8());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getVSCodePluginAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVSCodePlugin"


    // $ANTLR start "entryRuleTraversableGraph"
    // InternalRsDsl.g:3504:1: entryRuleTraversableGraph returns [EObject current=null] : iv_ruleTraversableGraph= ruleTraversableGraph EOF ;
    public final EObject entryRuleTraversableGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraversableGraph = null;


        try {
            // InternalRsDsl.g:3504:57: (iv_ruleTraversableGraph= ruleTraversableGraph EOF )
            // InternalRsDsl.g:3505:2: iv_ruleTraversableGraph= ruleTraversableGraph EOF
            {
             newCompositeNode(grammarAccess.getTraversableGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraversableGraph=ruleTraversableGraph();

            state._fsp--;

             current =iv_ruleTraversableGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTraversableGraph"


    // $ANTLR start "ruleTraversableGraph"
    // InternalRsDsl.g:3511:1: ruleTraversableGraph returns [EObject current=null] : ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTraversableGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3517:2: ( ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRsDsl.g:3518:2: ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRsDsl.g:3518:2: ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalRsDsl.g:3519:3: () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRsDsl.g:3519:3: ()
            // InternalRsDsl.g:3520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraversableGraphAccess().getTraversableGraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTraversableGraphAccess().getTraversableGraphKeyword_1());
            		
            // InternalRsDsl.g:3530:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3531:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3531:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3532:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTraversableGraphAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraversableGraphRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getTraversableGraphAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3553:3: (otherlv_4= 'recommendations' ( ( ruleEString ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==72) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalRsDsl.g:3554:4: otherlv_4= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTraversableGraphAccess().getRecommendationsKeyword_4_0());
                    			
                    // InternalRsDsl.g:3558:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3559:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3559:5: ( ruleEString )
                    // InternalRsDsl.g:3560:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTraversableGraphRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTraversableGraphAccess().getRecommendationsRecommendedItemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTraversableGraphAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTraversableGraph"


    // $ANTLR start "entryRuleRawOutcomes"
    // InternalRsDsl.g:3583:1: entryRuleRawOutcomes returns [EObject current=null] : iv_ruleRawOutcomes= ruleRawOutcomes EOF ;
    public final EObject entryRuleRawOutcomes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawOutcomes = null;


        try {
            // InternalRsDsl.g:3583:52: (iv_ruleRawOutcomes= ruleRawOutcomes EOF )
            // InternalRsDsl.g:3584:2: iv_ruleRawOutcomes= ruleRawOutcomes EOF
            {
             newCompositeNode(grammarAccess.getRawOutcomesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRawOutcomes=ruleRawOutcomes();

            state._fsp--;

             current =iv_ruleRawOutcomes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRawOutcomes"


    // $ANTLR start "ruleRawOutcomes"
    // InternalRsDsl.g:3590:1: ruleRawOutcomes returns [EObject current=null] : ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRawOutcomes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_format_5_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3596:2: ( ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:3597:2: ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:3597:2: ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:3598:3: () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:3598:3: ()
            // InternalRsDsl.g:3599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRawOutcomesAccess().getRawOutcomesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRawOutcomesAccess().getRawOutcomesKeyword_1());
            		
            // InternalRsDsl.g:3609:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3610:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3610:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3611:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRawOutcomesAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRawOutcomesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getRawOutcomesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3632:3: (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==81) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRsDsl.g:3633:4: otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) )
                    {
                    otherlv_4=(Token)match(input,81,FOLLOW_76); 

                    				newLeafNode(otherlv_4, grammarAccess.getRawOutcomesAccess().getFormatKeyword_4_0());
                    			
                    // InternalRsDsl.g:3637:4: ( (lv_format_5_0= ruleRawFormat ) )
                    // InternalRsDsl.g:3638:5: (lv_format_5_0= ruleRawFormat )
                    {
                    // InternalRsDsl.g:3638:5: (lv_format_5_0= ruleRawFormat )
                    // InternalRsDsl.g:3639:6: lv_format_5_0= ruleRawFormat
                    {

                    						newCompositeNode(grammarAccess.getRawOutcomesAccess().getFormatRawFormatEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_format_5_0=ruleRawFormat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRawOutcomesRule());
                    						}
                    						set(
                    							current,
                    							"format",
                    							lv_format_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RawFormat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3657:3: (otherlv_6= 'recommendations' ( ( ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==72) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalRsDsl.g:3658:4: otherlv_6= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRawOutcomesAccess().getRecommendationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:3662:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3663:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3663:5: ( ruleEString )
                    // InternalRsDsl.g:3664:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRawOutcomesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRawOutcomesAccess().getRecommendationsRecommendedItemCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRawOutcomesAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRawOutcomes"


    // $ANTLR start "entryRuleRecommendationHandler_Impl"
    // InternalRsDsl.g:3687:1: entryRuleRecommendationHandler_Impl returns [EObject current=null] : iv_ruleRecommendationHandler_Impl= ruleRecommendationHandler_Impl EOF ;
    public final EObject entryRuleRecommendationHandler_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationHandler_Impl = null;


        try {
            // InternalRsDsl.g:3687:67: (iv_ruleRecommendationHandler_Impl= ruleRecommendationHandler_Impl EOF )
            // InternalRsDsl.g:3688:2: iv_ruleRecommendationHandler_Impl= ruleRecommendationHandler_Impl EOF
            {
             newCompositeNode(grammarAccess.getRecommendationHandler_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecommendationHandler_Impl=ruleRecommendationHandler_Impl();

            state._fsp--;

             current =iv_ruleRecommendationHandler_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecommendationHandler_Impl"


    // $ANTLR start "ruleRecommendationHandler_Impl"
    // InternalRsDsl.g:3694:1: ruleRecommendationHandler_Impl returns [EObject current=null] : ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleRecommendationHandler_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_usage_10_0 = null;

        EObject lv_usage_12_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3700:2: ( ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalRsDsl.g:3701:2: ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalRsDsl.g:3701:2: ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalRsDsl.g:3702:3: () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalRsDsl.g:3702:3: ()
            // InternalRsDsl.g:3703:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendationHandler_ImplAccess().getRecommendationHandlerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRecommendationHandler_ImplAccess().getRecommendationHandlerKeyword_1());
            		
            // InternalRsDsl.g:3713:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3714:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3714:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3715:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecommendationHandler_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getRecommendationHandler_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3736:3: (otherlv_4= 'webService' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==83) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRsDsl.g:3737:4: otherlv_4= 'webService' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRecommendationHandler_ImplAccess().getWebServiceKeyword_4_0());
                    			
                    // InternalRsDsl.g:3741:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3742:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3742:5: ( ruleEString )
                    // InternalRsDsl.g:3743:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationHandler_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getWebServiceWebIServiceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3758:3: (otherlv_6= 'context' ( ( ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==84) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalRsDsl.g:3759:4: otherlv_6= 'context' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecommendationHandler_ImplAccess().getContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:3763:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3764:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3764:5: ( ruleEString )
                    // InternalRsDsl.g:3765:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationHandler_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getContextRecommendationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3780:3: (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==85) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalRsDsl.g:3781:4: otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,85,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecommendationHandler_ImplAccess().getUsageKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_80); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecommendationHandler_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:3789:4: ( (lv_usage_10_0= ruleRecommendationUsage ) )
                    // InternalRsDsl.g:3790:5: (lv_usage_10_0= ruleRecommendationUsage )
                    {
                    // InternalRsDsl.g:3790:5: (lv_usage_10_0= ruleRecommendationUsage )
                    // InternalRsDsl.g:3791:6: lv_usage_10_0= ruleRecommendationUsage
                    {

                    						newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getUsageRecommendationUsageParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_usage_10_0=ruleRecommendationUsage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecommendationHandler_ImplRule());
                    						}
                    						add(
                    							current,
                    							"usage",
                    							lv_usage_10_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationUsage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:3808:4: (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==21) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalRsDsl.g:3809:5: otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_80); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRecommendationHandler_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:3813:5: ( (lv_usage_12_0= ruleRecommendationUsage ) )
                    	    // InternalRsDsl.g:3814:6: (lv_usage_12_0= ruleRecommendationUsage )
                    	    {
                    	    // InternalRsDsl.g:3814:6: (lv_usage_12_0= ruleRecommendationUsage )
                    	    // InternalRsDsl.g:3815:7: lv_usage_12_0= ruleRecommendationUsage
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getUsageRecommendationUsageParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_usage_12_0=ruleRecommendationUsage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecommendationHandler_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"usage",
                    	    								lv_usage_12_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationUsage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getRecommendationHandler_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getRecommendationHandler_ImplAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecommendationHandler_Impl"


    // $ANTLR start "entryRuleRecommendationUsage"
    // InternalRsDsl.g:3846:1: entryRuleRecommendationUsage returns [EObject current=null] : iv_ruleRecommendationUsage= ruleRecommendationUsage EOF ;
    public final EObject entryRuleRecommendationUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationUsage = null;


        try {
            // InternalRsDsl.g:3846:60: (iv_ruleRecommendationUsage= ruleRecommendationUsage EOF )
            // InternalRsDsl.g:3847:2: iv_ruleRecommendationUsage= ruleRecommendationUsage EOF
            {
             newCompositeNode(grammarAccess.getRecommendationUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecommendationUsage=ruleRecommendationUsage();

            state._fsp--;

             current =iv_ruleRecommendationUsage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecommendationUsage"


    // $ANTLR start "ruleRecommendationUsage"
    // InternalRsDsl.g:3853:1: ruleRecommendationUsage returns [EObject current=null] : ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleRecommendationUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_usageType_4_0 = null;

        EObject lv_guielements_13_0 = null;

        EObject lv_guielements_15_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3859:2: ( ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalRsDsl.g:3860:2: ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalRsDsl.g:3860:2: ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalRsDsl.g:3861:3: () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalRsDsl.g:3861:3: ()
            // InternalRsDsl.g:3862:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendationUsageAccess().getRecommendationUsageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecommendationUsageAccess().getRecommendationUsageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendationUsageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:3876:3: (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==87) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalRsDsl.g:3877:4: otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) )
                    {
                    otherlv_3=(Token)match(input,87,FOLLOW_82); 

                    				newLeafNode(otherlv_3, grammarAccess.getRecommendationUsageAccess().getUsageTypeKeyword_3_0());
                    			
                    // InternalRsDsl.g:3881:4: ( (lv_usageType_4_0= ruleRecommendationUsageType ) )
                    // InternalRsDsl.g:3882:5: (lv_usageType_4_0= ruleRecommendationUsageType )
                    {
                    // InternalRsDsl.g:3882:5: (lv_usageType_4_0= ruleRecommendationUsageType )
                    // InternalRsDsl.g:3883:6: lv_usageType_4_0= ruleRecommendationUsageType
                    {

                    						newCompositeNode(grammarAccess.getRecommendationUsageAccess().getUsageTypeRecommendationUsageTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_usageType_4_0=ruleRecommendationUsageType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecommendationUsageRule());
                    						}
                    						set(
                    							current,
                    							"usageType",
                    							lv_usageType_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationUsageType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3901:3: (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==88) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalRsDsl.g:3902:4: otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,88,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecommendationUsageAccess().getRecommendedItemsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecommendationUsageAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:3910:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3911:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3911:5: ( ruleEString )
                    // InternalRsDsl.g:3912:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationUsageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationUsageAccess().getRecommendedItemsRecommendedItemCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:3926:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==21) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalRsDsl.g:3927:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRecommendationUsageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:3931:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:3932:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:3932:6: ( ruleEString )
                    	    // InternalRsDsl.g:3933:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRecommendationUsageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRecommendationUsageAccess().getRecommendedItemsRecommendedItemCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,55,FOLLOW_84); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecommendationUsageAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:3953:3: (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==89) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalRsDsl.g:3954:4: otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,89,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getRecommendationUsageAccess().getGuielementsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_85); 

                    				newLeafNode(otherlv_12, grammarAccess.getRecommendationUsageAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:3962:4: ( (lv_guielements_13_0= ruleGUIElement ) )
                    // InternalRsDsl.g:3963:5: (lv_guielements_13_0= ruleGUIElement )
                    {
                    // InternalRsDsl.g:3963:5: (lv_guielements_13_0= ruleGUIElement )
                    // InternalRsDsl.g:3964:6: lv_guielements_13_0= ruleGUIElement
                    {

                    						newCompositeNode(grammarAccess.getRecommendationUsageAccess().getGuielementsGUIElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_guielements_13_0=ruleGUIElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecommendationUsageRule());
                    						}
                    						add(
                    							current,
                    							"guielements",
                    							lv_guielements_13_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.GUIElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:3981:4: (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==21) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalRsDsl.g:3982:5: otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_85); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRecommendationUsageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:3986:5: ( (lv_guielements_15_0= ruleGUIElement ) )
                    	    // InternalRsDsl.g:3987:6: (lv_guielements_15_0= ruleGUIElement )
                    	    {
                    	    // InternalRsDsl.g:3987:6: (lv_guielements_15_0= ruleGUIElement )
                    	    // InternalRsDsl.g:3988:7: lv_guielements_15_0= ruleGUIElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecommendationUsageAccess().getGuielementsGUIElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_guielements_15_0=ruleGUIElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecommendationUsageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"guielements",
                    	    								lv_guielements_15_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.GUIElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getRecommendationUsageAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getRecommendationUsageAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecommendationUsage"


    // $ANTLR start "entryRuleRecommendationContext"
    // InternalRsDsl.g:4019:1: entryRuleRecommendationContext returns [EObject current=null] : iv_ruleRecommendationContext= ruleRecommendationContext EOF ;
    public final EObject entryRuleRecommendationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationContext = null;


        try {
            // InternalRsDsl.g:4019:62: (iv_ruleRecommendationContext= ruleRecommendationContext EOF )
            // InternalRsDsl.g:4020:2: iv_ruleRecommendationContext= ruleRecommendationContext EOF
            {
             newCompositeNode(grammarAccess.getRecommendationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecommendationContext=ruleRecommendationContext();

            state._fsp--;

             current =iv_ruleRecommendationContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecommendationContext"


    // $ANTLR start "ruleRecommendationContext"
    // InternalRsDsl.g:4026:1: ruleRecommendationContext returns [EObject current=null] : ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRecommendationContext() throws RecognitionException {
        EObject current = null;

        Token lv_isProactiveSystem_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:4032:2: ( ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:4033:2: ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:4033:2: ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:4034:3: () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRsDsl.g:4034:3: ()
            // InternalRsDsl.g:4035:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendationContextAccess().getRecommendationContextAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:4041:3: ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==90) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalRsDsl.g:4042:4: (lv_isProactiveSystem_1_0= 'isProactiveSystem' )
                    {
                    // InternalRsDsl.g:4042:4: (lv_isProactiveSystem_1_0= 'isProactiveSystem' )
                    // InternalRsDsl.g:4043:5: lv_isProactiveSystem_1_0= 'isProactiveSystem'
                    {
                    lv_isProactiveSystem_1_0=(Token)match(input,90,FOLLOW_86); 

                    					newLeafNode(lv_isProactiveSystem_1_0, grammarAccess.getRecommendationContextAccess().getIsProactiveSystemIsProactiveSystemKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecommendationContextRule());
                    					}
                    					setWithLastConsumed(current, "isProactiveSystem", lv_isProactiveSystem_1_0 != null, "isProactiveSystem");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendationContextAccess().getRecommendationContextKeyword_2());
            		
            // InternalRsDsl.g:4059:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:4060:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:4060:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:4061:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecommendationContextAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecommendationContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_87); 

            			newLeafNode(otherlv_4, grammarAccess.getRecommendationContextAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRsDsl.g:4082:3: (otherlv_5= 'userContext' ( ( ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==92) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalRsDsl.g:4083:4: otherlv_5= 'userContext' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,92,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecommendationContextAccess().getUserContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:4087:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4088:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4088:5: ( ruleEString )
                    // InternalRsDsl.g:4089:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationContextAccess().getUserContextDataStructureCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRecommendationContextAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecommendationContext"


    // $ANTLR start "entryRuleProactiveHandler"
    // InternalRsDsl.g:4112:1: entryRuleProactiveHandler returns [EObject current=null] : iv_ruleProactiveHandler= ruleProactiveHandler EOF ;
    public final EObject entryRuleProactiveHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProactiveHandler = null;


        try {
            // InternalRsDsl.g:4112:57: (iv_ruleProactiveHandler= ruleProactiveHandler EOF )
            // InternalRsDsl.g:4113:2: iv_ruleProactiveHandler= ruleProactiveHandler EOF
            {
             newCompositeNode(grammarAccess.getProactiveHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProactiveHandler=ruleProactiveHandler();

            state._fsp--;

             current =iv_ruleProactiveHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProactiveHandler"


    // $ANTLR start "ruleProactiveHandler"
    // InternalRsDsl.g:4119:1: ruleProactiveHandler returns [EObject current=null] : ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleProactiveHandler() throws RecognitionException {
        EObject current = null;

        Token lv_condition_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_usage_11_0 = null;

        EObject lv_usage_13_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:4125:2: ( ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalRsDsl.g:4126:2: ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalRsDsl.g:4126:2: ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalRsDsl.g:4127:3: () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalRsDsl.g:4127:3: ()
            // InternalRsDsl.g:4128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProactiveHandlerAccess().getProactiveHandlerAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:4134:3: ( (lv_condition_1_0= 'condition' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==93) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalRsDsl.g:4135:4: (lv_condition_1_0= 'condition' )
                    {
                    // InternalRsDsl.g:4135:4: (lv_condition_1_0= 'condition' )
                    // InternalRsDsl.g:4136:5: lv_condition_1_0= 'condition'
                    {
                    lv_condition_1_0=(Token)match(input,93,FOLLOW_88); 

                    					newLeafNode(lv_condition_1_0, grammarAccess.getProactiveHandlerAccess().getConditionConditionKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProactiveHandlerRule());
                    					}
                    					setWithLastConsumed(current, "condition", lv_condition_1_0 != null, "condition");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,94,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProactiveHandlerAccess().getProactiveHandlerKeyword_2());
            		
            // InternalRsDsl.g:4152:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:4153:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:4153:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:4154:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProactiveHandlerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProactiveHandlerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_4, grammarAccess.getProactiveHandlerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRsDsl.g:4175:3: (otherlv_5= 'webService' ( ( ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==83) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalRsDsl.g:4176:4: otherlv_5= 'webService' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getProactiveHandlerAccess().getWebServiceKeyword_5_0());
                    			
                    // InternalRsDsl.g:4180:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4181:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4181:5: ( ruleEString )
                    // InternalRsDsl.g:4182:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProactiveHandlerAccess().getWebServiceWebIServiceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4197:3: (otherlv_7= 'context' ( ( ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==84) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalRsDsl.g:4198:4: otherlv_7= 'context' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getProactiveHandlerAccess().getContextKeyword_6_0());
                    			
                    // InternalRsDsl.g:4202:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4203:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4203:5: ( ruleEString )
                    // InternalRsDsl.g:4204:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProactiveHandlerAccess().getContextRecommendationContextCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4219:3: (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==85) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalRsDsl.g:4220:4: otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,85,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getProactiveHandlerAccess().getUsageKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_80); 

                    				newLeafNode(otherlv_10, grammarAccess.getProactiveHandlerAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRsDsl.g:4228:4: ( (lv_usage_11_0= ruleRecommendationUsage ) )
                    // InternalRsDsl.g:4229:5: (lv_usage_11_0= ruleRecommendationUsage )
                    {
                    // InternalRsDsl.g:4229:5: (lv_usage_11_0= ruleRecommendationUsage )
                    // InternalRsDsl.g:4230:6: lv_usage_11_0= ruleRecommendationUsage
                    {

                    						newCompositeNode(grammarAccess.getProactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_usage_11_0=ruleRecommendationUsage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProactiveHandlerRule());
                    						}
                    						add(
                    							current,
                    							"usage",
                    							lv_usage_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationUsage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:4247:4: (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==21) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalRsDsl.g:4248:5: otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FOLLOW_80); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProactiveHandlerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRsDsl.g:4252:5: ( (lv_usage_13_0= ruleRecommendationUsage ) )
                    	    // InternalRsDsl.g:4253:6: (lv_usage_13_0= ruleRecommendationUsage )
                    	    {
                    	    // InternalRsDsl.g:4253:6: (lv_usage_13_0= ruleRecommendationUsage )
                    	    // InternalRsDsl.g:4254:7: lv_usage_13_0= ruleRecommendationUsage
                    	    {

                    	    							newCompositeNode(grammarAccess.getProactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_usage_13_0=ruleRecommendationUsage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProactiveHandlerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"usage",
                    	    								lv_usage_13_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationUsage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getProactiveHandlerAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getProactiveHandlerAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProactiveHandler"


    // $ANTLR start "entryRuleReactiveHandler"
    // InternalRsDsl.g:4285:1: entryRuleReactiveHandler returns [EObject current=null] : iv_ruleReactiveHandler= ruleReactiveHandler EOF ;
    public final EObject entryRuleReactiveHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactiveHandler = null;


        try {
            // InternalRsDsl.g:4285:56: (iv_ruleReactiveHandler= ruleReactiveHandler EOF )
            // InternalRsDsl.g:4286:2: iv_ruleReactiveHandler= ruleReactiveHandler EOF
            {
             newCompositeNode(grammarAccess.getReactiveHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReactiveHandler=ruleReactiveHandler();

            state._fsp--;

             current =iv_ruleReactiveHandler; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReactiveHandler"


    // $ANTLR start "ruleReactiveHandler"
    // InternalRsDsl.g:4292:1: ruleReactiveHandler returns [EObject current=null] : ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleReactiveHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_usage_12_0 = null;

        EObject lv_usage_14_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:4298:2: ( ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRsDsl.g:4299:2: ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRsDsl.g:4299:2: ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRsDsl.g:4300:3: () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalRsDsl.g:4300:3: ()
            // InternalRsDsl.g:4301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactiveHandlerAccess().getReactiveHandlerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReactiveHandlerAccess().getReactiveHandlerKeyword_1());
            		
            // InternalRsDsl.g:4311:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:4312:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:4312:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:4313:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReactiveHandlerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactiveHandlerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_89); 

            			newLeafNode(otherlv_3, grammarAccess.getReactiveHandlerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:4334:3: (otherlv_4= 'webService' ( ( ruleEString ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==83) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalRsDsl.g:4335:4: otherlv_4= 'webService' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getReactiveHandlerAccess().getWebServiceKeyword_4_0());
                    			
                    // InternalRsDsl.g:4339:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4340:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4340:5: ( ruleEString )
                    // InternalRsDsl.g:4341:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getWebServiceWebIServiceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_90);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4356:3: (otherlv_6= 'context' ( ( ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==84) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalRsDsl.g:4357:4: otherlv_6= 'context' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getReactiveHandlerAccess().getContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:4361:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4362:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4362:5: ( ruleEString )
                    // InternalRsDsl.g:4363:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getContextRecommendationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_91);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4378:3: (otherlv_8= 'event' ( ( ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==96) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalRsDsl.g:4379:4: otherlv_8= 'event' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,96,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getReactiveHandlerAccess().getEventKeyword_6_0());
                    			
                    // InternalRsDsl.g:4383:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4384:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4384:5: ( ruleEString )
                    // InternalRsDsl.g:4385:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getEventUserEventCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4400:3: (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==85) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalRsDsl.g:4401:4: otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,85,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getReactiveHandlerAccess().getUsageKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_80); 

                    				newLeafNode(otherlv_11, grammarAccess.getReactiveHandlerAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRsDsl.g:4409:4: ( (lv_usage_12_0= ruleRecommendationUsage ) )
                    // InternalRsDsl.g:4410:5: (lv_usage_12_0= ruleRecommendationUsage )
                    {
                    // InternalRsDsl.g:4410:5: (lv_usage_12_0= ruleRecommendationUsage )
                    // InternalRsDsl.g:4411:6: lv_usage_12_0= ruleRecommendationUsage
                    {

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_usage_12_0=ruleRecommendationUsage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReactiveHandlerRule());
                    						}
                    						add(
                    							current,
                    							"usage",
                    							lv_usage_12_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationUsage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:4428:4: (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==21) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalRsDsl.g:4429:5: otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_80); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getReactiveHandlerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRsDsl.g:4433:5: ( (lv_usage_14_0= ruleRecommendationUsage ) )
                    	    // InternalRsDsl.g:4434:6: (lv_usage_14_0= ruleRecommendationUsage )
                    	    {
                    	    // InternalRsDsl.g:4434:6: (lv_usage_14_0= ruleRecommendationUsage )
                    	    // InternalRsDsl.g:4435:7: lv_usage_14_0= ruleRecommendationUsage
                    	    {

                    	    							newCompositeNode(grammarAccess.getReactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_usage_14_0=ruleRecommendationUsage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getReactiveHandlerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"usage",
                    	    								lv_usage_14_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationUsage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getReactiveHandlerAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getReactiveHandlerAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReactiveHandler"


    // $ANTLR start "entryRuleGUIElement"
    // InternalRsDsl.g:4466:1: entryRuleGUIElement returns [EObject current=null] : iv_ruleGUIElement= ruleGUIElement EOF ;
    public final EObject entryRuleGUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIElement = null;


        try {
            // InternalRsDsl.g:4466:51: (iv_ruleGUIElement= ruleGUIElement EOF )
            // InternalRsDsl.g:4467:2: iv_ruleGUIElement= ruleGUIElement EOF
            {
             newCompositeNode(grammarAccess.getGUIElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUIElement=ruleGUIElement();

            state._fsp--;

             current =iv_ruleGUIElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGUIElement"


    // $ANTLR start "ruleGUIElement"
    // InternalRsDsl.g:4473:1: ruleGUIElement returns [EObject current=null] : ( () otherlv_1= 'GUIElement' ) ;
    public final EObject ruleGUIElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:4479:2: ( ( () otherlv_1= 'GUIElement' ) )
            // InternalRsDsl.g:4480:2: ( () otherlv_1= 'GUIElement' )
            {
            // InternalRsDsl.g:4480:2: ( () otherlv_1= 'GUIElement' )
            // InternalRsDsl.g:4481:3: () otherlv_1= 'GUIElement'
            {
            // InternalRsDsl.g:4481:3: ()
            // InternalRsDsl.g:4482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGUIElementAccess().getGUIElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGUIElementAccess().getGUIElementKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGUIElement"


    // $ANTLR start "entryRuleEInt"
    // InternalRsDsl.g:4496:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRsDsl.g:4496:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRsDsl.g:4497:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRsDsl.g:4503:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:4509:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRsDsl.g:4510:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRsDsl.g:4510:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRsDsl.g:4511:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRsDsl.g:4511:3: (kw= '-' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==98) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalRsDsl.g:4512:4: kw= '-'
                    {
                    kw=(Token)match(input,98,FOLLOW_92); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleUserStudy"
    // InternalRsDsl.g:4529:1: entryRuleUserStudy returns [EObject current=null] : iv_ruleUserStudy= ruleUserStudy EOF ;
    public final EObject entryRuleUserStudy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserStudy = null;


        try {
            // InternalRsDsl.g:4529:50: (iv_ruleUserStudy= ruleUserStudy EOF )
            // InternalRsDsl.g:4530:2: iv_ruleUserStudy= ruleUserStudy EOF
            {
             newCompositeNode(grammarAccess.getUserStudyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserStudy=ruleUserStudy();

            state._fsp--;

             current =iv_ruleUserStudy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserStudy"


    // $ANTLR start "ruleUserStudy"
    // InternalRsDsl.g:4536:1: ruleUserStudy returns [EObject current=null] : (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleUserStudy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nOfRecommendations_4_0 = null;

        Enumerator lv_type_6_0 = null;

        Enumerator lv_analysis_8_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:4542:2: ( (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' ) )
            // InternalRsDsl.g:4543:2: (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' )
            {
            // InternalRsDsl.g:4543:2: (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' )
            // InternalRsDsl.g:4544:3: otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUserStudyAccess().getUserStudyKeyword_0());
            		
            // InternalRsDsl.g:4548:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:4549:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:4549:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:4550:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserStudyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserStudyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getUserStudyAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,100,FOLLOW_94); 

            			newLeafNode(otherlv_3, grammarAccess.getUserStudyAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:4575:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:4576:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:4576:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:4577:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUserStudyAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_95);
            lv_nOfRecommendations_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserStudyRule());
            					}
            					set(
            						current,
            						"nOfRecommendations",
            						lv_nOfRecommendations_4_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:4594:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==31) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalRsDsl.g:4595:4: otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_96); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserStudyAccess().getTypeKeyword_5_0());
                    			
                    // InternalRsDsl.g:4599:4: ( (lv_type_6_0= ruleUserStudyType ) )
                    // InternalRsDsl.g:4600:5: (lv_type_6_0= ruleUserStudyType )
                    {
                    // InternalRsDsl.g:4600:5: (lv_type_6_0= ruleUserStudyType )
                    // InternalRsDsl.g:4601:6: lv_type_6_0= ruleUserStudyType
                    {

                    						newCompositeNode(grammarAccess.getUserStudyAccess().getTypeUserStudyTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    lv_type_6_0=ruleUserStudyType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserStudyRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.UserStudyType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4619:3: (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==101) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalRsDsl.g:4620:4: otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) )
                    {
                    otherlv_7=(Token)match(input,101,FOLLOW_98); 

                    				newLeafNode(otherlv_7, grammarAccess.getUserStudyAccess().getAnalysisKeyword_6_0());
                    			
                    // InternalRsDsl.g:4624:4: ( (lv_analysis_8_0= ruleUserStudyAnalysis ) )
                    // InternalRsDsl.g:4625:5: (lv_analysis_8_0= ruleUserStudyAnalysis )
                    {
                    // InternalRsDsl.g:4625:5: (lv_analysis_8_0= ruleUserStudyAnalysis )
                    // InternalRsDsl.g:4626:6: lv_analysis_8_0= ruleUserStudyAnalysis
                    {

                    						newCompositeNode(grammarAccess.getUserStudyAccess().getAnalysisUserStudyAnalysisEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_analysis_8_0=ruleUserStudyAnalysis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserStudyRule());
                    						}
                    						set(
                    							current,
                    							"analysis",
                    							lv_analysis_8_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.UserStudyAnalysis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getUserStudyAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserStudy"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalRsDsl.g:4652:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalRsDsl.g:4652:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalRsDsl.g:4653:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalRsDsl.g:4659:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nOfRecommendations_4_0 = null;

        Enumerator lv_library_6_0 = null;

        AntlrDatatypeRuleToken lv_numberOfFold_8_0 = null;

        EObject lv_groundTruthExtractor_10_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:4665:2: ( (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' ) )
            // InternalRsDsl.g:4666:2: (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' )
            {
            // InternalRsDsl.g:4666:2: (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' )
            // InternalRsDsl.g:4667:3: otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0());
            		
            // InternalRsDsl.g:4671:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:4672:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:4672:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:4673:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCrossValidationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrossValidationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,100,FOLLOW_94); 

            			newLeafNode(otherlv_3, grammarAccess.getCrossValidationAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:4698:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:4699:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:4699:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:4700:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCrossValidationAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_99);
            lv_nOfRecommendations_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrossValidationRule());
            					}
            					set(
            						current,
            						"nOfRecommendations",
            						lv_nOfRecommendations_4_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:4717:3: (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==25) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalRsDsl.g:4718:4: otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_100); 

                    				newLeafNode(otherlv_5, grammarAccess.getCrossValidationAccess().getLibraryKeyword_5_0());
                    			
                    // InternalRsDsl.g:4722:4: ( (lv_library_6_0= ruleValidationLibrary ) )
                    // InternalRsDsl.g:4723:5: (lv_library_6_0= ruleValidationLibrary )
                    {
                    // InternalRsDsl.g:4723:5: (lv_library_6_0= ruleValidationLibrary )
                    // InternalRsDsl.g:4724:6: lv_library_6_0= ruleValidationLibrary
                    {

                    						newCompositeNode(grammarAccess.getCrossValidationAccess().getLibraryValidationLibraryEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_library_6_0=ruleValidationLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCrossValidationRule());
                    						}
                    						set(
                    							current,
                    							"library",
                    							lv_library_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.ValidationLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4742:3: (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==103) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalRsDsl.g:4743:4: otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,103,FOLLOW_94); 

                    				newLeafNode(otherlv_7, grammarAccess.getCrossValidationAccess().getNumberOfFoldKeyword_6_0());
                    			
                    // InternalRsDsl.g:4747:4: ( (lv_numberOfFold_8_0= ruleEInt ) )
                    // InternalRsDsl.g:4748:5: (lv_numberOfFold_8_0= ruleEInt )
                    {
                    // InternalRsDsl.g:4748:5: (lv_numberOfFold_8_0= ruleEInt )
                    // InternalRsDsl.g:4749:6: lv_numberOfFold_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCrossValidationAccess().getNumberOfFoldEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_numberOfFold_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCrossValidationRule());
                    						}
                    						set(
                    							current,
                    							"numberOfFold",
                    							lv_numberOfFold_8_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4767:3: (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==104) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalRsDsl.g:4768:4: otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) )
                    {
                    otherlv_9=(Token)match(input,104,FOLLOW_103); 

                    				newLeafNode(otherlv_9, grammarAccess.getCrossValidationAccess().getGroundTruthExtractorKeyword_7_0());
                    			
                    // InternalRsDsl.g:4772:4: ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) )
                    // InternalRsDsl.g:4773:5: (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction )
                    {
                    // InternalRsDsl.g:4773:5: (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction )
                    // InternalRsDsl.g:4774:6: lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction
                    {

                    						newCompositeNode(grammarAccess.getCrossValidationAccess().getGroundTruthExtractorGroundTruthExtractionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_groundTruthExtractor_10_0=ruleGroundTruthExtraction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCrossValidationRule());
                    						}
                    						set(
                    							current,
                    							"groundTruthExtractor",
                    							lv_groundTruthExtractor_10_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.GroundTruthExtraction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleContextValidation"
    // InternalRsDsl.g:4800:1: entryRuleContextValidation returns [EObject current=null] : iv_ruleContextValidation= ruleContextValidation EOF ;
    public final EObject entryRuleContextValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextValidation = null;


        try {
            // InternalRsDsl.g:4800:58: (iv_ruleContextValidation= ruleContextValidation EOF )
            // InternalRsDsl.g:4801:2: iv_ruleContextValidation= ruleContextValidation EOF
            {
             newCompositeNode(grammarAccess.getContextValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextValidation=ruleContextValidation();

            state._fsp--;

             current =iv_ruleContextValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextValidation"


    // $ANTLR start "ruleContextValidation"
    // InternalRsDsl.g:4807:1: ruleContextValidation returns [EObject current=null] : (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleContextValidation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nOfRecommendations_4_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:4813:2: ( (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:4814:2: (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:4814:2: (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:4815:3: otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextValidationAccess().getContextValidationKeyword_0());
            		
            // InternalRsDsl.g:4819:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:4820:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:4820:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:4821:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContextValidationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextValidationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getContextValidationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,100,FOLLOW_94); 

            			newLeafNode(otherlv_3, grammarAccess.getContextValidationAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:4846:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:4847:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:4847:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:4848:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getContextValidationAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_104);
            lv_nOfRecommendations_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextValidationRule());
            					}
            					set(
            						current,
            						"nOfRecommendations",
            						lv_nOfRecommendations_4_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:4865:3: (otherlv_5= 'testContext' ( ( ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==106) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalRsDsl.g:4866:4: otherlv_5= 'testContext' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,106,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextValidationAccess().getTestContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:4870:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4871:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4871:5: ( ruleEString )
                    // InternalRsDsl.g:4872:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextValidationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContextValidationAccess().getTestContextRecommendationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getContextValidationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextValidation"


    // $ANTLR start "entryRuleRandomSplitting"
    // InternalRsDsl.g:4895:1: entryRuleRandomSplitting returns [EObject current=null] : iv_ruleRandomSplitting= ruleRandomSplitting EOF ;
    public final EObject entryRuleRandomSplitting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomSplitting = null;


        try {
            // InternalRsDsl.g:4895:56: (iv_ruleRandomSplitting= ruleRandomSplitting EOF )
            // InternalRsDsl.g:4896:2: iv_ruleRandomSplitting= ruleRandomSplitting EOF
            {
             newCompositeNode(grammarAccess.getRandomSplittingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandomSplitting=ruleRandomSplitting();

            state._fsp--;

             current =iv_ruleRandomSplitting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandomSplitting"


    // $ANTLR start "ruleRandomSplitting"
    // InternalRsDsl.g:4902:1: ruleRandomSplitting returns [EObject current=null] : (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRandomSplitting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nOfRecommendations_4_0 = null;

        Enumerator lv_library_6_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:4908:2: ( (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:4909:2: (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:4909:2: (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:4910:3: otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRandomSplittingAccess().getRandomSplittingKeyword_0());
            		
            // InternalRsDsl.g:4914:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:4915:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:4915:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:4916:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRandomSplittingAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRandomSplittingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getRandomSplittingAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,100,FOLLOW_94); 

            			newLeafNode(otherlv_3, grammarAccess.getRandomSplittingAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:4941:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:4942:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:4942:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:4943:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRandomSplittingAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_105);
            lv_nOfRecommendations_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRandomSplittingRule());
            					}
            					set(
            						current,
            						"nOfRecommendations",
            						lv_nOfRecommendations_4_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:4960:3: (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==25) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalRsDsl.g:4961:4: otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_100); 

                    				newLeafNode(otherlv_5, grammarAccess.getRandomSplittingAccess().getLibraryKeyword_5_0());
                    			
                    // InternalRsDsl.g:4965:4: ( (lv_library_6_0= ruleValidationLibrary ) )
                    // InternalRsDsl.g:4966:5: (lv_library_6_0= ruleValidationLibrary )
                    {
                    // InternalRsDsl.g:4966:5: (lv_library_6_0= ruleValidationLibrary )
                    // InternalRsDsl.g:4967:6: lv_library_6_0= ruleValidationLibrary
                    {

                    						newCompositeNode(grammarAccess.getRandomSplittingAccess().getLibraryValidationLibraryEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_library_6_0=ruleValidationLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRandomSplittingRule());
                    						}
                    						set(
                    							current,
                    							"library",
                    							lv_library_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.ValidationLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRandomSplittingAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandomSplitting"


    // $ANTLR start "entryRuleAutomatedValidation_Impl"
    // InternalRsDsl.g:4993:1: entryRuleAutomatedValidation_Impl returns [EObject current=null] : iv_ruleAutomatedValidation_Impl= ruleAutomatedValidation_Impl EOF ;
    public final EObject entryRuleAutomatedValidation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomatedValidation_Impl = null;


        try {
            // InternalRsDsl.g:4993:65: (iv_ruleAutomatedValidation_Impl= ruleAutomatedValidation_Impl EOF )
            // InternalRsDsl.g:4994:2: iv_ruleAutomatedValidation_Impl= ruleAutomatedValidation_Impl EOF
            {
             newCompositeNode(grammarAccess.getAutomatedValidation_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomatedValidation_Impl=ruleAutomatedValidation_Impl();

            state._fsp--;

             current =iv_ruleAutomatedValidation_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutomatedValidation_Impl"


    // $ANTLR start "ruleAutomatedValidation_Impl"
    // InternalRsDsl.g:5000:1: ruleAutomatedValidation_Impl returns [EObject current=null] : (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAutomatedValidation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_nOfRecommendations_4_0 = null;

        Enumerator lv_library_6_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:5006:2: ( (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:5007:2: (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:5007:2: (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:5008:3: otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomatedValidation_ImplAccess().getAutomatedValidationKeyword_0());
            		
            // InternalRsDsl.g:5012:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:5013:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:5013:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:5014:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomatedValidation_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomatedValidation_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomatedValidation_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,100,FOLLOW_94); 

            			newLeafNode(otherlv_3, grammarAccess.getAutomatedValidation_ImplAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:5039:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:5040:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:5040:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:5041:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAutomatedValidation_ImplAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_105);
            lv_nOfRecommendations_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomatedValidation_ImplRule());
            					}
            					set(
            						current,
            						"nOfRecommendations",
            						lv_nOfRecommendations_4_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:5058:3: (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==25) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalRsDsl.g:5059:4: otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_100); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutomatedValidation_ImplAccess().getLibraryKeyword_5_0());
                    			
                    // InternalRsDsl.g:5063:4: ( (lv_library_6_0= ruleValidationLibrary ) )
                    // InternalRsDsl.g:5064:5: (lv_library_6_0= ruleValidationLibrary )
                    {
                    // InternalRsDsl.g:5064:5: (lv_library_6_0= ruleValidationLibrary )
                    // InternalRsDsl.g:5065:6: lv_library_6_0= ruleValidationLibrary
                    {

                    						newCompositeNode(grammarAccess.getAutomatedValidation_ImplAccess().getLibraryValidationLibraryEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_library_6_0=ruleValidationLibrary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomatedValidation_ImplRule());
                    						}
                    						set(
                    							current,
                    							"library",
                    							lv_library_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.ValidationLibrary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAutomatedValidation_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutomatedValidation_Impl"


    // $ANTLR start "entryRuleGroundTruthExtraction"
    // InternalRsDsl.g:5091:1: entryRuleGroundTruthExtraction returns [EObject current=null] : iv_ruleGroundTruthExtraction= ruleGroundTruthExtraction EOF ;
    public final EObject entryRuleGroundTruthExtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTruthExtraction = null;


        try {
            // InternalRsDsl.g:5091:62: (iv_ruleGroundTruthExtraction= ruleGroundTruthExtraction EOF )
            // InternalRsDsl.g:5092:2: iv_ruleGroundTruthExtraction= ruleGroundTruthExtraction EOF
            {
             newCompositeNode(grammarAccess.getGroundTruthExtractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroundTruthExtraction=ruleGroundTruthExtraction();

            state._fsp--;

             current =iv_ruleGroundTruthExtraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroundTruthExtraction"


    // $ANTLR start "ruleGroundTruthExtraction"
    // InternalRsDsl.g:5098:1: ruleGroundTruthExtraction returns [EObject current=null] : ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleGroundTruthExtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sizeGT_4_0 = null;

        AntlrDatatypeRuleToken lv_splittingRules_7_0 = null;

        AntlrDatatypeRuleToken lv_splittingRules_9_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:5104:2: ( ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalRsDsl.g:5105:2: ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalRsDsl.g:5105:2: ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalRsDsl.g:5106:3: () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalRsDsl.g:5106:3: ()
            // InternalRsDsl.g:5107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroundTruthExtractionAccess().getGroundTruthExtractionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGroundTruthExtractionAccess().getGroundTruthExtractionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_106); 

            			newLeafNode(otherlv_2, grammarAccess.getGroundTruthExtractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:5121:3: (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==110) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalRsDsl.g:5122:4: otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGroundTruthExtractionAccess().getSizeGTKeyword_3_0());
                    			
                    // InternalRsDsl.g:5126:4: ( (lv_sizeGT_4_0= ruleEString ) )
                    // InternalRsDsl.g:5127:5: (lv_sizeGT_4_0= ruleEString )
                    {
                    // InternalRsDsl.g:5127:5: (lv_sizeGT_4_0= ruleEString )
                    // InternalRsDsl.g:5128:6: lv_sizeGT_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getSizeGTEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_sizeGT_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroundTruthExtractionRule());
                    						}
                    						set(
                    							current,
                    							"sizeGT",
                    							lv_sizeGT_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5146:3: (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==111) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalRsDsl.g:5147:4: otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,111,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGroundTruthExtractionAccess().getSplittingRulesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroundTruthExtractionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:5155:4: ( (lv_splittingRules_7_0= ruleEString ) )
                    // InternalRsDsl.g:5156:5: (lv_splittingRules_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:5156:5: (lv_splittingRules_7_0= ruleEString )
                    // InternalRsDsl.g:5157:6: lv_splittingRules_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getSplittingRulesEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_splittingRules_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroundTruthExtractionRule());
                    						}
                    						add(
                    							current,
                    							"splittingRules",
                    							lv_splittingRules_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:5174:4: (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==21) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalRsDsl.g:5175:5: otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getGroundTruthExtractionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:5179:5: ( (lv_splittingRules_9_0= ruleEString ) )
                    	    // InternalRsDsl.g:5180:6: (lv_splittingRules_9_0= ruleEString )
                    	    {
                    	    // InternalRsDsl.g:5180:6: (lv_splittingRules_9_0= ruleEString )
                    	    // InternalRsDsl.g:5181:7: lv_splittingRules_9_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getSplittingRulesEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_splittingRules_9_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroundTruthExtractionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"splittingRules",
                    	    								lv_splittingRules_9_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_108); 

                    				newLeafNode(otherlv_10, grammarAccess.getGroundTruthExtractionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:5204:3: (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==112) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalRsDsl.g:5205:4: otherlv_11= 'targetVariable' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,112,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getGroundTruthExtractionAccess().getTargetVariableKeyword_5_0());
                    			
                    // InternalRsDsl.g:5209:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:5210:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:5210:5: ( ruleEString )
                    // InternalRsDsl.g:5211:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroundTruthExtractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getTargetVariableVariableCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getGroundTruthExtractionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroundTruthExtraction"


    // $ANTLR start "entryRuleRecommendationSetting"
    // InternalRsDsl.g:5234:1: entryRuleRecommendationSetting returns [EObject current=null] : iv_ruleRecommendationSetting= ruleRecommendationSetting EOF ;
    public final EObject entryRuleRecommendationSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationSetting = null;


        try {
            // InternalRsDsl.g:5234:62: (iv_ruleRecommendationSetting= ruleRecommendationSetting EOF )
            // InternalRsDsl.g:5235:2: iv_ruleRecommendationSetting= ruleRecommendationSetting EOF
            {
             newCompositeNode(grammarAccess.getRecommendationSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecommendationSetting=ruleRecommendationSetting();

            state._fsp--;

             current =iv_ruleRecommendationSetting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecommendationSetting"


    // $ANTLR start "ruleRecommendationSetting"
    // InternalRsDsl.g:5241:1: ruleRecommendationSetting returns [EObject current=null] : (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleRecommendationSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_key_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:5247:2: ( (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalRsDsl.g:5248:2: (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalRsDsl.g:5248:2: (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalRsDsl.g:5249:3: otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecommendationSettingAccess().getRecommendationSettingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_109); 

            			newLeafNode(otherlv_1, grammarAccess.getRecommendationSettingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,114,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendationSettingAccess().getKeyKeyword_2());
            		
            // InternalRsDsl.g:5261:3: ( (lv_key_3_0= ruleEString ) )
            // InternalRsDsl.g:5262:4: (lv_key_3_0= ruleEString )
            {
            // InternalRsDsl.g:5262:4: (lv_key_3_0= ruleEString )
            // InternalRsDsl.g:5263:5: lv_key_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecommendationSettingAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_110);
            lv_key_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecommendationSettingRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,115,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRecommendationSettingAccess().getValueKeyword_4());
            		
            // InternalRsDsl.g:5284:3: ( (lv_value_5_0= ruleEString ) )
            // InternalRsDsl.g:5285:4: (lv_value_5_0= ruleEString )
            {
            // InternalRsDsl.g:5285:4: (lv_value_5_0= ruleEString )
            // InternalRsDsl.g:5286:5: lv_value_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecommendationSettingAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecommendationSettingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRecommendationSettingAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecommendationSetting"


    // $ANTLR start "entryRuleMachineLearningBasedRS_Impl"
    // InternalRsDsl.g:5311:1: entryRuleMachineLearningBasedRS_Impl returns [EObject current=null] : iv_ruleMachineLearningBasedRS_Impl= ruleMachineLearningBasedRS_Impl EOF ;
    public final EObject entryRuleMachineLearningBasedRS_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachineLearningBasedRS_Impl = null;


        try {
            // InternalRsDsl.g:5311:68: (iv_ruleMachineLearningBasedRS_Impl= ruleMachineLearningBasedRS_Impl EOF )
            // InternalRsDsl.g:5312:2: iv_ruleMachineLearningBasedRS_Impl= ruleMachineLearningBasedRS_Impl EOF
            {
             newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachineLearningBasedRS_Impl=ruleMachineLearningBasedRS_Impl();

            state._fsp--;

             current =iv_ruleMachineLearningBasedRS_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachineLearningBasedRS_Impl"


    // $ANTLR start "ruleMachineLearningBasedRS_Impl"
    // InternalRsDsl.g:5318:1: ruleMachineLearningBasedRS_Impl returns [EObject current=null] : ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleMachineLearningBasedRS_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        EObject lv_settings_14_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_scope_19_0 = null;

        EObject lv_context_21_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:5324:2: ( ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:5325:2: ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:5325:2: ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:5326:3: () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:5326:3: ()
            // InternalRsDsl.g:5327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMachineLearningBasedRS_ImplAccess().getMachineLearningBasedRSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMachineLearningBasedRS_ImplAccess().getMachineLearningBasedRSKeyword_1());
            		
            // InternalRsDsl.g:5337:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:5338:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:5338:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:5339:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getMachineLearningBasedRS_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:5360:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==117) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalRsDsl.g:5361:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getMachineLearningBasedRS_ImplAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:5365:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:5366:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:5366:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:5367:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5385:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==118) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalRsDsl.g:5386:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getMachineLearningBasedRS_ImplAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:5390:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:5391:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5391:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:5392:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5410:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==119) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalRsDsl.g:5411:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getMachineLearningBasedRS_ImplAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:5415:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:5416:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5416:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:5417:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5435:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==120) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalRsDsl.g:5436:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getMachineLearningBasedRS_ImplAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:5440:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:5441:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5441:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:5442:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5460:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==121) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalRsDsl.g:5461:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getMachineLearningBasedRS_ImplAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_13, grammarAccess.getMachineLearningBasedRS_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:5469:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:5470:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:5470:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:5471:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_14_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_14_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:5488:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==21) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalRsDsl.g:5489:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMachineLearningBasedRS_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:5493:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:5494:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:5494:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:5495:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_16_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_16_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_17, grammarAccess.getMachineLearningBasedRS_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:5518:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==122) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalRsDsl.g:5519:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_18, grammarAccess.getMachineLearningBasedRS_ImplAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:5523:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:5524:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:5524:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:5525:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_19_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_19_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5543:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==84) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalRsDsl.g:5544:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getMachineLearningBasedRS_ImplAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:5548:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:5549:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:5549:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:5550:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_21_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMachineLearningBasedRS_ImplRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getMachineLearningBasedRS_ImplAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachineLearningBasedRS_Impl"


    // $ANTLR start "entryRuleFilteringRS"
    // InternalRsDsl.g:5576:1: entryRuleFilteringRS returns [EObject current=null] : iv_ruleFilteringRS= ruleFilteringRS EOF ;
    public final EObject entryRuleFilteringRS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteringRS = null;


        try {
            // InternalRsDsl.g:5576:52: (iv_ruleFilteringRS= ruleFilteringRS EOF )
            // InternalRsDsl.g:5577:2: iv_ruleFilteringRS= ruleFilteringRS EOF
            {
             newCompositeNode(grammarAccess.getFilteringRSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilteringRS=ruleFilteringRS();

            state._fsp--;

             current =iv_ruleFilteringRS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilteringRS"


    // $ANTLR start "ruleFilteringRS"
    // InternalRsDsl.g:5583:1: ruleFilteringRS returns [EObject current=null] : ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleFilteringRS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        Enumerator lv_filteringRSAlgorithm_7_0 = null;

        Enumerator lv_similarityCalculator_9_0 = null;

        AntlrDatatypeRuleToken lv_cutoff_11_0 = null;

        AntlrDatatypeRuleToken lv_neighborhood_13_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_settings_18_0 = null;

        EObject lv_scope_21_0 = null;

        EObject lv_context_23_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:5589:2: ( ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:5590:2: ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:5590:2: ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:5591:3: () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:5591:3: ()
            // InternalRsDsl.g:5592:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilteringRSAccess().getFilteringRSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,123,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFilteringRSAccess().getFilteringRSKeyword_1());
            		
            // InternalRsDsl.g:5602:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:5603:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:5603:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:5604:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilteringRSAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilteringRSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_121); 

            			newLeafNode(otherlv_3, grammarAccess.getFilteringRSAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:5625:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==117) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalRsDsl.g:5626:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getFilteringRSAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:5630:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:5631:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:5631:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:5632:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_122);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5650:3: (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==124) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalRsDsl.g:5651:4: otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) )
                    {
                    otherlv_6=(Token)match(input,124,FOLLOW_123); 

                    				newLeafNode(otherlv_6, grammarAccess.getFilteringRSAccess().getFilteringRSAlgorithmKeyword_5_0());
                    			
                    // InternalRsDsl.g:5655:4: ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) )
                    // InternalRsDsl.g:5656:5: (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm )
                    {
                    // InternalRsDsl.g:5656:5: (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm )
                    // InternalRsDsl.g:5657:6: lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getFilteringRSAlgorithmFilteringRSAlgorithmEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_filteringRSAlgorithm_7_0=ruleFilteringRSAlgorithm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						set(
                    							current,
                    							"filteringRSAlgorithm",
                    							lv_filteringRSAlgorithm_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.FilteringRSAlgorithm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5675:3: (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==125) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalRsDsl.g:5676:4: otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) )
                    {
                    otherlv_8=(Token)match(input,125,FOLLOW_125); 

                    				newLeafNode(otherlv_8, grammarAccess.getFilteringRSAccess().getSimilarityCalculatorKeyword_6_0());
                    			
                    // InternalRsDsl.g:5680:4: ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) )
                    // InternalRsDsl.g:5681:5: (lv_similarityCalculator_9_0= ruleSimilarityFunction )
                    {
                    // InternalRsDsl.g:5681:5: (lv_similarityCalculator_9_0= ruleSimilarityFunction )
                    // InternalRsDsl.g:5682:6: lv_similarityCalculator_9_0= ruleSimilarityFunction
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getSimilarityCalculatorSimilarityFunctionEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_126);
                    lv_similarityCalculator_9_0=ruleSimilarityFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						set(
                    							current,
                    							"similarityCalculator",
                    							lv_similarityCalculator_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.SimilarityFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5700:3: (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==126) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalRsDsl.g:5701:4: otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,126,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getFilteringRSAccess().getCutoffKeyword_7_0());
                    			
                    // InternalRsDsl.g:5705:4: ( (lv_cutoff_11_0= ruleEInt ) )
                    // InternalRsDsl.g:5706:5: (lv_cutoff_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5706:5: (lv_cutoff_11_0= ruleEInt )
                    // InternalRsDsl.g:5707:6: lv_cutoff_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getCutoffEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_127);
                    lv_cutoff_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						set(
                    							current,
                    							"cutoff",
                    							lv_cutoff_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5725:3: (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==127) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalRsDsl.g:5726:4: otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,127,FOLLOW_94); 

                    				newLeafNode(otherlv_12, grammarAccess.getFilteringRSAccess().getNeighborhoodKeyword_8_0());
                    			
                    // InternalRsDsl.g:5730:4: ( (lv_neighborhood_13_0= ruleEInt ) )
                    // InternalRsDsl.g:5731:5: (lv_neighborhood_13_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5731:5: (lv_neighborhood_13_0= ruleEInt )
                    // InternalRsDsl.g:5732:6: lv_neighborhood_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getNeighborhoodEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_neighborhood_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						set(
                    							current,
                    							"neighborhood",
                    							lv_neighborhood_13_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5750:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==121) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalRsDsl.g:5751:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getFilteringRSAccess().getSettingsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_15, grammarAccess.getFilteringRSAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRsDsl.g:5759:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:5760:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:5760:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:5761:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getSettingsRecommendationSettingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_16_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_16_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:5778:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==21) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalRsDsl.g:5779:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getFilteringRSAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRsDsl.g:5783:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:5784:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:5784:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:5785:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getFilteringRSAccess().getSettingsRecommendationSettingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_18_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_18_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_19, grammarAccess.getFilteringRSAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:5808:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==122) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalRsDsl.g:5809:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_20, grammarAccess.getFilteringRSAccess().getScopeKeyword_10_0());
                    			
                    // InternalRsDsl.g:5813:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:5814:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:5814:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:5815:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getScopeRecommendedItemParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_21_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5833:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==84) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalRsDsl.g:5834:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getFilteringRSAccess().getContextKeyword_11_0());
                    			
                    // InternalRsDsl.g:5838:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:5839:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:5839:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:5840:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getContextRecommendationContextParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_23_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilteringRSRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_23_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getFilteringRSAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilteringRS"


    // $ANTLR start "entryRuleDataMiningRS"
    // InternalRsDsl.g:5866:1: entryRuleDataMiningRS returns [EObject current=null] : iv_ruleDataMiningRS= ruleDataMiningRS EOF ;
    public final EObject entryRuleDataMiningRS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMiningRS = null;


        try {
            // InternalRsDsl.g:5866:53: (iv_ruleDataMiningRS= ruleDataMiningRS EOF )
            // InternalRsDsl.g:5867:2: iv_ruleDataMiningRS= ruleDataMiningRS EOF
            {
             newCompositeNode(grammarAccess.getDataMiningRSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataMiningRS=ruleDataMiningRS();

            state._fsp--;

             current =iv_ruleDataMiningRS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataMiningRS"


    // $ANTLR start "ruleDataMiningRS"
    // InternalRsDsl.g:5873:1: ruleDataMiningRS returns [EObject current=null] : ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleDataMiningRS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        Enumerator lv_dataMiningRSAlgorithm_7_0 = null;

        EObject lv_settings_10_0 = null;

        EObject lv_settings_12_0 = null;

        EObject lv_scope_15_0 = null;

        EObject lv_context_17_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:5879:2: ( ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' ) )
            // InternalRsDsl.g:5880:2: ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' )
            {
            // InternalRsDsl.g:5880:2: ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' )
            // InternalRsDsl.g:5881:3: () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}'
            {
            // InternalRsDsl.g:5881:3: ()
            // InternalRsDsl.g:5882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataMiningRSAccess().getDataMiningRSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,128,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataMiningRSAccess().getDataMiningRSKeyword_1());
            		
            // InternalRsDsl.g:5892:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:5893:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:5893:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:5894:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataMiningRSAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataMiningRSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_128); 

            			newLeafNode(otherlv_3, grammarAccess.getDataMiningRSAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:5915:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==117) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalRsDsl.g:5916:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataMiningRSAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:5920:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:5921:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:5921:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:5922:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_129);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataMiningRSRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5940:3: (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==129) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalRsDsl.g:5941:4: otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) )
                    {
                    otherlv_6=(Token)match(input,129,FOLLOW_130); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataMiningRSAccess().getDataMiningRSAlgorithmKeyword_5_0());
                    			
                    // InternalRsDsl.g:5945:4: ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) )
                    // InternalRsDsl.g:5946:5: (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm )
                    {
                    // InternalRsDsl.g:5946:5: (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm )
                    // InternalRsDsl.g:5947:6: lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getDataMiningRSAlgorithmDataMiningRSAlgorithmEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_dataMiningRSAlgorithm_7_0=ruleDataMiningRSAlgorithm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataMiningRSRule());
                    						}
                    						set(
                    							current,
                    							"dataMiningRSAlgorithm",
                    							lv_dataMiningRSAlgorithm_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.DataMiningRSAlgorithm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:5965:3: (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==121) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalRsDsl.g:5966:4: otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataMiningRSAccess().getSettingsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataMiningRSAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:5974:4: ( (lv_settings_10_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:5975:5: (lv_settings_10_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:5975:5: (lv_settings_10_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:5976:6: lv_settings_10_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getSettingsRecommendationSettingParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_10_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataMiningRSRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_10_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:5993:4: (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==21) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalRsDsl.g:5994:5: otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDataMiningRSAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:5998:5: ( (lv_settings_12_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:5999:6: (lv_settings_12_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:5999:6: (lv_settings_12_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6000:7: lv_settings_12_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataMiningRSAccess().getSettingsRecommendationSettingParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_12_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataMiningRSRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_12_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataMiningRSAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6023:3: (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==122) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalRsDsl.g:6024:4: otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) )
                    {
                    otherlv_14=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_14, grammarAccess.getDataMiningRSAccess().getScopeKeyword_7_0());
                    			
                    // InternalRsDsl.g:6028:4: ( (lv_scope_15_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6029:5: (lv_scope_15_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6029:5: (lv_scope_15_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6030:6: lv_scope_15_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getScopeRecommendedItemParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_15_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataMiningRSRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_15_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6048:3: (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==84) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalRsDsl.g:6049:4: otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) )
                    {
                    otherlv_16=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getDataMiningRSAccess().getContextKeyword_8_0());
                    			
                    // InternalRsDsl.g:6053:4: ( (lv_context_17_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6054:5: (lv_context_17_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6054:5: (lv_context_17_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6055:6: lv_context_17_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getContextRecommendationContextParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_17_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataMiningRSRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_17_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getDataMiningRSAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataMiningRS"


    // $ANTLR start "entryRuleCustomRecommender"
    // InternalRsDsl.g:6081:1: entryRuleCustomRecommender returns [EObject current=null] : iv_ruleCustomRecommender= ruleCustomRecommender EOF ;
    public final EObject entryRuleCustomRecommender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomRecommender = null;


        try {
            // InternalRsDsl.g:6081:58: (iv_ruleCustomRecommender= ruleCustomRecommender EOF )
            // InternalRsDsl.g:6082:2: iv_ruleCustomRecommender= ruleCustomRecommender EOF
            {
             newCompositeNode(grammarAccess.getCustomRecommenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomRecommender=ruleCustomRecommender();

            state._fsp--;

             current =iv_ruleCustomRecommender; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomRecommender"


    // $ANTLR start "ruleCustomRecommender"
    // InternalRsDsl.g:6088:1: ruleCustomRecommender returns [EObject current=null] : ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleCustomRecommender() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_requiredTools_10_0 = null;

        AntlrDatatypeRuleToken lv_requiredTools_12_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_settings_18_0 = null;

        EObject lv_scope_21_0 = null;

        EObject lv_context_23_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:6094:2: ( ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:6095:2: ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:6095:2: ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:6096:3: () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:6096:3: ()
            // InternalRsDsl.g:6097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomRecommenderAccess().getCustomRecommenderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,130,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomRecommenderAccess().getCustomRecommenderKeyword_1());
            		
            // InternalRsDsl.g:6107:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:6108:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:6108:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:6109:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomRecommenderAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_131); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomRecommenderAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6130:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==117) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalRsDsl.g:6131:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomRecommenderAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6135:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6136:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6136:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6137:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_132);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6155:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==131) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalRsDsl.g:6156:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,131,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomRecommenderAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalRsDsl.g:6160:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalRsDsl.g:6161:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:6161:5: (lv_description_7_0= ruleEString )
                    // InternalRsDsl.g:6162:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_133);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6180:3: (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==132) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalRsDsl.g:6181:4: otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,132,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getCustomRecommenderAccess().getRequiredToolsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCustomRecommenderAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:6189:4: ( (lv_requiredTools_10_0= ruleEString ) )
                    // InternalRsDsl.g:6190:5: (lv_requiredTools_10_0= ruleEString )
                    {
                    // InternalRsDsl.g:6190:5: (lv_requiredTools_10_0= ruleEString )
                    // InternalRsDsl.g:6191:6: lv_requiredTools_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getRequiredToolsEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_requiredTools_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    						}
                    						add(
                    							current,
                    							"requiredTools",
                    							lv_requiredTools_10_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:6208:4: (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==21) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalRsDsl.g:6209:5: otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCustomRecommenderAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:6213:5: ( (lv_requiredTools_12_0= ruleEString ) )
                    	    // InternalRsDsl.g:6214:6: (lv_requiredTools_12_0= ruleEString )
                    	    {
                    	    // InternalRsDsl.g:6214:6: (lv_requiredTools_12_0= ruleEString )
                    	    // InternalRsDsl.g:6215:7: lv_requiredTools_12_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomRecommenderAccess().getRequiredToolsEStringParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_requiredTools_12_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredTools",
                    	    								lv_requiredTools_12_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_116); 

                    				newLeafNode(otherlv_13, grammarAccess.getCustomRecommenderAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6238:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==121) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalRsDsl.g:6239:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getCustomRecommenderAccess().getSettingsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_15, grammarAccess.getCustomRecommenderAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRsDsl.g:6247:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:6248:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:6248:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:6249:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getSettingsRecommendationSettingParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_16_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_16_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:6266:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==21) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalRsDsl.g:6267:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getCustomRecommenderAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRsDsl.g:6271:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:6272:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:6272:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6273:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomRecommenderAccess().getSettingsRecommendationSettingParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_18_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_18_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_19, grammarAccess.getCustomRecommenderAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6296:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==122) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalRsDsl.g:6297:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_20, grammarAccess.getCustomRecommenderAccess().getScopeKeyword_8_0());
                    			
                    // InternalRsDsl.g:6301:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6302:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6302:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6303:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getScopeRecommendedItemParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_21_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6321:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==84) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalRsDsl.g:6322:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getCustomRecommenderAccess().getContextKeyword_9_0());
                    			
                    // InternalRsDsl.g:6326:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6327:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6327:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6328:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getContextRecommendationContextParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_23_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomRecommenderRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_23_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getCustomRecommenderAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomRecommender"


    // $ANTLR start "entryRuleGeneticAlgorithm"
    // InternalRsDsl.g:6354:1: entryRuleGeneticAlgorithm returns [EObject current=null] : iv_ruleGeneticAlgorithm= ruleGeneticAlgorithm EOF ;
    public final EObject entryRuleGeneticAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneticAlgorithm = null;


        try {
            // InternalRsDsl.g:6354:57: (iv_ruleGeneticAlgorithm= ruleGeneticAlgorithm EOF )
            // InternalRsDsl.g:6355:2: iv_ruleGeneticAlgorithm= ruleGeneticAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getGeneticAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneticAlgorithm=ruleGeneticAlgorithm();

            state._fsp--;

             current =iv_ruleGeneticAlgorithm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneticAlgorithm"


    // $ANTLR start "ruleGeneticAlgorithm"
    // InternalRsDsl.g:6361:1: ruleGeneticAlgorithm returns [EObject current=null] : ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleGeneticAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_fitnessFunction_7_0 = null;

        Enumerator lv_searchStrategy_9_0 = null;

        Enumerator lv_mutationOperator_11_0 = null;

        EObject lv_settings_14_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_scope_19_0 = null;

        EObject lv_context_21_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:6367:2: ( ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:6368:2: ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:6368:2: ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:6369:3: () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:6369:3: ()
            // InternalRsDsl.g:6370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeneticAlgorithmAccess().getGeneticAlgorithmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,133,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneticAlgorithmAccess().getGeneticAlgorithmKeyword_1());
            		
            // InternalRsDsl.g:6380:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:6381:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:6381:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:6382:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_134); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneticAlgorithmAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6403:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==117) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalRsDsl.g:6404:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getGeneticAlgorithmAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6408:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6409:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6409:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6410:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_135);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6428:3: (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==134) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalRsDsl.g:6429:4: otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,134,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGeneticAlgorithmAccess().getFitnessFunctionKeyword_5_0());
                    			
                    // InternalRsDsl.g:6433:4: ( (lv_fitnessFunction_7_0= ruleEString ) )
                    // InternalRsDsl.g:6434:5: (lv_fitnessFunction_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:6434:5: (lv_fitnessFunction_7_0= ruleEString )
                    // InternalRsDsl.g:6435:6: lv_fitnessFunction_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getFitnessFunctionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_136);
                    lv_fitnessFunction_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"fitnessFunction",
                    							lv_fitnessFunction_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6453:3: (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==135) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalRsDsl.g:6454:4: otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) )
                    {
                    otherlv_8=(Token)match(input,135,FOLLOW_137); 

                    				newLeafNode(otherlv_8, grammarAccess.getGeneticAlgorithmAccess().getSearchStrategyKeyword_6_0());
                    			
                    // InternalRsDsl.g:6458:4: ( (lv_searchStrategy_9_0= ruleSearchStrategy ) )
                    // InternalRsDsl.g:6459:5: (lv_searchStrategy_9_0= ruleSearchStrategy )
                    {
                    // InternalRsDsl.g:6459:5: (lv_searchStrategy_9_0= ruleSearchStrategy )
                    // InternalRsDsl.g:6460:6: lv_searchStrategy_9_0= ruleSearchStrategy
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getSearchStrategySearchStrategyEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_138);
                    lv_searchStrategy_9_0=ruleSearchStrategy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"searchStrategy",
                    							lv_searchStrategy_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.SearchStrategy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6478:3: (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==136) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalRsDsl.g:6479:4: otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) )
                    {
                    otherlv_10=(Token)match(input,136,FOLLOW_139); 

                    				newLeafNode(otherlv_10, grammarAccess.getGeneticAlgorithmAccess().getMutationOperatorKeyword_7_0());
                    			
                    // InternalRsDsl.g:6483:4: ( (lv_mutationOperator_11_0= ruleMutationOperation ) )
                    // InternalRsDsl.g:6484:5: (lv_mutationOperator_11_0= ruleMutationOperation )
                    {
                    // InternalRsDsl.g:6484:5: (lv_mutationOperator_11_0= ruleMutationOperation )
                    // InternalRsDsl.g:6485:6: lv_mutationOperator_11_0= ruleMutationOperation
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getMutationOperatorMutationOperationEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_mutationOperator_11_0=ruleMutationOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"mutationOperator",
                    							lv_mutationOperator_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.MutationOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6503:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==121) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalRsDsl.g:6504:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getGeneticAlgorithmAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_13, grammarAccess.getGeneticAlgorithmAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:6512:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:6513:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:6513:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:6514:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_14_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_14_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:6531:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==21) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalRsDsl.g:6532:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGeneticAlgorithmAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:6536:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:6537:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:6537:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6538:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_16_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_16_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_17, grammarAccess.getGeneticAlgorithmAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6561:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==122) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalRsDsl.g:6562:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_18, grammarAccess.getGeneticAlgorithmAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:6566:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6567:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6567:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6568:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_19_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_19_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6586:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==84) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalRsDsl.g:6587:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getGeneticAlgorithmAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:6591:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6592:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6592:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6593:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_21_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeneticAlgorithmRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getGeneticAlgorithmAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneticAlgorithm"


    // $ANTLR start "entryRuleDeepNN"
    // InternalRsDsl.g:6619:1: entryRuleDeepNN returns [EObject current=null] : iv_ruleDeepNN= ruleDeepNN EOF ;
    public final EObject entryRuleDeepNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeepNN = null;


        try {
            // InternalRsDsl.g:6619:47: (iv_ruleDeepNN= ruleDeepNN EOF )
            // InternalRsDsl.g:6620:2: iv_ruleDeepNN= ruleDeepNN EOF
            {
             newCompositeNode(grammarAccess.getDeepNNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeepNN=ruleDeepNN();

            state._fsp--;

             current =iv_ruleDeepNN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeepNN"


    // $ANTLR start "ruleDeepNN"
    // InternalRsDsl.g:6626:1: ruleDeepNN returns [EObject current=null] : ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleDeepNN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        AntlrDatatypeRuleToken lv_numHiddenLayer_13_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_settings_18_0 = null;

        EObject lv_scope_21_0 = null;

        EObject lv_context_23_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:6632:2: ( ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:6633:2: ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:6633:2: ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:6634:3: () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:6634:3: ()
            // InternalRsDsl.g:6635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeepNNAccess().getDeepNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,137,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeepNNAccess().getDeepNNKeyword_1());
            		
            // InternalRsDsl.g:6645:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:6646:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:6646:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:6647:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeepNNAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeepNNRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_140); 

            			newLeafNode(otherlv_3, grammarAccess.getDeepNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6668:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==117) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalRsDsl.g:6669:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeepNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6673:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6674:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6674:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6675:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_141);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6693:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==118) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalRsDsl.g:6694:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeepNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:6698:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:6699:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6699:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:6700:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_142);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6718:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==119) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalRsDsl.g:6719:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeepNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:6723:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:6724:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6724:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:6725:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_143);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6743:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==120) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalRsDsl.g:6744:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeepNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:6748:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:6749:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6749:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:6750:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_144);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6768:3: (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==138) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalRsDsl.g:6769:4: otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,138,FOLLOW_94); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeepNNAccess().getNumHiddenLayerKeyword_8_0());
                    			
                    // InternalRsDsl.g:6773:4: ( (lv_numHiddenLayer_13_0= ruleEInt ) )
                    // InternalRsDsl.g:6774:5: (lv_numHiddenLayer_13_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6774:5: (lv_numHiddenLayer_13_0= ruleEInt )
                    // InternalRsDsl.g:6775:6: lv_numHiddenLayer_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getNumHiddenLayerEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_numHiddenLayer_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						set(
                    							current,
                    							"numHiddenLayer",
                    							lv_numHiddenLayer_13_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6793:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==121) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalRsDsl.g:6794:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getDeepNNAccess().getSettingsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_15, grammarAccess.getDeepNNAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRsDsl.g:6802:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:6803:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:6803:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:6804:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getSettingsRecommendationSettingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_16_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_16_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:6821:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==21) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // InternalRsDsl.g:6822:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getDeepNNAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRsDsl.g:6826:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:6827:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:6827:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6828:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeepNNAccess().getSettingsRecommendationSettingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_18_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_18_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop153;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_19, grammarAccess.getDeepNNAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6851:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==122) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalRsDsl.g:6852:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_20, grammarAccess.getDeepNNAccess().getScopeKeyword_10_0());
                    			
                    // InternalRsDsl.g:6856:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6857:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6857:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6858:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getScopeRecommendedItemParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_21_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6876:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==84) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalRsDsl.g:6877:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getDeepNNAccess().getContextKeyword_11_0());
                    			
                    // InternalRsDsl.g:6881:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6882:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6882:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6883:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getContextRecommendationContextParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_23_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeepNNRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_23_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getDeepNNAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeepNN"


    // $ANTLR start "entryRuleConvolutionalNN"
    // InternalRsDsl.g:6909:1: entryRuleConvolutionalNN returns [EObject current=null] : iv_ruleConvolutionalNN= ruleConvolutionalNN EOF ;
    public final EObject entryRuleConvolutionalNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvolutionalNN = null;


        try {
            // InternalRsDsl.g:6909:56: (iv_ruleConvolutionalNN= ruleConvolutionalNN EOF )
            // InternalRsDsl.g:6910:2: iv_ruleConvolutionalNN= ruleConvolutionalNN EOF
            {
             newCompositeNode(grammarAccess.getConvolutionalNNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConvolutionalNN=ruleConvolutionalNN();

            state._fsp--;

             current =iv_ruleConvolutionalNN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConvolutionalNN"


    // $ANTLR start "ruleConvolutionalNN"
    // InternalRsDsl.g:6916:1: ruleConvolutionalNN returns [EObject current=null] : ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleConvolutionalNN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        EObject lv_settings_14_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_scope_19_0 = null;

        EObject lv_context_21_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:6922:2: ( ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:6923:2: ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:6923:2: ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:6924:3: () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:6924:3: ()
            // InternalRsDsl.g:6925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConvolutionalNNAccess().getConvolutionalNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,139,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConvolutionalNNAccess().getConvolutionalNNKeyword_1());
            		
            // InternalRsDsl.g:6935:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:6936:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:6936:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:6937:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConvolutionalNNAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getConvolutionalNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6958:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==117) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalRsDsl.g:6959:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getConvolutionalNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6963:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6964:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6964:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6965:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:6983:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==118) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalRsDsl.g:6984:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getConvolutionalNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:6988:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:6989:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6989:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:6990:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7008:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==119) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalRsDsl.g:7009:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getConvolutionalNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7013:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7014:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7014:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7015:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7033:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==120) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalRsDsl.g:7034:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getConvolutionalNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7038:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7039:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7039:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7040:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7058:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==121) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalRsDsl.g:7059:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getConvolutionalNNAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_13, grammarAccess.getConvolutionalNNAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:7067:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7068:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7068:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7069:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_14_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_14_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:7086:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==21) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // InternalRsDsl.g:7087:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getConvolutionalNNAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:7091:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:7092:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:7092:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:7093:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getConvolutionalNNAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_16_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_16_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop161;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_17, grammarAccess.getConvolutionalNNAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:7116:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==122) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalRsDsl.g:7117:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_18, grammarAccess.getConvolutionalNNAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:7121:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:7122:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:7122:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:7123:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_19_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_19_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7141:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==84) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalRsDsl.g:7142:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getConvolutionalNNAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:7146:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:7147:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:7147:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:7148:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_21_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConvolutionalNNRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getConvolutionalNNAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConvolutionalNN"


    // $ANTLR start "entryRuleBayesian"
    // InternalRsDsl.g:7174:1: entryRuleBayesian returns [EObject current=null] : iv_ruleBayesian= ruleBayesian EOF ;
    public final EObject entryRuleBayesian() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBayesian = null;


        try {
            // InternalRsDsl.g:7174:49: (iv_ruleBayesian= ruleBayesian EOF )
            // InternalRsDsl.g:7175:2: iv_ruleBayesian= ruleBayesian EOF
            {
             newCompositeNode(grammarAccess.getBayesianRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBayesian=ruleBayesian();

            state._fsp--;

             current =iv_ruleBayesian; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBayesian"


    // $ANTLR start "ruleBayesian"
    // InternalRsDsl.g:7181:1: ruleBayesian returns [EObject current=null] : ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleBayesian() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        EObject lv_settings_14_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_scope_19_0 = null;

        EObject lv_context_21_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:7187:2: ( ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:7188:2: ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:7188:2: ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:7189:3: () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:7189:3: ()
            // InternalRsDsl.g:7190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBayesianAccess().getBayesianAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,140,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBayesianAccess().getBayesianKeyword_1());
            		
            // InternalRsDsl.g:7200:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:7201:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:7201:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:7202:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBayesianAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBayesianRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getBayesianAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:7223:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==117) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalRsDsl.g:7224:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getBayesianAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:7228:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:7229:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:7229:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:7230:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBayesianRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7248:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==118) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalRsDsl.g:7249:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getBayesianAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:7253:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:7254:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7254:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:7255:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBayesianRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7273:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==119) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalRsDsl.g:7274:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getBayesianAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7278:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7279:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7279:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7280:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBayesianRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7298:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==120) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalRsDsl.g:7299:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getBayesianAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7303:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7304:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7304:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7305:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBayesianRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7323:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==121) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalRsDsl.g:7324:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getBayesianAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_13, grammarAccess.getBayesianAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:7332:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7333:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7333:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7334:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_14_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBayesianRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_14_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:7351:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop169:
                    do {
                        int alt169=2;
                        int LA169_0 = input.LA(1);

                        if ( (LA169_0==21) ) {
                            alt169=1;
                        }


                        switch (alt169) {
                    	case 1 :
                    	    // InternalRsDsl.g:7352:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getBayesianAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:7356:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:7357:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:7357:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:7358:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getBayesianAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_16_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBayesianRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_16_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop169;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_17, grammarAccess.getBayesianAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:7381:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==122) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalRsDsl.g:7382:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_18, grammarAccess.getBayesianAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:7386:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:7387:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:7387:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:7388:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_19_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBayesianRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_19_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7406:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==84) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalRsDsl.g:7407:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getBayesianAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:7411:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:7412:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:7412:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:7413:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_21_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBayesianRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getBayesianAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBayesian"


    // $ANTLR start "entryRuleRecurrentNN"
    // InternalRsDsl.g:7439:1: entryRuleRecurrentNN returns [EObject current=null] : iv_ruleRecurrentNN= ruleRecurrentNN EOF ;
    public final EObject entryRuleRecurrentNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecurrentNN = null;


        try {
            // InternalRsDsl.g:7439:52: (iv_ruleRecurrentNN= ruleRecurrentNN EOF )
            // InternalRsDsl.g:7440:2: iv_ruleRecurrentNN= ruleRecurrentNN EOF
            {
             newCompositeNode(grammarAccess.getRecurrentNNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecurrentNN=ruleRecurrentNN();

            state._fsp--;

             current =iv_ruleRecurrentNN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecurrentNN"


    // $ANTLR start "ruleRecurrentNN"
    // InternalRsDsl.g:7446:1: ruleRecurrentNN returns [EObject current=null] : ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleRecurrentNN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        EObject lv_settings_14_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_scope_19_0 = null;

        EObject lv_context_21_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:7452:2: ( ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:7453:2: ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:7453:2: ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:7454:3: () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:7454:3: ()
            // InternalRsDsl.g:7455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecurrentNNAccess().getRecurrentNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,141,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRecurrentNNAccess().getRecurrentNNKeyword_1());
            		
            // InternalRsDsl.g:7465:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:7466:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:7466:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:7467:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecurrentNNAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getRecurrentNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:7488:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==117) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalRsDsl.g:7489:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getRecurrentNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:7493:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:7494:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:7494:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:7495:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7513:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==118) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalRsDsl.g:7514:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecurrentNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:7518:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:7519:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7519:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:7520:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7538:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==119) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalRsDsl.g:7539:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecurrentNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7543:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7544:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7544:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7545:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7563:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==120) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalRsDsl.g:7564:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecurrentNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7568:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7569:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7569:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7570:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7588:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==121) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalRsDsl.g:7589:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getRecurrentNNAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_13, grammarAccess.getRecurrentNNAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:7597:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7598:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7598:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7599:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_14_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_14_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:7616:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop177:
                    do {
                        int alt177=2;
                        int LA177_0 = input.LA(1);

                        if ( (LA177_0==21) ) {
                            alt177=1;
                        }


                        switch (alt177) {
                    	case 1 :
                    	    // InternalRsDsl.g:7617:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRecurrentNNAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:7621:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:7622:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:7622:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:7623:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecurrentNNAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_16_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_16_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop177;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_17, grammarAccess.getRecurrentNNAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:7646:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==122) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalRsDsl.g:7647:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_18, grammarAccess.getRecurrentNNAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:7651:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:7652:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:7652:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:7653:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_19_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_19_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7671:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==84) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalRsDsl.g:7672:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getRecurrentNNAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:7676:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:7677:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:7677:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:7678:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_21_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecurrentNNRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getRecurrentNNAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecurrentNN"


    // $ANTLR start "entryRuleSVM"
    // InternalRsDsl.g:7704:1: entryRuleSVM returns [EObject current=null] : iv_ruleSVM= ruleSVM EOF ;
    public final EObject entryRuleSVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM = null;


        try {
            // InternalRsDsl.g:7704:44: (iv_ruleSVM= ruleSVM EOF )
            // InternalRsDsl.g:7705:2: iv_ruleSVM= ruleSVM EOF
            {
             newCompositeNode(grammarAccess.getSVMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVM=ruleSVM();

            state._fsp--;

             current =iv_ruleSVM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSVM"


    // $ANTLR start "ruleSVM"
    // InternalRsDsl.g:7711:1: ruleSVM returns [EObject current=null] : ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleSVM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        Enumerator lv_kernel_13_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_settings_18_0 = null;

        EObject lv_scope_21_0 = null;

        EObject lv_context_23_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:7717:2: ( ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:7718:2: ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:7718:2: ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:7719:3: () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:7719:3: ()
            // InternalRsDsl.g:7720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSVMAccess().getSVMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,142,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSVMAccess().getSVMKeyword_1());
            		
            // InternalRsDsl.g:7730:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:7731:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:7731:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:7732:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSVMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSVMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_145); 

            			newLeafNode(otherlv_3, grammarAccess.getSVMAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:7753:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==117) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // InternalRsDsl.g:7754:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getSVMAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:7758:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:7759:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:7759:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:7760:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_146);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7778:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==118) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalRsDsl.g:7779:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getSVMAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:7783:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:7784:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7784:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:7785:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_147);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7803:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==119) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalRsDsl.g:7804:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getSVMAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7808:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7809:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7809:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7810:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_148);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7828:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==120) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalRsDsl.g:7829:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getSVMAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7833:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7834:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7834:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7835:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_149);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7853:3: (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==143) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalRsDsl.g:7854:4: otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) )
                    {
                    otherlv_12=(Token)match(input,143,FOLLOW_150); 

                    				newLeafNode(otherlv_12, grammarAccess.getSVMAccess().getKernelKeyword_8_0());
                    			
                    // InternalRsDsl.g:7858:4: ( (lv_kernel_13_0= ruleKernelType ) )
                    // InternalRsDsl.g:7859:5: (lv_kernel_13_0= ruleKernelType )
                    {
                    // InternalRsDsl.g:7859:5: (lv_kernel_13_0= ruleKernelType )
                    // InternalRsDsl.g:7860:6: lv_kernel_13_0= ruleKernelType
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getKernelKernelTypeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_kernel_13_0=ruleKernelType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"kernel",
                    							lv_kernel_13_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.KernelType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7878:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==121) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // InternalRsDsl.g:7879:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getSVMAccess().getSettingsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_15, grammarAccess.getSVMAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRsDsl.g:7887:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7888:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7888:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7889:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getSettingsRecommendationSettingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_16_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_16_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:7906:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop186:
                    do {
                        int alt186=2;
                        int LA186_0 = input.LA(1);

                        if ( (LA186_0==21) ) {
                            alt186=1;
                        }


                        switch (alt186) {
                    	case 1 :
                    	    // InternalRsDsl.g:7907:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSVMAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRsDsl.g:7911:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:7912:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:7912:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:7913:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getSVMAccess().getSettingsRecommendationSettingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_18_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSVMRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_18_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop186;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_19, grammarAccess.getSVMAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:7936:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==122) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // InternalRsDsl.g:7937:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_20, grammarAccess.getSVMAccess().getScopeKeyword_10_0());
                    			
                    // InternalRsDsl.g:7941:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:7942:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:7942:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:7943:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getScopeRecommendedItemParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_21_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:7961:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==84) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalRsDsl.g:7962:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getSVMAccess().getContextKeyword_11_0());
                    			
                    // InternalRsDsl.g:7966:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:7967:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:7967:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:7968:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getContextRecommendationContextParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_23_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_23_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getSVMAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVM"


    // $ANTLR start "entryRuleDecisionTree"
    // InternalRsDsl.g:7994:1: entryRuleDecisionTree returns [EObject current=null] : iv_ruleDecisionTree= ruleDecisionTree EOF ;
    public final EObject entryRuleDecisionTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionTree = null;


        try {
            // InternalRsDsl.g:7994:53: (iv_ruleDecisionTree= ruleDecisionTree EOF )
            // InternalRsDsl.g:7995:2: iv_ruleDecisionTree= ruleDecisionTree EOF
            {
             newCompositeNode(grammarAccess.getDecisionTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionTree=ruleDecisionTree();

            state._fsp--;

             current =iv_ruleDecisionTree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecisionTree"


    // $ANTLR start "ruleDecisionTree"
    // InternalRsDsl.g:8001:1: ruleDecisionTree returns [EObject current=null] : ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleDecisionTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        EObject lv_settings_14_0 = null;

        EObject lv_settings_16_0 = null;

        EObject lv_scope_19_0 = null;

        EObject lv_context_21_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8007:2: ( ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:8008:2: ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:8008:2: ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:8009:3: () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:8009:3: ()
            // InternalRsDsl.g:8010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecisionTreeAccess().getDecisionTreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,144,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionTreeAccess().getDecisionTreeKeyword_1());
            		
            // InternalRsDsl.g:8020:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:8021:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:8021:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:8022:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecisionTreeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_3, grammarAccess.getDecisionTreeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:8043:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==117) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalRsDsl.g:8044:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecisionTreeAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:8048:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:8049:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:8049:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:8050:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8068:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==118) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalRsDsl.g:8069:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getDecisionTreeAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:8073:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:8074:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8074:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:8075:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8093:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==119) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // InternalRsDsl.g:8094:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getDecisionTreeAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:8098:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:8099:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8099:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:8100:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8118:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==120) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalRsDsl.g:8119:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getDecisionTreeAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:8123:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:8124:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8124:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:8125:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8143:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==121) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // InternalRsDsl.g:8144:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getDecisionTreeAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_13, grammarAccess.getDecisionTreeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:8152:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:8153:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:8153:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:8154:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_14_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_14_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:8171:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop194:
                    do {
                        int alt194=2;
                        int LA194_0 = input.LA(1);

                        if ( (LA194_0==21) ) {
                            alt194=1;
                        }


                        switch (alt194) {
                    	case 1 :
                    	    // InternalRsDsl.g:8172:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getDecisionTreeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:8176:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:8177:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:8177:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:8178:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getDecisionTreeAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_16_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_16_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop194;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_17, grammarAccess.getDecisionTreeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:8201:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==122) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // InternalRsDsl.g:8202:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_18, grammarAccess.getDecisionTreeAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:8206:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8207:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8207:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8208:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_19_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_19_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8226:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( (LA197_0==84) ) {
                alt197=1;
            }
            switch (alt197) {
                case 1 :
                    // InternalRsDsl.g:8227:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getDecisionTreeAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:8231:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:8232:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:8232:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:8233:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_21_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_21_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getDecisionTreeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecisionTree"


    // $ANTLR start "entryRuleFeedForwardNN"
    // InternalRsDsl.g:8259:1: entryRuleFeedForwardNN returns [EObject current=null] : iv_ruleFeedForwardNN= ruleFeedForwardNN EOF ;
    public final EObject entryRuleFeedForwardNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedForwardNN = null;


        try {
            // InternalRsDsl.g:8259:54: (iv_ruleFeedForwardNN= ruleFeedForwardNN EOF )
            // InternalRsDsl.g:8260:2: iv_ruleFeedForwardNN= ruleFeedForwardNN EOF
            {
             newCompositeNode(grammarAccess.getFeedForwardNNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedForwardNN=ruleFeedForwardNN();

            state._fsp--;

             current =iv_ruleFeedForwardNN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeedForwardNN"


    // $ANTLR start "ruleFeedForwardNN"
    // InternalRsDsl.g:8266:1: ruleFeedForwardNN returns [EObject current=null] : ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleFeedForwardNN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_generator_5_0 = null;

        AntlrDatatypeRuleToken lv_numEpochs_7_0 = null;

        AntlrDatatypeRuleToken lv_learningRate_9_0 = null;

        AntlrDatatypeRuleToken lv_miniBatchSize_11_0 = null;

        Enumerator lv_solver_13_0 = null;

        AntlrDatatypeRuleToken lv_alpha_15_0 = null;

        Enumerator lv_activationFunction_17_0 = null;

        AntlrDatatypeRuleToken lv_randomState_19_0 = null;

        EObject lv_settings_22_0 = null;

        EObject lv_settings_24_0 = null;

        EObject lv_scope_27_0 = null;

        EObject lv_context_29_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8272:2: ( ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' ) )
            // InternalRsDsl.g:8273:2: ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' )
            {
            // InternalRsDsl.g:8273:2: ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' )
            // InternalRsDsl.g:8274:3: () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}'
            {
            // InternalRsDsl.g:8274:3: ()
            // InternalRsDsl.g:8275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeedForwardNNAccess().getFeedForwardNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,145,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFeedForwardNNAccess().getFeedForwardNNKeyword_1());
            		
            // InternalRsDsl.g:8285:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:8286:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:8286:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:8287:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeedForwardNNAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_151); 

            			newLeafNode(otherlv_3, grammarAccess.getFeedForwardNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:8308:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==117) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // InternalRsDsl.g:8309:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,117,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedForwardNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:8313:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:8314:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:8314:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:8315:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_152);
                    lv_generator_5_0=rulePyLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"generator",
                    							lv_generator_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PyLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8333:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==118) ) {
                alt199=1;
            }
            switch (alt199) {
                case 1 :
                    // InternalRsDsl.g:8334:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,118,FOLLOW_94); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedForwardNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:8338:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:8339:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8339:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:8340:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_153);
                    lv_numEpochs_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"numEpochs",
                    							lv_numEpochs_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8358:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==119) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // InternalRsDsl.g:8359:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,119,FOLLOW_94); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeedForwardNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:8363:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:8364:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8364:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:8365:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_154);
                    lv_learningRate_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"learningRate",
                    							lv_learningRate_9_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8383:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==120) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // InternalRsDsl.g:8384:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_10, grammarAccess.getFeedForwardNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:8388:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:8389:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8389:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:8390:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_155);
                    lv_miniBatchSize_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"miniBatchSize",
                    							lv_miniBatchSize_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8408:3: (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==146) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // InternalRsDsl.g:8409:4: otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) )
                    {
                    otherlv_12=(Token)match(input,146,FOLLOW_156); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeedForwardNNAccess().getSolverKeyword_8_0());
                    			
                    // InternalRsDsl.g:8413:4: ( (lv_solver_13_0= ruleSolverType ) )
                    // InternalRsDsl.g:8414:5: (lv_solver_13_0= ruleSolverType )
                    {
                    // InternalRsDsl.g:8414:5: (lv_solver_13_0= ruleSolverType )
                    // InternalRsDsl.g:8415:6: lv_solver_13_0= ruleSolverType
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getSolverSolverTypeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_157);
                    lv_solver_13_0=ruleSolverType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"solver",
                    							lv_solver_13_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.SolverType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8433:3: (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==147) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // InternalRsDsl.g:8434:4: otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) )
                    {
                    otherlv_14=(Token)match(input,147,FOLLOW_158); 

                    				newLeafNode(otherlv_14, grammarAccess.getFeedForwardNNAccess().getAlphaKeyword_9_0());
                    			
                    // InternalRsDsl.g:8438:4: ( (lv_alpha_15_0= ruleEFloat ) )
                    // InternalRsDsl.g:8439:5: (lv_alpha_15_0= ruleEFloat )
                    {
                    // InternalRsDsl.g:8439:5: (lv_alpha_15_0= ruleEFloat )
                    // InternalRsDsl.g:8440:6: lv_alpha_15_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getAlphaEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_159);
                    lv_alpha_15_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"alpha",
                    							lv_alpha_15_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8458:3: (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==148) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // InternalRsDsl.g:8459:4: otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) )
                    {
                    otherlv_16=(Token)match(input,148,FOLLOW_160); 

                    				newLeafNode(otherlv_16, grammarAccess.getFeedForwardNNAccess().getActivationFunctionKeyword_10_0());
                    			
                    // InternalRsDsl.g:8463:4: ( (lv_activationFunction_17_0= ruleActivationType ) )
                    // InternalRsDsl.g:8464:5: (lv_activationFunction_17_0= ruleActivationType )
                    {
                    // InternalRsDsl.g:8464:5: (lv_activationFunction_17_0= ruleActivationType )
                    // InternalRsDsl.g:8465:6: lv_activationFunction_17_0= ruleActivationType
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getActivationFunctionActivationTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_161);
                    lv_activationFunction_17_0=ruleActivationType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"activationFunction",
                    							lv_activationFunction_17_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.ActivationType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8483:3: (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==149) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalRsDsl.g:8484:4: otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) )
                    {
                    otherlv_18=(Token)match(input,149,FOLLOW_94); 

                    				newLeafNode(otherlv_18, grammarAccess.getFeedForwardNNAccess().getRandomStateKeyword_11_0());
                    			
                    // InternalRsDsl.g:8488:4: ( (lv_randomState_19_0= ruleEInt ) )
                    // InternalRsDsl.g:8489:5: (lv_randomState_19_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8489:5: (lv_randomState_19_0= ruleEInt )
                    // InternalRsDsl.g:8490:6: lv_randomState_19_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getRandomStateEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_randomState_19_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"randomState",
                    							lv_randomState_19_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8508:3: (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==121) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalRsDsl.g:8509:4: otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getFeedForwardNNAccess().getSettingsKeyword_12_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_117); 

                    				newLeafNode(otherlv_21, grammarAccess.getFeedForwardNNAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalRsDsl.g:8517:4: ( (lv_settings_22_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:8518:5: (lv_settings_22_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:8518:5: (lv_settings_22_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:8519:6: lv_settings_22_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getSettingsRecommendationSettingParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_settings_22_0=ruleRecommendationSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						add(
                    							current,
                    							"settings",
                    							lv_settings_22_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:8536:4: (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )*
                    loop206:
                    do {
                        int alt206=2;
                        int LA206_0 = input.LA(1);

                        if ( (LA206_0==21) ) {
                            alt206=1;
                        }


                        switch (alt206) {
                    	case 1 :
                    	    // InternalRsDsl.g:8537:5: otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_23=(Token)match(input,21,FOLLOW_117); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getFeedForwardNNAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalRsDsl.g:8541:5: ( (lv_settings_24_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:8542:6: (lv_settings_24_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:8542:6: (lv_settings_24_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:8543:7: lv_settings_24_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeedForwardNNAccess().getSettingsRecommendationSettingParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_settings_24_0=ruleRecommendationSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"settings",
                    	    								lv_settings_24_0,
                    	    								"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop206;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,18,FOLLOW_118); 

                    				newLeafNode(otherlv_25, grammarAccess.getFeedForwardNNAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:8566:3: (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )?
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==122) ) {
                alt208=1;
            }
            switch (alt208) {
                case 1 :
                    // InternalRsDsl.g:8567:4: otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) )
                    {
                    otherlv_26=(Token)match(input,122,FOLLOW_119); 

                    				newLeafNode(otherlv_26, grammarAccess.getFeedForwardNNAccess().getScopeKeyword_13_0());
                    			
                    // InternalRsDsl.g:8571:4: ( (lv_scope_27_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8572:5: (lv_scope_27_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8572:5: (lv_scope_27_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8573:6: lv_scope_27_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getScopeRecommendedItemParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    lv_scope_27_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"scope",
                    							lv_scope_27_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8591:3: (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==84) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // InternalRsDsl.g:8592:4: otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) )
                    {
                    otherlv_28=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_28, grammarAccess.getFeedForwardNNAccess().getContextKeyword_14_0());
                    			
                    // InternalRsDsl.g:8596:4: ( (lv_context_29_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:8597:5: (lv_context_29_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:8597:5: (lv_context_29_0= ruleRecommendationContext )
                    // InternalRsDsl.g:8598:6: lv_context_29_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getContextRecommendationContextParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_context_29_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedForwardNNRule());
                    						}
                    						set(
                    							current,
                    							"context",
                    							lv_context_29_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getFeedForwardNNAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeedForwardNN"


    // $ANTLR start "entryRuleEFloat"
    // InternalRsDsl.g:8624:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRsDsl.g:8624:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRsDsl.g:8625:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalRsDsl.g:8631:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRsDsl.g:8637:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRsDsl.g:8638:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRsDsl.g:8638:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRsDsl.g:8639:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRsDsl.g:8639:3: (kw= '-' )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==98) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // InternalRsDsl.g:8640:4: kw= '-'
                    {
                    kw=(Token)match(input,98,FOLLOW_162); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:8646:3: (this_INT_1= RULE_INT )?
            int alt211=2;
            int LA211_0 = input.LA(1);

            if ( (LA211_0==RULE_INT) ) {
                alt211=1;
            }
            switch (alt211) {
                case 1 :
                    // InternalRsDsl.g:8647:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_163); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,150,FOLLOW_92); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_164); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalRsDsl.g:8667:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( ((LA214_0>=151 && LA214_0<=152)) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // InternalRsDsl.g:8668:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRsDsl.g:8668:4: (kw= 'E' | kw= 'e' )
                    int alt212=2;
                    int LA212_0 = input.LA(1);

                    if ( (LA212_0==151) ) {
                        alt212=1;
                    }
                    else if ( (LA212_0==152) ) {
                        alt212=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 212, 0, input);

                        throw nvae;
                    }
                    switch (alt212) {
                        case 1 :
                            // InternalRsDsl.g:8669:5: kw= 'E'
                            {
                            kw=(Token)match(input,151,FOLLOW_94); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRsDsl.g:8675:5: kw= 'e'
                            {
                            kw=(Token)match(input,152,FOLLOW_94); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRsDsl.g:8681:4: (kw= '-' )?
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==98) ) {
                        alt213=1;
                    }
                    switch (alt213) {
                        case 1 :
                            // InternalRsDsl.g:8682:5: kw= '-'
                            {
                            kw=(Token)match(input,98,FOLLOW_92); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleImplicitFeedback"
    // InternalRsDsl.g:8700:1: entryRuleImplicitFeedback returns [EObject current=null] : iv_ruleImplicitFeedback= ruleImplicitFeedback EOF ;
    public final EObject entryRuleImplicitFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitFeedback = null;


        try {
            // InternalRsDsl.g:8700:57: (iv_ruleImplicitFeedback= ruleImplicitFeedback EOF )
            // InternalRsDsl.g:8701:2: iv_ruleImplicitFeedback= ruleImplicitFeedback EOF
            {
             newCompositeNode(grammarAccess.getImplicitFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicitFeedback=ruleImplicitFeedback();

            state._fsp--;

             current =iv_ruleImplicitFeedback; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicitFeedback"


    // $ANTLR start "ruleImplicitFeedback"
    // InternalRsDsl.g:8707:1: ruleImplicitFeedback returns [EObject current=null] : ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleImplicitFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_item_4_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8713:2: ( ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) )
            // InternalRsDsl.g:8714:2: ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            {
            // InternalRsDsl.g:8714:2: ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            // InternalRsDsl.g:8715:3: () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}'
            {
            // InternalRsDsl.g:8715:3: ()
            // InternalRsDsl.g:8716:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplicitFeedbackAccess().getImplicitFeedbackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,153,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicitFeedbackAccess().getImplicitFeedbackKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_165); 

            			newLeafNode(otherlv_2, grammarAccess.getImplicitFeedbackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:8730:3: (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==154) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // InternalRsDsl.g:8731:4: otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) )
                    {
                    otherlv_3=(Token)match(input,154,FOLLOW_119); 

                    				newLeafNode(otherlv_3, grammarAccess.getImplicitFeedbackAccess().getItemKeyword_3_0());
                    			
                    // InternalRsDsl.g:8735:4: ( (lv_item_4_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8736:5: (lv_item_4_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8736:5: (lv_item_4_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8737:6: lv_item_4_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getImplicitFeedbackAccess().getItemRecommendedItemParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_item_4_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplicitFeedbackRule());
                    						}
                    						set(
                    							current,
                    							"item",
                    							lv_item_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getImplicitFeedbackAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicitFeedback"


    // $ANTLR start "entryRuleHybridFeedback"
    // InternalRsDsl.g:8763:1: entryRuleHybridFeedback returns [EObject current=null] : iv_ruleHybridFeedback= ruleHybridFeedback EOF ;
    public final EObject entryRuleHybridFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridFeedback = null;


        try {
            // InternalRsDsl.g:8763:55: (iv_ruleHybridFeedback= ruleHybridFeedback EOF )
            // InternalRsDsl.g:8764:2: iv_ruleHybridFeedback= ruleHybridFeedback EOF
            {
             newCompositeNode(grammarAccess.getHybridFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHybridFeedback=ruleHybridFeedback();

            state._fsp--;

             current =iv_ruleHybridFeedback; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHybridFeedback"


    // $ANTLR start "ruleHybridFeedback"
    // InternalRsDsl.g:8770:1: ruleHybridFeedback returns [EObject current=null] : ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleHybridFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_item_4_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8776:2: ( ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) )
            // InternalRsDsl.g:8777:2: ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            {
            // InternalRsDsl.g:8777:2: ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            // InternalRsDsl.g:8778:3: () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}'
            {
            // InternalRsDsl.g:8778:3: ()
            // InternalRsDsl.g:8779:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHybridFeedbackAccess().getHybridFeedbackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,155,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHybridFeedbackAccess().getHybridFeedbackKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_165); 

            			newLeafNode(otherlv_2, grammarAccess.getHybridFeedbackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:8793:3: (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )?
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==154) ) {
                alt216=1;
            }
            switch (alt216) {
                case 1 :
                    // InternalRsDsl.g:8794:4: otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) )
                    {
                    otherlv_3=(Token)match(input,154,FOLLOW_119); 

                    				newLeafNode(otherlv_3, grammarAccess.getHybridFeedbackAccess().getItemKeyword_3_0());
                    			
                    // InternalRsDsl.g:8798:4: ( (lv_item_4_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8799:5: (lv_item_4_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8799:5: (lv_item_4_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8800:6: lv_item_4_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getHybridFeedbackAccess().getItemRecommendedItemParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_item_4_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHybridFeedbackRule());
                    						}
                    						set(
                    							current,
                    							"item",
                    							lv_item_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHybridFeedbackAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHybridFeedback"


    // $ANTLR start "entryRuleAdditiveFeedback"
    // InternalRsDsl.g:8826:1: entryRuleAdditiveFeedback returns [EObject current=null] : iv_ruleAdditiveFeedback= ruleAdditiveFeedback EOF ;
    public final EObject entryRuleAdditiveFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveFeedback = null;


        try {
            // InternalRsDsl.g:8826:57: (iv_ruleAdditiveFeedback= ruleAdditiveFeedback EOF )
            // InternalRsDsl.g:8827:2: iv_ruleAdditiveFeedback= ruleAdditiveFeedback EOF
            {
             newCompositeNode(grammarAccess.getAdditiveFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveFeedback=ruleAdditiveFeedback();

            state._fsp--;

             current =iv_ruleAdditiveFeedback; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveFeedback"


    // $ANTLR start "ruleAdditiveFeedback"
    // InternalRsDsl.g:8833:1: ruleAdditiveFeedback returns [EObject current=null] : ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAdditiveFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_numOfInsertion_4_0 = null;

        EObject lv_item_8_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8839:2: ( ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' ) )
            // InternalRsDsl.g:8840:2: ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' )
            {
            // InternalRsDsl.g:8840:2: ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' )
            // InternalRsDsl.g:8841:3: () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}'
            {
            // InternalRsDsl.g:8841:3: ()
            // InternalRsDsl.g:8842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAdditiveFeedbackAccess().getAdditiveFeedbackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,156,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditiveFeedbackAccess().getAdditiveFeedbackKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_166); 

            			newLeafNode(otherlv_2, grammarAccess.getAdditiveFeedbackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:8856:3: (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==157) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // InternalRsDsl.g:8857:4: otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,157,FOLLOW_94); 

                    				newLeafNode(otherlv_3, grammarAccess.getAdditiveFeedbackAccess().getNumOfInsertionKeyword_3_0());
                    			
                    // InternalRsDsl.g:8861:4: ( (lv_numOfInsertion_4_0= ruleEInt ) )
                    // InternalRsDsl.g:8862:5: (lv_numOfInsertion_4_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8862:5: (lv_numOfInsertion_4_0= ruleEInt )
                    // InternalRsDsl.g:8863:6: lv_numOfInsertion_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAdditiveFeedbackAccess().getNumOfInsertionEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_167);
                    lv_numOfInsertion_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdditiveFeedbackRule());
                    						}
                    						set(
                    							current,
                    							"numOfInsertion",
                    							lv_numOfInsertion_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8881:3: (otherlv_5= 'recommender' ( ( ruleEString ) ) )?
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==158) ) {
                alt218=1;
            }
            switch (alt218) {
                case 1 :
                    // InternalRsDsl.g:8882:4: otherlv_5= 'recommender' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,158,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAdditiveFeedbackAccess().getRecommenderKeyword_4_0());
                    			
                    // InternalRsDsl.g:8886:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:8887:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:8887:5: ( ruleEString )
                    // InternalRsDsl.g:8888:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditiveFeedbackRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAdditiveFeedbackAccess().getRecommenderRecommendationSystemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_165);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8903:3: (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==154) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // InternalRsDsl.g:8904:4: otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) )
                    {
                    otherlv_7=(Token)match(input,154,FOLLOW_119); 

                    				newLeafNode(otherlv_7, grammarAccess.getAdditiveFeedbackAccess().getItemKeyword_5_0());
                    			
                    // InternalRsDsl.g:8908:4: ( (lv_item_8_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8909:5: (lv_item_8_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8909:5: (lv_item_8_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8910:6: lv_item_8_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getAdditiveFeedbackAccess().getItemRecommendedItemParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_item_8_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdditiveFeedbackRule());
                    						}
                    						set(
                    							current,
                    							"item",
                    							lv_item_8_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAdditiveFeedbackAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveFeedback"


    // $ANTLR start "entryRuleRating"
    // InternalRsDsl.g:8936:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalRsDsl.g:8936:47: (iv_ruleRating= ruleRating EOF )
            // InternalRsDsl.g:8937:2: iv_ruleRating= ruleRating EOF
            {
             newCompositeNode(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRating=ruleRating();

            state._fsp--;

             current =iv_ruleRating; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // InternalRsDsl.g:8943:1: ruleRating returns [EObject current=null] : ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_item_6_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8949:2: ( ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:8950:2: ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:8950:2: ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:8951:3: () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}'
            {
            // InternalRsDsl.g:8951:3: ()
            // InternalRsDsl.g:8952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRatingAccess().getRatingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,159,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getRatingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_168); 

            			newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:8966:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==31) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // InternalRsDsl.g:8967:4: otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_169); 

                    				newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getTypeKeyword_3_0());
                    			
                    // InternalRsDsl.g:8971:4: ( (lv_type_4_0= ruleRatingType ) )
                    // InternalRsDsl.g:8972:5: (lv_type_4_0= ruleRatingType )
                    {
                    // InternalRsDsl.g:8972:5: (lv_type_4_0= ruleRatingType )
                    // InternalRsDsl.g:8973:6: lv_type_4_0= ruleRatingType
                    {

                    						newCompositeNode(grammarAccess.getRatingAccess().getTypeRatingTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_165);
                    lv_type_4_0=ruleRatingType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRatingRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RatingType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:8991:3: (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==154) ) {
                alt221=1;
            }
            switch (alt221) {
                case 1 :
                    // InternalRsDsl.g:8992:4: otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) )
                    {
                    otherlv_5=(Token)match(input,154,FOLLOW_119); 

                    				newLeafNode(otherlv_5, grammarAccess.getRatingAccess().getItemKeyword_4_0());
                    			
                    // InternalRsDsl.g:8996:4: ( (lv_item_6_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8997:5: (lv_item_6_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8997:5: (lv_item_6_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8998:6: lv_item_6_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getRatingAccess().getItemRecommendedItemParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_item_6_0=ruleRecommendedItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRatingRule());
                    						}
                    						set(
                    							current,
                    							"item",
                    							lv_item_6_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendedItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRatingAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRating"


    // $ANTLR start "rulePreprocessingTechnique"
    // InternalRsDsl.g:9024:1: rulePreprocessingTechnique returns [Enumerator current=null] : ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) ) ;
    public final Enumerator rulePreprocessingTechnique() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9030:2: ( ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) ) )
            // InternalRsDsl.g:9031:2: ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) )
            {
            // InternalRsDsl.g:9031:2: ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) )
            int alt222=7;
            switch ( input.LA(1) ) {
            case 160:
                {
                alt222=1;
                }
                break;
            case 161:
                {
                alt222=2;
                }
                break;
            case 162:
                {
                alt222=3;
                }
                break;
            case 163:
                {
                alt222=4;
                }
                break;
            case 164:
                {
                alt222=5;
                }
                break;
            case 165:
                {
                alt222=6;
                }
                break;
            case 166:
                {
                alt222=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 222, 0, input);

                throw nvae;
            }

            switch (alt222) {
                case 1 :
                    // InternalRsDsl.g:9032:3: (enumLiteral_0= 'DUPLICATES_REMOVAL' )
                    {
                    // InternalRsDsl.g:9032:3: (enumLiteral_0= 'DUPLICATES_REMOVAL' )
                    // InternalRsDsl.g:9033:4: enumLiteral_0= 'DUPLICATES_REMOVAL'
                    {
                    enumLiteral_0=(Token)match(input,160,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getDUPLICATES_REMOVALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPreprocessingTechniqueAccess().getDUPLICATES_REMOVALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9040:3: (enumLiteral_1= 'NLP' )
                    {
                    // InternalRsDsl.g:9040:3: (enumLiteral_1= 'NLP' )
                    // InternalRsDsl.g:9041:4: enumLiteral_1= 'NLP'
                    {
                    enumLiteral_1=(Token)match(input,161,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getNLPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPreprocessingTechniqueAccess().getNLPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9048:3: (enumLiteral_2= 'NORMALIZATION' )
                    {
                    // InternalRsDsl.g:9048:3: (enumLiteral_2= 'NORMALIZATION' )
                    // InternalRsDsl.g:9049:4: enumLiteral_2= 'NORMALIZATION'
                    {
                    enumLiteral_2=(Token)match(input,162,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getNORMALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPreprocessingTechniqueAccess().getNORMALIZATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9056:3: (enumLiteral_3= 'MISSING_DATA_MANIPULATION' )
                    {
                    // InternalRsDsl.g:9056:3: (enumLiteral_3= 'MISSING_DATA_MANIPULATION' )
                    // InternalRsDsl.g:9057:4: enumLiteral_3= 'MISSING_DATA_MANIPULATION'
                    {
                    enumLiteral_3=(Token)match(input,163,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getMISSING_DATA_MANIPULATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPreprocessingTechniqueAccess().getMISSING_DATA_MANIPULATIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9064:3: (enumLiteral_4= 'VECTORIZATION' )
                    {
                    // InternalRsDsl.g:9064:3: (enumLiteral_4= 'VECTORIZATION' )
                    // InternalRsDsl.g:9065:4: enumLiteral_4= 'VECTORIZATION'
                    {
                    enumLiteral_4=(Token)match(input,164,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getVECTORIZATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPreprocessingTechniqueAccess().getVECTORIZATIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9072:3: (enumLiteral_5= 'FEATURE_SCALING' )
                    {
                    // InternalRsDsl.g:9072:3: (enumLiteral_5= 'FEATURE_SCALING' )
                    // InternalRsDsl.g:9073:4: enumLiteral_5= 'FEATURE_SCALING'
                    {
                    enumLiteral_5=(Token)match(input,165,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getFEATURE_SCALINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPreprocessingTechniqueAccess().getFEATURE_SCALINGEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:9080:3: (enumLiteral_6= 'TFIDF' )
                    {
                    // InternalRsDsl.g:9080:3: (enumLiteral_6= 'TFIDF' )
                    // InternalRsDsl.g:9081:4: enumLiteral_6= 'TFIDF'
                    {
                    enumLiteral_6=(Token)match(input,166,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getTFIDFEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPreprocessingTechniqueAccess().getTFIDFEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreprocessingTechnique"


    // $ANTLR start "ruleDatasetManipulationLibrary"
    // InternalRsDsl.g:9091:1: ruleDatasetManipulationLibrary returns [Enumerator current=null] : ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) ) ;
    public final Enumerator ruleDatasetManipulationLibrary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9097:2: ( ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) ) )
            // InternalRsDsl.g:9098:2: ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) )
            {
            // InternalRsDsl.g:9098:2: ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) )
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==167) ) {
                alt223=1;
            }
            else if ( (LA223_0==168) ) {
                alt223=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 0, input);

                throw nvae;
            }
            switch (alt223) {
                case 1 :
                    // InternalRsDsl.g:9099:3: (enumLiteral_0= 'PANDAS' )
                    {
                    // InternalRsDsl.g:9099:3: (enumLiteral_0= 'PANDAS' )
                    // InternalRsDsl.g:9100:4: enumLiteral_0= 'PANDAS'
                    {
                    enumLiteral_0=(Token)match(input,167,FOLLOW_2); 

                    				current = grammarAccess.getDatasetManipulationLibraryAccess().getPANDASEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatasetManipulationLibraryAccess().getPANDASEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9107:3: (enumLiteral_1= 'NUMPY' )
                    {
                    // InternalRsDsl.g:9107:3: (enumLiteral_1= 'NUMPY' )
                    // InternalRsDsl.g:9108:4: enumLiteral_1= 'NUMPY'
                    {
                    enumLiteral_1=(Token)match(input,168,FOLLOW_2); 

                    				current = grammarAccess.getDatasetManipulationLibraryAccess().getNUMPYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatasetManipulationLibraryAccess().getNUMPYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatasetManipulationLibrary"


    // $ANTLR start "ruleVariableType"
    // InternalRsDsl.g:9118:1: ruleVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) ) ;
    public final Enumerator ruleVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9124:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) ) )
            // InternalRsDsl.g:9125:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) )
            {
            // InternalRsDsl.g:9125:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) )
            int alt224=5;
            switch ( input.LA(1) ) {
            case 169:
                {
                alt224=1;
                }
                break;
            case 170:
                {
                alt224=2;
                }
                break;
            case 171:
                {
                alt224=3;
                }
                break;
            case 172:
                {
                alt224=4;
                }
                break;
            case 173:
                {
                alt224=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 224, 0, input);

                throw nvae;
            }

            switch (alt224) {
                case 1 :
                    // InternalRsDsl.g:9126:3: (enumLiteral_0= 'String' )
                    {
                    // InternalRsDsl.g:9126:3: (enumLiteral_0= 'String' )
                    // InternalRsDsl.g:9127:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,169,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariableTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9134:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalRsDsl.g:9134:3: (enumLiteral_1= 'Boolean' )
                    // InternalRsDsl.g:9135:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,170,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariableTypeAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9142:3: (enumLiteral_2= 'CategoricalData' )
                    {
                    // InternalRsDsl.g:9142:3: (enumLiteral_2= 'CategoricalData' )
                    // InternalRsDsl.g:9143:4: enumLiteral_2= 'CategoricalData'
                    {
                    enumLiteral_2=(Token)match(input,171,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getCategoricalDataEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVariableTypeAccess().getCategoricalDataEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9150:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalRsDsl.g:9150:3: (enumLiteral_3= 'Integer' )
                    // InternalRsDsl.g:9151:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,172,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVariableTypeAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9158:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalRsDsl.g:9158:3: (enumLiteral_4= 'Float' )
                    // InternalRsDsl.g:9159:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,173,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVariableTypeAccess().getFloatEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "ruleWebInterfaceLibrary"
    // InternalRsDsl.g:9169:1: ruleWebInterfaceLibrary returns [Enumerator current=null] : ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) ) ;
    public final Enumerator ruleWebInterfaceLibrary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9175:2: ( ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) ) )
            // InternalRsDsl.g:9176:2: ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) )
            {
            // InternalRsDsl.g:9176:2: ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) )
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==174) ) {
                alt225=1;
            }
            else if ( (LA225_0==175) ) {
                alt225=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 225, 0, input);

                throw nvae;
            }
            switch (alt225) {
                case 1 :
                    // InternalRsDsl.g:9177:3: (enumLiteral_0= 'FLASK' )
                    {
                    // InternalRsDsl.g:9177:3: (enumLiteral_0= 'FLASK' )
                    // InternalRsDsl.g:9178:4: enumLiteral_0= 'FLASK'
                    {
                    enumLiteral_0=(Token)match(input,174,FOLLOW_2); 

                    				current = grammarAccess.getWebInterfaceLibraryAccess().getFLASKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWebInterfaceLibraryAccess().getFLASKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9185:3: (enumLiteral_1= 'SPRING' )
                    {
                    // InternalRsDsl.g:9185:3: (enumLiteral_1= 'SPRING' )
                    // InternalRsDsl.g:9186:4: enumLiteral_1= 'SPRING'
                    {
                    enumLiteral_1=(Token)match(input,175,FOLLOW_2); 

                    				current = grammarAccess.getWebInterfaceLibraryAccess().getSPRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWebInterfaceLibraryAccess().getSPRINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebInterfaceLibrary"


    // $ANTLR start "ruleRecommendationUsageType"
    // InternalRsDsl.g:9196:1: ruleRecommendationUsageType returns [Enumerator current=null] : ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) ) ;
    public final Enumerator ruleRecommendationUsageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9202:2: ( ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) ) )
            // InternalRsDsl.g:9203:2: ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) )
            {
            // InternalRsDsl.g:9203:2: ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) )
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==176) ) {
                alt226=1;
            }
            else if ( (LA226_0==177) ) {
                alt226=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 0, input);

                throw nvae;
            }
            switch (alt226) {
                case 1 :
                    // InternalRsDsl.g:9204:3: (enumLiteral_0= 'Transformative' )
                    {
                    // InternalRsDsl.g:9204:3: (enumLiteral_0= 'Transformative' )
                    // InternalRsDsl.g:9205:4: enumLiteral_0= 'Transformative'
                    {
                    enumLiteral_0=(Token)match(input,176,FOLLOW_2); 

                    				current = grammarAccess.getRecommendationUsageTypeAccess().getTransformativeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRecommendationUsageTypeAccess().getTransformativeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9212:3: (enumLiteral_1= 'Visualization' )
                    {
                    // InternalRsDsl.g:9212:3: (enumLiteral_1= 'Visualization' )
                    // InternalRsDsl.g:9213:4: enumLiteral_1= 'Visualization'
                    {
                    enumLiteral_1=(Token)match(input,177,FOLLOW_2); 

                    				current = grammarAccess.getRecommendationUsageTypeAccess().getVisualizationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRecommendationUsageTypeAccess().getVisualizationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecommendationUsageType"


    // $ANTLR start "ruleUserEventType"
    // InternalRsDsl.g:9223:1: ruleUserEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) ) ;
    public final Enumerator ruleUserEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9229:2: ( ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) ) )
            // InternalRsDsl.g:9230:2: ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) )
            {
            // InternalRsDsl.g:9230:2: ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) )
            int alt227=2;
            int LA227_0 = input.LA(1);

            if ( (LA227_0==178) ) {
                alt227=1;
            }
            else if ( (LA227_0==179) ) {
                alt227=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 227, 0, input);

                throw nvae;
            }
            switch (alt227) {
                case 1 :
                    // InternalRsDsl.g:9231:3: (enumLiteral_0= 'Click' )
                    {
                    // InternalRsDsl.g:9231:3: (enumLiteral_0= 'Click' )
                    // InternalRsDsl.g:9232:4: enumLiteral_0= 'Click'
                    {
                    enumLiteral_0=(Token)match(input,178,FOLLOW_2); 

                    				current = grammarAccess.getUserEventTypeAccess().getClickEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserEventTypeAccess().getClickEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9239:3: (enumLiteral_1= 'Selection' )
                    {
                    // InternalRsDsl.g:9239:3: (enumLiteral_1= 'Selection' )
                    // InternalRsDsl.g:9240:4: enumLiteral_1= 'Selection'
                    {
                    enumLiteral_1=(Token)match(input,179,FOLLOW_2); 

                    				current = grammarAccess.getUserEventTypeAccess().getSelectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUserEventTypeAccess().getSelectionEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserEventType"


    // $ANTLR start "ruleRawFormat"
    // InternalRsDsl.g:9250:1: ruleRawFormat returns [Enumerator current=null] : (enumLiteral_0= 'CSV' ) ;
    public final Enumerator ruleRawFormat() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9256:2: ( (enumLiteral_0= 'CSV' ) )
            // InternalRsDsl.g:9257:2: (enumLiteral_0= 'CSV' )
            {
            // InternalRsDsl.g:9257:2: (enumLiteral_0= 'CSV' )
            // InternalRsDsl.g:9258:3: enumLiteral_0= 'CSV'
            {
            enumLiteral_0=(Token)match(input,180,FOLLOW_2); 

            			current = grammarAccess.getRawFormatAccess().getCSVEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getRawFormatAccess().getCSVEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRawFormat"


    // $ANTLR start "ruleMetric"
    // InternalRsDsl.g:9267:1: ruleMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) ) ;
    public final Enumerator ruleMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9273:2: ( ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) ) )
            // InternalRsDsl.g:9274:2: ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) )
            {
            // InternalRsDsl.g:9274:2: ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) )
            int alt228=10;
            switch ( input.LA(1) ) {
            case 181:
                {
                alt228=1;
                }
                break;
            case 182:
                {
                alt228=2;
                }
                break;
            case 183:
                {
                alt228=3;
                }
                break;
            case 184:
                {
                alt228=4;
                }
                break;
            case 185:
                {
                alt228=5;
                }
                break;
            case 186:
                {
                alt228=6;
                }
                break;
            case 187:
                {
                alt228=7;
                }
                break;
            case 188:
                {
                alt228=8;
                }
                break;
            case 189:
                {
                alt228=9;
                }
                break;
            case 190:
                {
                alt228=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 228, 0, input);

                throw nvae;
            }

            switch (alt228) {
                case 1 :
                    // InternalRsDsl.g:9275:3: (enumLiteral_0= 'PRECISION' )
                    {
                    // InternalRsDsl.g:9275:3: (enumLiteral_0= 'PRECISION' )
                    // InternalRsDsl.g:9276:4: enumLiteral_0= 'PRECISION'
                    {
                    enumLiteral_0=(Token)match(input,181,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getPRECISIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricAccess().getPRECISIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9283:3: (enumLiteral_1= 'RECALL' )
                    {
                    // InternalRsDsl.g:9283:3: (enumLiteral_1= 'RECALL' )
                    // InternalRsDsl.g:9284:4: enumLiteral_1= 'RECALL'
                    {
                    enumLiteral_1=(Token)match(input,182,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getRECALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricAccess().getRECALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9291:3: (enumLiteral_2= 'F1_MEASURE' )
                    {
                    // InternalRsDsl.g:9291:3: (enumLiteral_2= 'F1_MEASURE' )
                    // InternalRsDsl.g:9292:4: enumLiteral_2= 'F1_MEASURE'
                    {
                    enumLiteral_2=(Token)match(input,183,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getF1_MEASUREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMetricAccess().getF1_MEASUREEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9299:3: (enumLiteral_3= 'CATALOG_COVERAGE' )
                    {
                    // InternalRsDsl.g:9299:3: (enumLiteral_3= 'CATALOG_COVERAGE' )
                    // InternalRsDsl.g:9300:4: enumLiteral_3= 'CATALOG_COVERAGE'
                    {
                    enumLiteral_3=(Token)match(input,184,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getCATALOG_COVERAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMetricAccess().getCATALOG_COVERAGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9307:3: (enumLiteral_4= 'NOVELTY' )
                    {
                    // InternalRsDsl.g:9307:3: (enumLiteral_4= 'NOVELTY' )
                    // InternalRsDsl.g:9308:4: enumLiteral_4= 'NOVELTY'
                    {
                    enumLiteral_4=(Token)match(input,185,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getNOVELTYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMetricAccess().getNOVELTYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9315:3: (enumLiteral_5= 'SALE_DIVERSITY' )
                    {
                    // InternalRsDsl.g:9315:3: (enumLiteral_5= 'SALE_DIVERSITY' )
                    // InternalRsDsl.g:9316:4: enumLiteral_5= 'SALE_DIVERSITY'
                    {
                    enumLiteral_5=(Token)match(input,186,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getSALE_DIVERSITYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMetricAccess().getSALE_DIVERSITYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:9323:3: (enumLiteral_6= 'NDCG' )
                    {
                    // InternalRsDsl.g:9323:3: (enumLiteral_6= 'NDCG' )
                    // InternalRsDsl.g:9324:4: enumLiteral_6= 'NDCG'
                    {
                    enumLiteral_6=(Token)match(input,187,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getNDCGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMetricAccess().getNDCGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRsDsl.g:9331:3: (enumLiteral_7= 'ITEM_COVERAGE' )
                    {
                    // InternalRsDsl.g:9331:3: (enumLiteral_7= 'ITEM_COVERAGE' )
                    // InternalRsDsl.g:9332:4: enumLiteral_7= 'ITEM_COVERAGE'
                    {
                    enumLiteral_7=(Token)match(input,188,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getITEM_COVERAGEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMetricAccess().getITEM_COVERAGEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRsDsl.g:9339:3: (enumLiteral_8= 'EPC' )
                    {
                    // InternalRsDsl.g:9339:3: (enumLiteral_8= 'EPC' )
                    // InternalRsDsl.g:9340:4: enumLiteral_8= 'EPC'
                    {
                    enumLiteral_8=(Token)match(input,189,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getEPCEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMetricAccess().getEPCEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRsDsl.g:9347:3: (enumLiteral_9= 'GINI' )
                    {
                    // InternalRsDsl.g:9347:3: (enumLiteral_9= 'GINI' )
                    // InternalRsDsl.g:9348:4: enumLiteral_9= 'GINI'
                    {
                    enumLiteral_9=(Token)match(input,190,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getGINIEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMetricAccess().getGINIEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "ruleUserStudyType"
    // InternalRsDsl.g:9358:1: ruleUserStudyType returns [Enumerator current=null] : ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) ) ;
    public final Enumerator ruleUserStudyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9364:2: ( ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) ) )
            // InternalRsDsl.g:9365:2: ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) )
            {
            // InternalRsDsl.g:9365:2: ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) )
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==191) ) {
                alt229=1;
            }
            else if ( (LA229_0==192) ) {
                alt229=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 0, input);

                throw nvae;
            }
            switch (alt229) {
                case 1 :
                    // InternalRsDsl.g:9366:3: (enumLiteral_0= 'FIELD_STUDIES' )
                    {
                    // InternalRsDsl.g:9366:3: (enumLiteral_0= 'FIELD_STUDIES' )
                    // InternalRsDsl.g:9367:4: enumLiteral_0= 'FIELD_STUDIES'
                    {
                    enumLiteral_0=(Token)match(input,191,FOLLOW_2); 

                    				current = grammarAccess.getUserStudyTypeAccess().getFIELD_STUDIESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserStudyTypeAccess().getFIELD_STUDIESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9374:3: (enumLiteral_1= 'CONTROLLED_EXPERIMENT' )
                    {
                    // InternalRsDsl.g:9374:3: (enumLiteral_1= 'CONTROLLED_EXPERIMENT' )
                    // InternalRsDsl.g:9375:4: enumLiteral_1= 'CONTROLLED_EXPERIMENT'
                    {
                    enumLiteral_1=(Token)match(input,192,FOLLOW_2); 

                    				current = grammarAccess.getUserStudyTypeAccess().getCONTROLLED_EXPERIMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUserStudyTypeAccess().getCONTROLLED_EXPERIMENTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserStudyType"


    // $ANTLR start "ruleUserStudyAnalysis"
    // InternalRsDsl.g:9385:1: ruleUserStudyAnalysis returns [Enumerator current=null] : ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) ) ;
    public final Enumerator ruleUserStudyAnalysis() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9391:2: ( ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) ) )
            // InternalRsDsl.g:9392:2: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) )
            {
            // InternalRsDsl.g:9392:2: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) )
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==193) ) {
                alt230=1;
            }
            else if ( (LA230_0==194) ) {
                alt230=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 230, 0, input);

                throw nvae;
            }
            switch (alt230) {
                case 1 :
                    // InternalRsDsl.g:9393:3: (enumLiteral_0= 'QUALITATIVE' )
                    {
                    // InternalRsDsl.g:9393:3: (enumLiteral_0= 'QUALITATIVE' )
                    // InternalRsDsl.g:9394:4: enumLiteral_0= 'QUALITATIVE'
                    {
                    enumLiteral_0=(Token)match(input,193,FOLLOW_2); 

                    				current = grammarAccess.getUserStudyAnalysisAccess().getQUALITATIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserStudyAnalysisAccess().getQUALITATIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9401:3: (enumLiteral_1= 'QUANTITATIVE' )
                    {
                    // InternalRsDsl.g:9401:3: (enumLiteral_1= 'QUANTITATIVE' )
                    // InternalRsDsl.g:9402:4: enumLiteral_1= 'QUANTITATIVE'
                    {
                    enumLiteral_1=(Token)match(input,194,FOLLOW_2); 

                    				current = grammarAccess.getUserStudyAnalysisAccess().getQUANTITATIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUserStudyAnalysisAccess().getQUANTITATIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserStudyAnalysis"


    // $ANTLR start "ruleValidationLibrary"
    // InternalRsDsl.g:9412:1: ruleValidationLibrary returns [Enumerator current=null] : ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) ) ;
    public final Enumerator ruleValidationLibrary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9418:2: ( ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) ) )
            // InternalRsDsl.g:9419:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) )
            {
            // InternalRsDsl.g:9419:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) )
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==195) ) {
                alt231=1;
            }
            else if ( (LA231_0==196) ) {
                alt231=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 231, 0, input);

                throw nvae;
            }
            switch (alt231) {
                case 1 :
                    // InternalRsDsl.g:9420:3: (enumLiteral_0= 'SKLEARN' )
                    {
                    // InternalRsDsl.g:9420:3: (enumLiteral_0= 'SKLEARN' )
                    // InternalRsDsl.g:9421:4: enumLiteral_0= 'SKLEARN'
                    {
                    enumLiteral_0=(Token)match(input,195,FOLLOW_2); 

                    				current = grammarAccess.getValidationLibraryAccess().getSKLEARNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationLibraryAccess().getSKLEARNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9428:3: (enumLiteral_1= 'SURPRISE' )
                    {
                    // InternalRsDsl.g:9428:3: (enumLiteral_1= 'SURPRISE' )
                    // InternalRsDsl.g:9429:4: enumLiteral_1= 'SURPRISE'
                    {
                    enumLiteral_1=(Token)match(input,196,FOLLOW_2); 

                    				current = grammarAccess.getValidationLibraryAccess().getSURPRISEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidationLibraryAccess().getSURPRISEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationLibrary"


    // $ANTLR start "rulePyLibType"
    // InternalRsDsl.g:9439:1: rulePyLibType returns [Enumerator current=null] : ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) ) ;
    public final Enumerator rulePyLibType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9445:2: ( ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) ) )
            // InternalRsDsl.g:9446:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) )
            {
            // InternalRsDsl.g:9446:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) )
            int alt232=5;
            switch ( input.LA(1) ) {
            case 195:
                {
                alt232=1;
                }
                break;
            case 196:
                {
                alt232=2;
                }
                break;
            case 197:
                {
                alt232=3;
                }
                break;
            case 198:
                {
                alt232=4;
                }
                break;
            case 199:
                {
                alt232=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 232, 0, input);

                throw nvae;
            }

            switch (alt232) {
                case 1 :
                    // InternalRsDsl.g:9447:3: (enumLiteral_0= 'SKLEARN' )
                    {
                    // InternalRsDsl.g:9447:3: (enumLiteral_0= 'SKLEARN' )
                    // InternalRsDsl.g:9448:4: enumLiteral_0= 'SKLEARN'
                    {
                    enumLiteral_0=(Token)match(input,195,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getSKLEARNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPyLibTypeAccess().getSKLEARNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9455:3: (enumLiteral_1= 'SURPRISE' )
                    {
                    // InternalRsDsl.g:9455:3: (enumLiteral_1= 'SURPRISE' )
                    // InternalRsDsl.g:9456:4: enumLiteral_1= 'SURPRISE'
                    {
                    enumLiteral_1=(Token)match(input,196,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getSURPRISEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPyLibTypeAccess().getSURPRISEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9463:3: (enumLiteral_2= 'TENSOR_FLOW' )
                    {
                    // InternalRsDsl.g:9463:3: (enumLiteral_2= 'TENSOR_FLOW' )
                    // InternalRsDsl.g:9464:4: enumLiteral_2= 'TENSOR_FLOW'
                    {
                    enumLiteral_2=(Token)match(input,197,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getTENSOR_FLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPyLibTypeAccess().getTENSOR_FLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9471:3: (enumLiteral_3= 'PYTORCH' )
                    {
                    // InternalRsDsl.g:9471:3: (enumLiteral_3= 'PYTORCH' )
                    // InternalRsDsl.g:9472:4: enumLiteral_3= 'PYTORCH'
                    {
                    enumLiteral_3=(Token)match(input,198,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getPYTORCHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPyLibTypeAccess().getPYTORCHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9479:3: (enumLiteral_4= 'ELLIOT' )
                    {
                    // InternalRsDsl.g:9479:3: (enumLiteral_4= 'ELLIOT' )
                    // InternalRsDsl.g:9480:4: enumLiteral_4= 'ELLIOT'
                    {
                    enumLiteral_4=(Token)match(input,199,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getELLIOTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPyLibTypeAccess().getELLIOTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePyLibType"


    // $ANTLR start "ruleFilteringRSAlgorithm"
    // InternalRsDsl.g:9490:1: ruleFilteringRSAlgorithm returns [Enumerator current=null] : ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) ) ;
    public final Enumerator ruleFilteringRSAlgorithm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9496:2: ( ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) ) )
            // InternalRsDsl.g:9497:2: ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) )
            {
            // InternalRsDsl.g:9497:2: ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) )
            int alt233=6;
            switch ( input.LA(1) ) {
            case 200:
                {
                alt233=1;
                }
                break;
            case 201:
                {
                alt233=2;
                }
                break;
            case 202:
                {
                alt233=3;
                }
                break;
            case 203:
                {
                alt233=4;
                }
                break;
            case 204:
                {
                alt233=5;
                }
                break;
            case 205:
                {
                alt233=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 233, 0, input);

                throw nvae;
            }

            switch (alt233) {
                case 1 :
                    // InternalRsDsl.g:9498:3: (enumLiteral_0= 'CONTENT_BASED' )
                    {
                    // InternalRsDsl.g:9498:3: (enumLiteral_0= 'CONTENT_BASED' )
                    // InternalRsDsl.g:9499:4: enumLiteral_0= 'CONTENT_BASED'
                    {
                    enumLiteral_0=(Token)match(input,200,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getCONTENT_BASEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFilteringRSAlgorithmAccess().getCONTENT_BASEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9506:3: (enumLiteral_1= 'DEMOGRAPHIC' )
                    {
                    // InternalRsDsl.g:9506:3: (enumLiteral_1= 'DEMOGRAPHIC' )
                    // InternalRsDsl.g:9507:4: enumLiteral_1= 'DEMOGRAPHIC'
                    {
                    enumLiteral_1=(Token)match(input,201,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getDEMOGRAPHICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFilteringRSAlgorithmAccess().getDEMOGRAPHICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9514:3: (enumLiteral_2= 'USER_BASED' )
                    {
                    // InternalRsDsl.g:9514:3: (enumLiteral_2= 'USER_BASED' )
                    // InternalRsDsl.g:9515:4: enumLiteral_2= 'USER_BASED'
                    {
                    enumLiteral_2=(Token)match(input,202,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getUSER_BASEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFilteringRSAlgorithmAccess().getUSER_BASEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9522:3: (enumLiteral_3= 'ITEM_BASED' )
                    {
                    // InternalRsDsl.g:9522:3: (enumLiteral_3= 'ITEM_BASED' )
                    // InternalRsDsl.g:9523:4: enumLiteral_3= 'ITEM_BASED'
                    {
                    enumLiteral_3=(Token)match(input,203,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getITEM_BASEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFilteringRSAlgorithmAccess().getITEM_BASEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9530:3: (enumLiteral_4= 'CONTEXT_AWARE' )
                    {
                    // InternalRsDsl.g:9530:3: (enumLiteral_4= 'CONTEXT_AWARE' )
                    // InternalRsDsl.g:9531:4: enumLiteral_4= 'CONTEXT_AWARE'
                    {
                    enumLiteral_4=(Token)match(input,204,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getCONTEXT_AWAREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFilteringRSAlgorithmAccess().getCONTEXT_AWAREEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9538:3: (enumLiteral_5= 'HYBRID' )
                    {
                    // InternalRsDsl.g:9538:3: (enumLiteral_5= 'HYBRID' )
                    // InternalRsDsl.g:9539:4: enumLiteral_5= 'HYBRID'
                    {
                    enumLiteral_5=(Token)match(input,205,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getHYBRIDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFilteringRSAlgorithmAccess().getHYBRIDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilteringRSAlgorithm"


    // $ANTLR start "ruleSimilarityFunction"
    // InternalRsDsl.g:9549:1: ruleSimilarityFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) ) ;
    public final Enumerator ruleSimilarityFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9555:2: ( ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) ) )
            // InternalRsDsl.g:9556:2: ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) )
            {
            // InternalRsDsl.g:9556:2: ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) )
            int alt234=8;
            switch ( input.LA(1) ) {
            case 206:
                {
                alt234=1;
                }
                break;
            case 207:
                {
                alt234=2;
                }
                break;
            case 208:
                {
                alt234=3;
                }
                break;
            case 209:
                {
                alt234=4;
                }
                break;
            case 210:
                {
                alt234=5;
                }
                break;
            case 211:
                {
                alt234=6;
                }
                break;
            case 212:
                {
                alt234=7;
                }
                break;
            case 213:
                {
                alt234=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 234, 0, input);

                throw nvae;
            }

            switch (alt234) {
                case 1 :
                    // InternalRsDsl.g:9557:3: (enumLiteral_0= 'COSINE_SIMILARITY' )
                    {
                    // InternalRsDsl.g:9557:3: (enumLiteral_0= 'COSINE_SIMILARITY' )
                    // InternalRsDsl.g:9558:4: enumLiteral_0= 'COSINE_SIMILARITY'
                    {
                    enumLiteral_0=(Token)match(input,206,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getCOSINE_SIMILARITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimilarityFunctionAccess().getCOSINE_SIMILARITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9565:3: (enumLiteral_1= 'JACCARD_DISTANCE' )
                    {
                    // InternalRsDsl.g:9565:3: (enumLiteral_1= 'JACCARD_DISTANCE' )
                    // InternalRsDsl.g:9566:4: enumLiteral_1= 'JACCARD_DISTANCE'
                    {
                    enumLiteral_1=(Token)match(input,207,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getJACCARD_DISTANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimilarityFunctionAccess().getJACCARD_DISTANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9573:3: (enumLiteral_2= 'WORD_EMBEDDINGS' )
                    {
                    // InternalRsDsl.g:9573:3: (enumLiteral_2= 'WORD_EMBEDDINGS' )
                    // InternalRsDsl.g:9574:4: enumLiteral_2= 'WORD_EMBEDDINGS'
                    {
                    enumLiteral_2=(Token)match(input,208,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getWORD_EMBEDDINGSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimilarityFunctionAccess().getWORD_EMBEDDINGSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9581:3: (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' )
                    {
                    // InternalRsDsl.g:9581:3: (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' )
                    // InternalRsDsl.g:9582:4: enumLiteral_3= 'LEVENSHTEIN_DISTANCE'
                    {
                    enumLiteral_3=(Token)match(input,209,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getLEVENSHTEIN_DISTANCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimilarityFunctionAccess().getLEVENSHTEIN_DISTANCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9589:3: (enumLiteral_4= 'SVD' )
                    {
                    // InternalRsDsl.g:9589:3: (enumLiteral_4= 'SVD' )
                    // InternalRsDsl.g:9590:4: enumLiteral_4= 'SVD'
                    {
                    enumLiteral_4=(Token)match(input,210,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getSVDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimilarityFunctionAccess().getSVDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9597:3: (enumLiteral_5= 'GRAPH_BASED' )
                    {
                    // InternalRsDsl.g:9597:3: (enumLiteral_5= 'GRAPH_BASED' )
                    // InternalRsDsl.g:9598:4: enumLiteral_5= 'GRAPH_BASED'
                    {
                    enumLiteral_5=(Token)match(input,211,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getGRAPH_BASEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimilarityFunctionAccess().getGRAPH_BASEDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:9605:3: (enumLiteral_6= 'MSD' )
                    {
                    // InternalRsDsl.g:9605:3: (enumLiteral_6= 'MSD' )
                    // InternalRsDsl.g:9606:4: enumLiteral_6= 'MSD'
                    {
                    enumLiteral_6=(Token)match(input,212,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getMSDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimilarityFunctionAccess().getMSDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRsDsl.g:9613:3: (enumLiteral_7= 'EUCLIDEAN_DISTANCE' )
                    {
                    // InternalRsDsl.g:9613:3: (enumLiteral_7= 'EUCLIDEAN_DISTANCE' )
                    // InternalRsDsl.g:9614:4: enumLiteral_7= 'EUCLIDEAN_DISTANCE'
                    {
                    enumLiteral_7=(Token)match(input,213,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimilarityFunctionAccess().getEUCLIDEAN_DISTANCEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimilarityFunction"


    // $ANTLR start "ruleDataMiningRSAlgorithm"
    // InternalRsDsl.g:9624:1: ruleDataMiningRSAlgorithm returns [Enumerator current=null] : ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) ) ;
    public final Enumerator ruleDataMiningRSAlgorithm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9630:2: ( ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) ) )
            // InternalRsDsl.g:9631:2: ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) )
            {
            // InternalRsDsl.g:9631:2: ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) )
            int alt235=5;
            switch ( input.LA(1) ) {
            case 214:
                {
                alt235=1;
                }
                break;
            case 215:
                {
                alt235=2;
                }
                break;
            case 216:
                {
                alt235=3;
                }
                break;
            case 217:
                {
                alt235=4;
                }
                break;
            case 218:
                {
                alt235=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 235, 0, input);

                throw nvae;
            }

            switch (alt235) {
                case 1 :
                    // InternalRsDsl.g:9632:3: (enumLiteral_0= 'CLUSTERING' )
                    {
                    // InternalRsDsl.g:9632:3: (enumLiteral_0= 'CLUSTERING' )
                    // InternalRsDsl.g:9633:4: enumLiteral_0= 'CLUSTERING'
                    {
                    enumLiteral_0=(Token)match(input,214,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getCLUSTERINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataMiningRSAlgorithmAccess().getCLUSTERINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9640:3: (enumLiteral_1= 'FREQUENT_ITEM_SET' )
                    {
                    // InternalRsDsl.g:9640:3: (enumLiteral_1= 'FREQUENT_ITEM_SET' )
                    // InternalRsDsl.g:9641:4: enumLiteral_1= 'FREQUENT_ITEM_SET'
                    {
                    enumLiteral_1=(Token)match(input,215,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getFREQUENT_ITEM_SETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataMiningRSAlgorithmAccess().getFREQUENT_ITEM_SETEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9648:3: (enumLiteral_2= 'ASSOCIATION_RULE' )
                    {
                    // InternalRsDsl.g:9648:3: (enumLiteral_2= 'ASSOCIATION_RULE' )
                    // InternalRsDsl.g:9649:4: enumLiteral_2= 'ASSOCIATION_RULE'
                    {
                    enumLiteral_2=(Token)match(input,216,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getASSOCIATION_RULEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataMiningRSAlgorithmAccess().getASSOCIATION_RULEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9656:3: (enumLiteral_3= 'EVENT_STREAM' )
                    {
                    // InternalRsDsl.g:9656:3: (enumLiteral_3= 'EVENT_STREAM' )
                    // InternalRsDsl.g:9657:4: enumLiteral_3= 'EVENT_STREAM'
                    {
                    enumLiteral_3=(Token)match(input,217,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getEVENT_STREAMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataMiningRSAlgorithmAccess().getEVENT_STREAMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9664:3: (enumLiteral_4= 'TEXT_MINING' )
                    {
                    // InternalRsDsl.g:9664:3: (enumLiteral_4= 'TEXT_MINING' )
                    // InternalRsDsl.g:9665:4: enumLiteral_4= 'TEXT_MINING'
                    {
                    enumLiteral_4=(Token)match(input,218,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getTEXT_MININGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataMiningRSAlgorithmAccess().getTEXT_MININGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataMiningRSAlgorithm"


    // $ANTLR start "ruleSearchStrategy"
    // InternalRsDsl.g:9675:1: ruleSearchStrategy returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) ) ;
    public final Enumerator ruleSearchStrategy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9681:2: ( ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) ) )
            // InternalRsDsl.g:9682:2: ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) )
            {
            // InternalRsDsl.g:9682:2: ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) )
            int alt236=4;
            switch ( input.LA(1) ) {
            case 219:
                {
                alt236=1;
                }
                break;
            case 220:
                {
                alt236=2;
                }
                break;
            case 221:
                {
                alt236=3;
                }
                break;
            case 222:
                {
                alt236=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 236, 0, input);

                throw nvae;
            }

            switch (alt236) {
                case 1 :
                    // InternalRsDsl.g:9683:3: (enumLiteral_0= 'SIMULATED_ANNELING' )
                    {
                    // InternalRsDsl.g:9683:3: (enumLiteral_0= 'SIMULATED_ANNELING' )
                    // InternalRsDsl.g:9684:4: enumLiteral_0= 'SIMULATED_ANNELING'
                    {
                    enumLiteral_0=(Token)match(input,219,FOLLOW_2); 

                    				current = grammarAccess.getSearchStrategyAccess().getSIMULATED_ANNELINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSearchStrategyAccess().getSIMULATED_ANNELINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9691:3: (enumLiteral_1= 'HILL_CLIMBING' )
                    {
                    // InternalRsDsl.g:9691:3: (enumLiteral_1= 'HILL_CLIMBING' )
                    // InternalRsDsl.g:9692:4: enumLiteral_1= 'HILL_CLIMBING'
                    {
                    enumLiteral_1=(Token)match(input,220,FOLLOW_2); 

                    				current = grammarAccess.getSearchStrategyAccess().getHILL_CLIMBINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSearchStrategyAccess().getHILL_CLIMBINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9699:3: (enumLiteral_2= 'GRADIENT_DESCENT' )
                    {
                    // InternalRsDsl.g:9699:3: (enumLiteral_2= 'GRADIENT_DESCENT' )
                    // InternalRsDsl.g:9700:4: enumLiteral_2= 'GRADIENT_DESCENT'
                    {
                    enumLiteral_2=(Token)match(input,221,FOLLOW_2); 

                    				current = grammarAccess.getSearchStrategyAccess().getGRADIENT_DESCENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSearchStrategyAccess().getGRADIENT_DESCENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9707:3: (enumLiteral_3= 'EGGHOLDER_FUNCTION' )
                    {
                    // InternalRsDsl.g:9707:3: (enumLiteral_3= 'EGGHOLDER_FUNCTION' )
                    // InternalRsDsl.g:9708:4: enumLiteral_3= 'EGGHOLDER_FUNCTION'
                    {
                    enumLiteral_3=(Token)match(input,222,FOLLOW_2); 

                    				current = grammarAccess.getSearchStrategyAccess().getEGGHOLDER_FUNCTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSearchStrategyAccess().getEGGHOLDER_FUNCTIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSearchStrategy"


    // $ANTLR start "ruleMutationOperation"
    // InternalRsDsl.g:9718:1: ruleMutationOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) ) ;
    public final Enumerator ruleMutationOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9724:2: ( ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) ) )
            // InternalRsDsl.g:9725:2: ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) )
            {
            // InternalRsDsl.g:9725:2: ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) )
            int alt237=6;
            switch ( input.LA(1) ) {
            case 223:
                {
                alt237=1;
                }
                break;
            case 224:
                {
                alt237=2;
                }
                break;
            case 225:
                {
                alt237=3;
                }
                break;
            case 226:
                {
                alt237=4;
                }
                break;
            case 227:
                {
                alt237=5;
                }
                break;
            case 228:
                {
                alt237=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 237, 0, input);

                throw nvae;
            }

            switch (alt237) {
                case 1 :
                    // InternalRsDsl.g:9726:3: (enumLiteral_0= 'FIT_BIT' )
                    {
                    // InternalRsDsl.g:9726:3: (enumLiteral_0= 'FIT_BIT' )
                    // InternalRsDsl.g:9727:4: enumLiteral_0= 'FIT_BIT'
                    {
                    enumLiteral_0=(Token)match(input,223,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getFIT_BITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMutationOperationAccess().getFIT_BITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9734:3: (enumLiteral_1= 'CROSSOVER' )
                    {
                    // InternalRsDsl.g:9734:3: (enumLiteral_1= 'CROSSOVER' )
                    // InternalRsDsl.g:9735:4: enumLiteral_1= 'CROSSOVER'
                    {
                    enumLiteral_1=(Token)match(input,224,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getCROSSOVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMutationOperationAccess().getCROSSOVEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9742:3: (enumLiteral_2= 'SHRINK_MUTATION' )
                    {
                    // InternalRsDsl.g:9742:3: (enumLiteral_2= 'SHRINK_MUTATION' )
                    // InternalRsDsl.g:9743:4: enumLiteral_2= 'SHRINK_MUTATION'
                    {
                    enumLiteral_2=(Token)match(input,225,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getSHRINK_MUTATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMutationOperationAccess().getSHRINK_MUTATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9750:3: (enumLiteral_3= 'REPACE_MUTATION' )
                    {
                    // InternalRsDsl.g:9750:3: (enumLiteral_3= 'REPACE_MUTATION' )
                    // InternalRsDsl.g:9751:4: enumLiteral_3= 'REPACE_MUTATION'
                    {
                    enumLiteral_3=(Token)match(input,226,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getREPACE_MUTATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMutationOperationAccess().getREPACE_MUTATIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9758:3: (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' )
                    {
                    // InternalRsDsl.g:9758:3: (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' )
                    // InternalRsDsl.g:9759:4: enumLiteral_4= 'PARTIAL_HYPER_MUTATION'
                    {
                    enumLiteral_4=(Token)match(input,227,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getPARTIAL_HYPER_MUTATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMutationOperationAccess().getPARTIAL_HYPER_MUTATIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9766:3: (enumLiteral_5= 'DUPLICATION' )
                    {
                    // InternalRsDsl.g:9766:3: (enumLiteral_5= 'DUPLICATION' )
                    // InternalRsDsl.g:9767:4: enumLiteral_5= 'DUPLICATION'
                    {
                    enumLiteral_5=(Token)match(input,228,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getDUPLICATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMutationOperationAccess().getDUPLICATIONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMutationOperation"


    // $ANTLR start "ruleKernelType"
    // InternalRsDsl.g:9777:1: ruleKernelType returns [Enumerator current=null] : ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) ) ;
    public final Enumerator ruleKernelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9783:2: ( ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) ) )
            // InternalRsDsl.g:9784:2: ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) )
            {
            // InternalRsDsl.g:9784:2: ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) )
            int alt238=5;
            switch ( input.LA(1) ) {
            case 229:
                {
                alt238=1;
                }
                break;
            case 230:
                {
                alt238=2;
                }
                break;
            case 231:
                {
                alt238=3;
                }
                break;
            case 232:
                {
                alt238=4;
                }
                break;
            case 233:
                {
                alt238=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 238, 0, input);

                throw nvae;
            }

            switch (alt238) {
                case 1 :
                    // InternalRsDsl.g:9785:3: (enumLiteral_0= 'PRECOMPUTED' )
                    {
                    // InternalRsDsl.g:9785:3: (enumLiteral_0= 'PRECOMPUTED' )
                    // InternalRsDsl.g:9786:4: enumLiteral_0= 'PRECOMPUTED'
                    {
                    enumLiteral_0=(Token)match(input,229,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getPRECOMPUTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKernelTypeAccess().getPRECOMPUTEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9793:3: (enumLiteral_1= 'LINEAR' )
                    {
                    // InternalRsDsl.g:9793:3: (enumLiteral_1= 'LINEAR' )
                    // InternalRsDsl.g:9794:4: enumLiteral_1= 'LINEAR'
                    {
                    enumLiteral_1=(Token)match(input,230,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getLINEAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKernelTypeAccess().getLINEAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9801:3: (enumLiteral_2= 'POLY' )
                    {
                    // InternalRsDsl.g:9801:3: (enumLiteral_2= 'POLY' )
                    // InternalRsDsl.g:9802:4: enumLiteral_2= 'POLY'
                    {
                    enumLiteral_2=(Token)match(input,231,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getPOLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getKernelTypeAccess().getPOLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9809:3: (enumLiteral_3= 'RBF' )
                    {
                    // InternalRsDsl.g:9809:3: (enumLiteral_3= 'RBF' )
                    // InternalRsDsl.g:9810:4: enumLiteral_3= 'RBF'
                    {
                    enumLiteral_3=(Token)match(input,232,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getRBFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getKernelTypeAccess().getRBFEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9817:3: (enumLiteral_4= 'SIGMOID' )
                    {
                    // InternalRsDsl.g:9817:3: (enumLiteral_4= 'SIGMOID' )
                    // InternalRsDsl.g:9818:4: enumLiteral_4= 'SIGMOID'
                    {
                    enumLiteral_4=(Token)match(input,233,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getSIGMOIDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getKernelTypeAccess().getSIGMOIDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKernelType"


    // $ANTLR start "ruleSolverType"
    // InternalRsDsl.g:9828:1: ruleSolverType returns [Enumerator current=null] : ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) ) ;
    public final Enumerator ruleSolverType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9834:2: ( ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) ) )
            // InternalRsDsl.g:9835:2: ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) )
            {
            // InternalRsDsl.g:9835:2: ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) )
            int alt239=3;
            switch ( input.LA(1) ) {
            case 234:
                {
                alt239=1;
                }
                break;
            case 235:
                {
                alt239=2;
                }
                break;
            case 236:
                {
                alt239=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 239, 0, input);

                throw nvae;
            }

            switch (alt239) {
                case 1 :
                    // InternalRsDsl.g:9836:3: (enumLiteral_0= 'ADAM' )
                    {
                    // InternalRsDsl.g:9836:3: (enumLiteral_0= 'ADAM' )
                    // InternalRsDsl.g:9837:4: enumLiteral_0= 'ADAM'
                    {
                    enumLiteral_0=(Token)match(input,234,FOLLOW_2); 

                    				current = grammarAccess.getSolverTypeAccess().getADAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSolverTypeAccess().getADAMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9844:3: (enumLiteral_1= 'LBFGS' )
                    {
                    // InternalRsDsl.g:9844:3: (enumLiteral_1= 'LBFGS' )
                    // InternalRsDsl.g:9845:4: enumLiteral_1= 'LBFGS'
                    {
                    enumLiteral_1=(Token)match(input,235,FOLLOW_2); 

                    				current = grammarAccess.getSolverTypeAccess().getLBFGSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSolverTypeAccess().getLBFGSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9852:3: (enumLiteral_2= 'SGD' )
                    {
                    // InternalRsDsl.g:9852:3: (enumLiteral_2= 'SGD' )
                    // InternalRsDsl.g:9853:4: enumLiteral_2= 'SGD'
                    {
                    enumLiteral_2=(Token)match(input,236,FOLLOW_2); 

                    				current = grammarAccess.getSolverTypeAccess().getSGDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSolverTypeAccess().getSGDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolverType"


    // $ANTLR start "ruleActivationType"
    // InternalRsDsl.g:9863:1: ruleActivationType returns [Enumerator current=null] : ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) ) ;
    public final Enumerator ruleActivationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9869:2: ( ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) ) )
            // InternalRsDsl.g:9870:2: ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) )
            {
            // InternalRsDsl.g:9870:2: ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) )
            int alt240=3;
            switch ( input.LA(1) ) {
            case 237:
                {
                alt240=1;
                }
                break;
            case 233:
                {
                alt240=2;
                }
                break;
            case 238:
                {
                alt240=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 240, 0, input);

                throw nvae;
            }

            switch (alt240) {
                case 1 :
                    // InternalRsDsl.g:9871:3: (enumLiteral_0= 'RELU' )
                    {
                    // InternalRsDsl.g:9871:3: (enumLiteral_0= 'RELU' )
                    // InternalRsDsl.g:9872:4: enumLiteral_0= 'RELU'
                    {
                    enumLiteral_0=(Token)match(input,237,FOLLOW_2); 

                    				current = grammarAccess.getActivationTypeAccess().getRELUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivationTypeAccess().getRELUEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9879:3: (enumLiteral_1= 'SIGMOID' )
                    {
                    // InternalRsDsl.g:9879:3: (enumLiteral_1= 'SIGMOID' )
                    // InternalRsDsl.g:9880:4: enumLiteral_1= 'SIGMOID'
                    {
                    enumLiteral_1=(Token)match(input,233,FOLLOW_2); 

                    				current = grammarAccess.getActivationTypeAccess().getSIGMOIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivationTypeAccess().getSIGMOIDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9887:3: (enumLiteral_2= 'TANH' )
                    {
                    // InternalRsDsl.g:9887:3: (enumLiteral_2= 'TANH' )
                    // InternalRsDsl.g:9888:4: enumLiteral_2= 'TANH'
                    {
                    enumLiteral_2=(Token)match(input,238,FOLLOW_2); 

                    				current = grammarAccess.getActivationTypeAccess().getTANHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActivationTypeAccess().getTANHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivationType"


    // $ANTLR start "ruleFeedbackLibType"
    // InternalRsDsl.g:9898:1: ruleFeedbackLibType returns [Enumerator current=null] : ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) ) ;
    public final Enumerator ruleFeedbackLibType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9904:2: ( ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) ) )
            // InternalRsDsl.g:9905:2: ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) )
            {
            // InternalRsDsl.g:9905:2: ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) )
            int alt241=2;
            int LA241_0 = input.LA(1);

            if ( (LA241_0==239) ) {
                alt241=1;
            }
            else if ( (LA241_0==240) ) {
                alt241=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 241, 0, input);

                throw nvae;
            }
            switch (alt241) {
                case 1 :
                    // InternalRsDsl.g:9906:3: (enumLiteral_0= 'LIGHTFM' )
                    {
                    // InternalRsDsl.g:9906:3: (enumLiteral_0= 'LIGHTFM' )
                    // InternalRsDsl.g:9907:4: enumLiteral_0= 'LIGHTFM'
                    {
                    enumLiteral_0=(Token)match(input,239,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackLibTypeAccess().getLIGHTFMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackLibTypeAccess().getLIGHTFMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9914:3: (enumLiteral_1= 'LIGHTGBM' )
                    {
                    // InternalRsDsl.g:9914:3: (enumLiteral_1= 'LIGHTGBM' )
                    // InternalRsDsl.g:9915:4: enumLiteral_1= 'LIGHTGBM'
                    {
                    enumLiteral_1=(Token)match(input,240,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackLibTypeAccess().getLIGHTGBMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeedbackLibTypeAccess().getLIGHTGBMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeedbackLibType"


    // $ANTLR start "ruleRatingType"
    // InternalRsDsl.g:9925:1: ruleRatingType returns [Enumerator current=null] : ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) ) ;
    public final Enumerator ruleRatingType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9931:2: ( ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) ) )
            // InternalRsDsl.g:9932:2: ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) )
            {
            // InternalRsDsl.g:9932:2: ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) )
            int alt242=5;
            switch ( input.LA(1) ) {
            case 241:
                {
                alt242=1;
                }
                break;
            case 242:
                {
                alt242=2;
                }
                break;
            case 243:
                {
                alt242=3;
                }
                break;
            case 244:
                {
                alt242=4;
                }
                break;
            case 245:
                {
                alt242=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 242, 0, input);

                throw nvae;
            }

            switch (alt242) {
                case 1 :
                    // InternalRsDsl.g:9933:3: (enumLiteral_0= 'POSITIVE' )
                    {
                    // InternalRsDsl.g:9933:3: (enumLiteral_0= 'POSITIVE' )
                    // InternalRsDsl.g:9934:4: enumLiteral_0= 'POSITIVE'
                    {
                    enumLiteral_0=(Token)match(input,241,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getPOSITIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRatingTypeAccess().getPOSITIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9941:3: (enumLiteral_1= 'NEGATIVE' )
                    {
                    // InternalRsDsl.g:9941:3: (enumLiteral_1= 'NEGATIVE' )
                    // InternalRsDsl.g:9942:4: enumLiteral_1= 'NEGATIVE'
                    {
                    enumLiteral_1=(Token)match(input,242,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getNEGATIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRatingTypeAccess().getNEGATIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9949:3: (enumLiteral_2= 'NUMERICAL' )
                    {
                    // InternalRsDsl.g:9949:3: (enumLiteral_2= 'NUMERICAL' )
                    // InternalRsDsl.g:9950:4: enumLiteral_2= 'NUMERICAL'
                    {
                    enumLiteral_2=(Token)match(input,243,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getNUMERICALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRatingTypeAccess().getNUMERICALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9957:3: (enumLiteral_3= 'ORDINAL' )
                    {
                    // InternalRsDsl.g:9957:3: (enumLiteral_3= 'ORDINAL' )
                    // InternalRsDsl.g:9958:4: enumLiteral_3= 'ORDINAL'
                    {
                    enumLiteral_3=(Token)match(input,244,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getORDINALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRatingTypeAccess().getORDINALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9965:3: (enumLiteral_4= 'UNARY' )
                    {
                    // InternalRsDsl.g:9965:3: (enumLiteral_4= 'UNARY' )
                    // InternalRsDsl.g:9966:4: enumLiteral_4= 'UNARY'
                    {
                    enumLiteral_4=(Token)match(input,245,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getUNARYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRatingTypeAccess().getUNARYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRatingType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010C00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x000000000001B280L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0810000000000000L,0x0000000000037A25L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000D40000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x7FE0000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00001A4800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000009A000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000007F00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000C000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x9A10000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000002C000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000C000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0120000000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x6000000000040000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4000000000040000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000040000L,0x000000000000000CL});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000008L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000002040000L,0x0000000000000100L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000100L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000002040000L,0x0000000000000D00L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000D00L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000900L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000040000L,0x0000000000020100L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000040000L,0x0000000000380000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000040000L,0x0000000000300000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000040000L,0x0000000000200000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000040000L,0x0000000003800000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000040000L,0x0000000003000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000040000L,0x0000000010000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000040000L,0x0000000100380000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000040000L,0x0000000100300000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000040000L,0x0000000100200000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000040L,0x0000000400000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000080040000L,0x0000002000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000040000L,0x0000002000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000002040000L,0x0000018000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000040000L,0x0000018000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000040000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000040000L,0x0001800000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000040000L,0x0001000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000040000L,0x07E0000000100000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000040000L,0x07C0000000100000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000040000L,0x0780000000100000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000040000L,0x0700000000100000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000040000L,0x0400000000100000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000040000L,0xF620000000100000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000040000L,0xF600000000100000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000040000L,0xE600000000100000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000003FC000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000040000L,0xC600000000100000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000040000L,0x8600000000100000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000040000L,0x0620000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000040000L,0x0620000000100000L,0x0000000000000018L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000000018L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000040000L,0x0620000000100000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000000180L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001F80000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000040000L,0x07E0000000100000L,0x0000000000000400L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000040000L,0x07C0000000100000L,0x0000000000000400L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000040000L,0x0780000000100000L,0x0000000000000400L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000040000L,0x0700000000100000L,0x0000000000000400L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000000400L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000040000L,0x07E0000000100000L,0x0000000000008000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000040000L,0x07C0000000100000L,0x0000000000008000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000040000L,0x0780000000100000L,0x0000000000008000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000040000L,0x0700000000100000L,0x0000000000008000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000008000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000003E000000000L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000040000L,0x07E0000000100000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000040000L,0x07C0000000100000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000040000L,0x0780000000100000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000040000L,0x0700000000100000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000380000L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000000000040L,0x0000000400000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000300000L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000620000000000L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000040000L,0x0600000000100000L,0x0000000000200000L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000064000000L});
    public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000044000000L});
    public static final BitSet FOLLOW_168 = new BitSet(new long[]{0x0000000080040000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x003E000000000000L});

}