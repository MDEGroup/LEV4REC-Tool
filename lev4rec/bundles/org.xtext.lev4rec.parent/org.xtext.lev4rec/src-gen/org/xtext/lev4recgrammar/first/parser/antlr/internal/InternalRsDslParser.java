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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RSModel'", "'{'", "'dataset'", "':'", "'presentationLayer'", "'evaluation'", "'recommendationSystem'", "'feedback'", "'}'", "'Evaluation'", "'baselines'", "'['", "','", "']'", "'metrics'", "'validationTechnique'", "'FeedbackComponent'", "'library'", "'query'", "'expressedFeedback'", "'isMissingValueAllowed'", "'isMultiple'", "'Variable'", "'type'", "'dataSource'", "'preprocessing'", "'isBuiltIn'", "'UnsupervisedDataset'", "'datasetManipulationLibrary'", "'path'", "'indipendentVariables'", "'dataStructure'", "'SupervisedDataset'", "'dependatVariable'", "'Preprocessing'", "'preprocessigTechnique'", "'metadata'", "'CodeRepository'", "'CommunicationChannel'", "'BugTrackingSystem'", "'DependencyManager'", "'File'", "'sourcePath'", "'encoding'", "'Graph'", "'nodes'", "'('", "')'", "'relations'", "'Matrix'", "'columns'", "'Tree'", "'TextualContent'", "'rootPath'", "'contents'", "'ARFF'", "'variables'", "'VariableRelation'", "'source'", "'target'", "'ordered'", "'RecommendedItem'", "'outcame'", "'WebIService'", "'recommendations'", "'WebApplication'", "'port'", "'host'", "'IDEIntegration'", "'JupyterNotebook'", "'VSCodePlugin'", "'handler'", "'TraversableGraph'", "'RawOutcomes'", "'format'", "'RecommendationHandler'", "'webService'", "'context'", "'usage'", "'RecommendationUsage'", "'usageType'", "'recommendedItems'", "'guielements'", "'isProactiveSystem'", "'RecommendationContext'", "'userContext'", "'condition'", "'ProactiveHandler'", "'ReactiveHandler'", "'event'", "'GUIElement'", "'-'", "'UserStudy'", "'nOfRecommendations'", "'analysis'", "'CrossValidation'", "'numberOfFold'", "'groundTruthExtractor'", "'ContextValidation'", "'testContext'", "'RandomSplitting'", "'AutomatedValidation'", "'GroundTruthExtraction'", "'sizeGT'", "'splittingRules'", "'targetVariable'", "'RecommendationSetting'", "'key'", "'value'", "'MachineLearningBasedRS'", "'generator'", "'numEpochs'", "'learningRate'", "'miniBatchSize'", "'settings'", "'scope'", "'FilteringRS'", "'filteringRSAlgorithm'", "'similarityCalculator'", "'cutoff'", "'neighborhood'", "'DataMiningRS'", "'dataMiningRSAlgorithm'", "'CustomRecommender'", "'description'", "'requiredTools'", "'GeneticAlgorithm'", "'fitnessFunction'", "'searchStrategy'", "'mutationOperator'", "'DeepNN'", "'numHiddenLayer'", "'ConvolutionalNN'", "'Bayesian'", "'RecurrentNN'", "'SVM'", "'kernel'", "'DecisionTree'", "'FeedForwardNN'", "'solver'", "'alpha'", "'activationFunction'", "'randomState'", "'.'", "'E'", "'e'", "'ImplicitFeedback'", "'item'", "'HybridFeedback'", "'AdditiveFeedback'", "'numOfInsertion'", "'recommender'", "'Rating'", "'DUPLICATES_REMOVAL'", "'NLP'", "'NORMALIZATION'", "'MISSING_DATA_MANIPULATION'", "'VECTORIZATION'", "'FEATURE_SCALING'", "'TFIDF'", "'PANDAS'", "'NUMPY'", "'String'", "'Boolean'", "'CategoricalData'", "'Integer'", "'Float'", "'FLASK'", "'SPRING'", "'Transformative'", "'Visualization'", "'Click'", "'Selection'", "'CSV'", "'PRECISION'", "'RECALL'", "'F1_MEASURE'", "'CATALOG_COVERAGE'", "'NOVELTY'", "'SALE_DIVERSITY'", "'NDCG'", "'ITEM_COVERAGE'", "'EPC'", "'GINI'", "'FIELD_STUDIES'", "'CONTROLLED_EXPERIMENT'", "'QUALITATIVE'", "'QUANTITATIVE'", "'SKLEARN'", "'SURPRISE'", "'TENSOR_FLOW'", "'PYTORCH'", "'ELLIOT'", "'CONTENT_BASED'", "'DEMOGRAPHIC'", "'USER_BASED'", "'ITEM_BASED'", "'CONTEXT_AWARE'", "'HYBRID'", "'COSINE_SIMILARITY'", "'JACCARD_DISTANCE'", "'WORD_EMBEDDINGS'", "'LEVENSHTEIN_DISTANCE'", "'SVD'", "'GRAPH_BASED'", "'MSD'", "'EUCLIDEAN_DISTANCE'", "'CLUSTERING'", "'FREQUENT_ITEM_SET'", "'ASSOCIATION_RULE'", "'EVENT_STREAM'", "'TEXT_MINING'", "'SIMULATED_ANNELING'", "'HILL_CLIMBING'", "'GRADIENT_DESCENT'", "'EGGHOLDER_FUNCTION'", "'FIT_BIT'", "'CROSSOVER'", "'SHRINK_MUTATION'", "'REPACE_MUTATION'", "'PARTIAL_HYPER_MUTATION'", "'DUPLICATION'", "'PRECOMPUTED'", "'LINEAR'", "'POLY'", "'RBF'", "'SIGMOID'", "'ADAM'", "'LBFGS'", "'SGD'", "'RELU'", "'TANH'", "'LIGHTFM'", "'LIGHTGBM'", "'POSITIVE'", "'NEGATIVE'", "'NUMERICAL'", "'ORDINAL'", "'UNARY'"
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
    public static final int T__247=247;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__246=246;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__249=249;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__248=248;
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
    // InternalRsDsl.g:72:1: ruleRSModel returns [EObject current=null] : (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= ruleDataset ) ) )? (otherlv_6= 'presentationLayer' otherlv_7= ':' ( (lv_presentationLayer_8_0= rulePresentationLayer ) ) )? (otherlv_9= 'evaluation' otherlv_10= ':' ( (lv_evaluation_11_0= ruleEvaluation ) ) )? otherlv_12= 'recommendationSystem' otherlv_13= ':' ( (lv_recommendationSystem_14_0= ruleRecommendationSystem ) ) (otherlv_15= 'feedback' otherlv_16= ':' ( (lv_feedback_17_0= ruleFeedbackComponent ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleRSModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dataset_5_0 = null;

        EObject lv_presentationLayer_8_0 = null;

        EObject lv_evaluation_11_0 = null;

        EObject lv_recommendationSystem_14_0 = null;

        EObject lv_feedback_17_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:78:2: ( (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= ruleDataset ) ) )? (otherlv_6= 'presentationLayer' otherlv_7= ':' ( (lv_presentationLayer_8_0= rulePresentationLayer ) ) )? (otherlv_9= 'evaluation' otherlv_10= ':' ( (lv_evaluation_11_0= ruleEvaluation ) ) )? otherlv_12= 'recommendationSystem' otherlv_13= ':' ( (lv_recommendationSystem_14_0= ruleRecommendationSystem ) ) (otherlv_15= 'feedback' otherlv_16= ':' ( (lv_feedback_17_0= ruleFeedbackComponent ) ) )? otherlv_18= '}' ) )
            // InternalRsDsl.g:79:2: (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= ruleDataset ) ) )? (otherlv_6= 'presentationLayer' otherlv_7= ':' ( (lv_presentationLayer_8_0= rulePresentationLayer ) ) )? (otherlv_9= 'evaluation' otherlv_10= ':' ( (lv_evaluation_11_0= ruleEvaluation ) ) )? otherlv_12= 'recommendationSystem' otherlv_13= ':' ( (lv_recommendationSystem_14_0= ruleRecommendationSystem ) ) (otherlv_15= 'feedback' otherlv_16= ':' ( (lv_feedback_17_0= ruleFeedbackComponent ) ) )? otherlv_18= '}' )
            {
            // InternalRsDsl.g:79:2: (otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= ruleDataset ) ) )? (otherlv_6= 'presentationLayer' otherlv_7= ':' ( (lv_presentationLayer_8_0= rulePresentationLayer ) ) )? (otherlv_9= 'evaluation' otherlv_10= ':' ( (lv_evaluation_11_0= ruleEvaluation ) ) )? otherlv_12= 'recommendationSystem' otherlv_13= ':' ( (lv_recommendationSystem_14_0= ruleRecommendationSystem ) ) (otherlv_15= 'feedback' otherlv_16= ':' ( (lv_feedback_17_0= ruleFeedbackComponent ) ) )? otherlv_18= '}' )
            // InternalRsDsl.g:80:3: otherlv_0= 'RSModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= ruleDataset ) ) )? (otherlv_6= 'presentationLayer' otherlv_7= ':' ( (lv_presentationLayer_8_0= rulePresentationLayer ) ) )? (otherlv_9= 'evaluation' otherlv_10= ':' ( (lv_evaluation_11_0= ruleEvaluation ) ) )? otherlv_12= 'recommendationSystem' otherlv_13= ':' ( (lv_recommendationSystem_14_0= ruleRecommendationSystem ) ) (otherlv_15= 'feedback' otherlv_16= ':' ( (lv_feedback_17_0= ruleFeedbackComponent ) ) )? otherlv_18= '}'
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
            		
            // InternalRsDsl.g:107:3: (otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= ruleDataset ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRsDsl.g:108:4: otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= ruleDataset ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRSModelAccess().getDatasetKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getRSModelAccess().getColonKeyword_3_1());
                    			
                    // InternalRsDsl.g:116:4: ( (lv_dataset_5_0= ruleDataset ) )
                    // InternalRsDsl.g:117:5: (lv_dataset_5_0= ruleDataset )
                    {
                    // InternalRsDsl.g:117:5: (lv_dataset_5_0= ruleDataset )
                    // InternalRsDsl.g:118:6: lv_dataset_5_0= ruleDataset
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getDatasetDatasetParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_dataset_5_0=ruleDataset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"dataset",
                    							lv_dataset_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Dataset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:136:3: (otherlv_6= 'presentationLayer' otherlv_7= ':' ( (lv_presentationLayer_8_0= rulePresentationLayer ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRsDsl.g:137:4: otherlv_6= 'presentationLayer' otherlv_7= ':' ( (lv_presentationLayer_8_0= rulePresentationLayer ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getRSModelAccess().getPresentationLayerKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getRSModelAccess().getColonKeyword_4_1());
                    			
                    // InternalRsDsl.g:145:4: ( (lv_presentationLayer_8_0= rulePresentationLayer ) )
                    // InternalRsDsl.g:146:5: (lv_presentationLayer_8_0= rulePresentationLayer )
                    {
                    // InternalRsDsl.g:146:5: (lv_presentationLayer_8_0= rulePresentationLayer )
                    // InternalRsDsl.g:147:6: lv_presentationLayer_8_0= rulePresentationLayer
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getPresentationLayerPresentationLayerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_presentationLayer_8_0=rulePresentationLayer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"presentationLayer",
                    							lv_presentationLayer_8_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.PresentationLayer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:165:3: (otherlv_9= 'evaluation' otherlv_10= ':' ( (lv_evaluation_11_0= ruleEvaluation ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRsDsl.g:166:4: otherlv_9= 'evaluation' otherlv_10= ':' ( (lv_evaluation_11_0= ruleEvaluation ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRSModelAccess().getEvaluationKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getRSModelAccess().getColonKeyword_5_1());
                    			
                    // InternalRsDsl.g:174:4: ( (lv_evaluation_11_0= ruleEvaluation ) )
                    // InternalRsDsl.g:175:5: (lv_evaluation_11_0= ruleEvaluation )
                    {
                    // InternalRsDsl.g:175:5: (lv_evaluation_11_0= ruleEvaluation )
                    // InternalRsDsl.g:176:6: lv_evaluation_11_0= ruleEvaluation
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getEvaluationEvaluationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_evaluation_11_0=ruleEvaluation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"evaluation",
                    							lv_evaluation_11_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Evaluation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getRSModelAccess().getRecommendationSystemKeyword_6());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getRSModelAccess().getColonKeyword_7());
            		
            // InternalRsDsl.g:202:3: ( (lv_recommendationSystem_14_0= ruleRecommendationSystem ) )
            // InternalRsDsl.g:203:4: (lv_recommendationSystem_14_0= ruleRecommendationSystem )
            {
            // InternalRsDsl.g:203:4: (lv_recommendationSystem_14_0= ruleRecommendationSystem )
            // InternalRsDsl.g:204:5: lv_recommendationSystem_14_0= ruleRecommendationSystem
            {

            					newCompositeNode(grammarAccess.getRSModelAccess().getRecommendationSystemRecommendationSystemParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_recommendationSystem_14_0=ruleRecommendationSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRSModelRule());
            					}
            					set(
            						current,
            						"recommendationSystem",
            						lv_recommendationSystem_14_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.RecommendationSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:221:3: (otherlv_15= 'feedback' otherlv_16= ':' ( (lv_feedback_17_0= ruleFeedbackComponent ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRsDsl.g:222:4: otherlv_15= 'feedback' otherlv_16= ':' ( (lv_feedback_17_0= ruleFeedbackComponent ) )
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getRSModelAccess().getFeedbackKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getRSModelAccess().getColonKeyword_9_1());
                    			
                    // InternalRsDsl.g:230:4: ( (lv_feedback_17_0= ruleFeedbackComponent ) )
                    // InternalRsDsl.g:231:5: (lv_feedback_17_0= ruleFeedbackComponent )
                    {
                    // InternalRsDsl.g:231:5: (lv_feedback_17_0= ruleFeedbackComponent )
                    // InternalRsDsl.g:232:6: lv_feedback_17_0= ruleFeedbackComponent
                    {

                    						newCompositeNode(grammarAccess.getRSModelAccess().getFeedbackFeedbackComponentParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_feedback_17_0=ruleFeedbackComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRSModelRule());
                    						}
                    						set(
                    							current,
                    							"feedback",
                    							lv_feedback_17_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.FeedbackComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRSModelAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalRsDsl.g:258:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // InternalRsDsl.g:258:48: (iv_ruleDataset= ruleDataset EOF )
            // InternalRsDsl.g:259:2: iv_ruleDataset= ruleDataset EOF
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
    // InternalRsDsl.g:265:1: ruleDataset returns [EObject current=null] : (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        EObject this_UnsupervisedDataset_0 = null;

        EObject this_SupervisedDataset_1 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:271:2: ( (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset ) )
            // InternalRsDsl.g:272:2: (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset )
            {
            // InternalRsDsl.g:272:2: (this_UnsupervisedDataset_0= ruleUnsupervisedDataset | this_SupervisedDataset_1= ruleSupervisedDataset )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 37:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==43) ) {
                    alt5=2;
                }
                else if ( (LA5_1==38) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt5=1;
                }
                break;
            case 43:
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
                    // InternalRsDsl.g:273:3: this_UnsupervisedDataset_0= ruleUnsupervisedDataset
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
                    // InternalRsDsl.g:282:3: this_SupervisedDataset_1= ruleSupervisedDataset
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
    // InternalRsDsl.g:294:1: entryRulePresentationLayer returns [EObject current=null] : iv_rulePresentationLayer= rulePresentationLayer EOF ;
    public final EObject entryRulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentationLayer = null;


        try {
            // InternalRsDsl.g:294:58: (iv_rulePresentationLayer= rulePresentationLayer EOF )
            // InternalRsDsl.g:295:2: iv_rulePresentationLayer= rulePresentationLayer EOF
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
    // InternalRsDsl.g:301:1: rulePresentationLayer returns [EObject current=null] : (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes | this_JupyterNotebook_6= ruleJupyterNotebook ) ;
    public final EObject rulePresentationLayer() throws RecognitionException {
        EObject current = null;

        EObject this_WebIService_0 = null;

        EObject this_WebApplication_1 = null;

        EObject this_IDEIntegration_Impl_2 = null;

        EObject this_VSCodePlugin_3 = null;

        EObject this_TraversableGraph_4 = null;

        EObject this_RawOutcomes_5 = null;

        EObject this_JupyterNotebook_6 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:307:2: ( (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes | this_JupyterNotebook_6= ruleJupyterNotebook ) )
            // InternalRsDsl.g:308:2: (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes | this_JupyterNotebook_6= ruleJupyterNotebook )
            {
            // InternalRsDsl.g:308:2: (this_WebIService_0= ruleWebIService | this_WebApplication_1= ruleWebApplication | this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl | this_VSCodePlugin_3= ruleVSCodePlugin | this_TraversableGraph_4= ruleTraversableGraph | this_RawOutcomes_5= ruleRawOutcomes | this_JupyterNotebook_6= ruleJupyterNotebook )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt6=1;
                }
                break;
            case 76:
                {
                alt6=2;
                }
                break;
            case 79:
                {
                alt6=3;
                }
                break;
            case 81:
                {
                alt6=4;
                }
                break;
            case 83:
                {
                alt6=5;
                }
                break;
            case 84:
                {
                alt6=6;
                }
                break;
            case 80:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRsDsl.g:309:3: this_WebIService_0= ruleWebIService
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
                    // InternalRsDsl.g:318:3: this_WebApplication_1= ruleWebApplication
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
                    // InternalRsDsl.g:327:3: this_IDEIntegration_Impl_2= ruleIDEIntegration_Impl
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
                    // InternalRsDsl.g:336:3: this_VSCodePlugin_3= ruleVSCodePlugin
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
                    // InternalRsDsl.g:345:3: this_TraversableGraph_4= ruleTraversableGraph
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
                    // InternalRsDsl.g:354:3: this_RawOutcomes_5= ruleRawOutcomes
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getRawOutcomesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RawOutcomes_5=ruleRawOutcomes();

                    state._fsp--;


                    			current = this_RawOutcomes_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:363:3: this_JupyterNotebook_6= ruleJupyterNotebook
                    {

                    			newCompositeNode(grammarAccess.getPresentationLayerAccess().getJupyterNotebookParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_JupyterNotebook_6=ruleJupyterNotebook();

                    state._fsp--;


                    			current = this_JupyterNotebook_6;
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
    // InternalRsDsl.g:375:1: entryRuleRecommendationSystem returns [EObject current=null] : iv_ruleRecommendationSystem= ruleRecommendationSystem EOF ;
    public final EObject entryRuleRecommendationSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationSystem = null;


        try {
            // InternalRsDsl.g:375:61: (iv_ruleRecommendationSystem= ruleRecommendationSystem EOF )
            // InternalRsDsl.g:376:2: iv_ruleRecommendationSystem= ruleRecommendationSystem EOF
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
    // InternalRsDsl.g:382:1: ruleRecommendationSystem returns [EObject current=null] : (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN ) ;
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
            // InternalRsDsl.g:388:2: ( (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN ) )
            // InternalRsDsl.g:389:2: (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN )
            {
            // InternalRsDsl.g:389:2: (this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl | this_FilteringRS_1= ruleFilteringRS | this_DataMiningRS_2= ruleDataMiningRS | this_CustomRecommender_3= ruleCustomRecommender | this_GeneticAlgorithm_4= ruleGeneticAlgorithm | this_DeepNN_5= ruleDeepNN | this_ConvolutionalNN_6= ruleConvolutionalNN | this_Bayesian_7= ruleBayesian | this_RecurrentNN_8= ruleRecurrentNN | this_SVM_9= ruleSVM | this_DecisionTree_10= ruleDecisionTree | this_FeedForwardNN_11= ruleFeedForwardNN )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt7=1;
                }
                break;
            case 127:
                {
                alt7=2;
                }
                break;
            case 132:
                {
                alt7=3;
                }
                break;
            case 134:
                {
                alt7=4;
                }
                break;
            case 137:
                {
                alt7=5;
                }
                break;
            case 141:
                {
                alt7=6;
                }
                break;
            case 143:
                {
                alt7=7;
                }
                break;
            case 144:
                {
                alt7=8;
                }
                break;
            case 145:
                {
                alt7=9;
                }
                break;
            case 146:
                {
                alt7=10;
                }
                break;
            case 148:
                {
                alt7=11;
                }
                break;
            case 149:
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
                    // InternalRsDsl.g:390:3: this_MachineLearningBasedRS_Impl_0= ruleMachineLearningBasedRS_Impl
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
                    // InternalRsDsl.g:399:3: this_FilteringRS_1= ruleFilteringRS
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
                    // InternalRsDsl.g:408:3: this_DataMiningRS_2= ruleDataMiningRS
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
                    // InternalRsDsl.g:417:3: this_CustomRecommender_3= ruleCustomRecommender
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
                    // InternalRsDsl.g:426:3: this_GeneticAlgorithm_4= ruleGeneticAlgorithm
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
                    // InternalRsDsl.g:435:3: this_DeepNN_5= ruleDeepNN
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
                    // InternalRsDsl.g:444:3: this_ConvolutionalNN_6= ruleConvolutionalNN
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
                    // InternalRsDsl.g:453:3: this_Bayesian_7= ruleBayesian
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
                    // InternalRsDsl.g:462:3: this_RecurrentNN_8= ruleRecurrentNN
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
                    // InternalRsDsl.g:471:3: this_SVM_9= ruleSVM
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
                    // InternalRsDsl.g:480:3: this_DecisionTree_10= ruleDecisionTree
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
                    // InternalRsDsl.g:489:3: this_FeedForwardNN_11= ruleFeedForwardNN
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
    // InternalRsDsl.g:501:1: entryRuleValidationTechnique returns [EObject current=null] : iv_ruleValidationTechnique= ruleValidationTechnique EOF ;
    public final EObject entryRuleValidationTechnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationTechnique = null;


        try {
            // InternalRsDsl.g:501:60: (iv_ruleValidationTechnique= ruleValidationTechnique EOF )
            // InternalRsDsl.g:502:2: iv_ruleValidationTechnique= ruleValidationTechnique EOF
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
    // InternalRsDsl.g:508:1: ruleValidationTechnique returns [EObject current=null] : (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl ) ;
    public final EObject ruleValidationTechnique() throws RecognitionException {
        EObject current = null;

        EObject this_UserStudy_0 = null;

        EObject this_CrossValidation_1 = null;

        EObject this_ContextValidation_2 = null;

        EObject this_RandomSplitting_3 = null;

        EObject this_AutomatedValidation_Impl_4 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:514:2: ( (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl ) )
            // InternalRsDsl.g:515:2: (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl )
            {
            // InternalRsDsl.g:515:2: (this_UserStudy_0= ruleUserStudy | this_CrossValidation_1= ruleCrossValidation | this_ContextValidation_2= ruleContextValidation | this_RandomSplitting_3= ruleRandomSplitting | this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt8=1;
                }
                break;
            case 106:
                {
                alt8=2;
                }
                break;
            case 109:
                {
                alt8=3;
                }
                break;
            case 111:
                {
                alt8=4;
                }
                break;
            case 112:
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
                    // InternalRsDsl.g:516:3: this_UserStudy_0= ruleUserStudy
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
                    // InternalRsDsl.g:525:3: this_CrossValidation_1= ruleCrossValidation
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
                    // InternalRsDsl.g:534:3: this_ContextValidation_2= ruleContextValidation
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
                    // InternalRsDsl.g:543:3: this_RandomSplitting_3= ruleRandomSplitting
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
                    // InternalRsDsl.g:552:3: this_AutomatedValidation_Impl_4= ruleAutomatedValidation_Impl
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
    // InternalRsDsl.g:564:1: entryRuleFeedback returns [EObject current=null] : iv_ruleFeedback= ruleFeedback EOF ;
    public final EObject entryRuleFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedback = null;


        try {
            // InternalRsDsl.g:564:49: (iv_ruleFeedback= ruleFeedback EOF )
            // InternalRsDsl.g:565:2: iv_ruleFeedback= ruleFeedback EOF
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
    // InternalRsDsl.g:571:1: ruleFeedback returns [EObject current=null] : (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating ) ;
    public final EObject ruleFeedback() throws RecognitionException {
        EObject current = null;

        EObject this_ImplicitFeedback_0 = null;

        EObject this_HybridFeedback_1 = null;

        EObject this_AdditiveFeedback_2 = null;

        EObject this_Rating_3 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:577:2: ( (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating ) )
            // InternalRsDsl.g:578:2: (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating )
            {
            // InternalRsDsl.g:578:2: (this_ImplicitFeedback_0= ruleImplicitFeedback | this_HybridFeedback_1= ruleHybridFeedback | this_AdditiveFeedback_2= ruleAdditiveFeedback | this_Rating_3= ruleRating )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 157:
                {
                alt9=1;
                }
                break;
            case 159:
                {
                alt9=2;
                }
                break;
            case 160:
                {
                alt9=3;
                }
                break;
            case 163:
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
                    // InternalRsDsl.g:579:3: this_ImplicitFeedback_0= ruleImplicitFeedback
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
                    // InternalRsDsl.g:588:3: this_HybridFeedback_1= ruleHybridFeedback
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
                    // InternalRsDsl.g:597:3: this_AdditiveFeedback_2= ruleAdditiveFeedback
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
                    // InternalRsDsl.g:606:3: this_Rating_3= ruleRating
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
    // InternalRsDsl.g:618:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalRsDsl.g:618:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalRsDsl.g:619:2: iv_ruleDataSource= ruleDataSource EOF
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
    // InternalRsDsl.g:625:1: ruleDataSource returns [EObject current=null] : (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        EObject this_CodeRepository_0 = null;

        EObject this_CommunicationChannel_1 = null;

        EObject this_BugTrackingSystem_2 = null;

        EObject this_DependencyManager_3 = null;

        EObject this_File_4 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:631:2: ( (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile ) )
            // InternalRsDsl.g:632:2: (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile )
            {
            // InternalRsDsl.g:632:2: (this_CodeRepository_0= ruleCodeRepository | this_CommunicationChannel_1= ruleCommunicationChannel | this_BugTrackingSystem_2= ruleBugTrackingSystem | this_DependencyManager_3= ruleDependencyManager | this_File_4= ruleFile )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
                {
                alt10=1;
                }
                break;
            case 49:
                {
                alt10=2;
                }
                break;
            case 50:
                {
                alt10=3;
                }
                break;
            case 51:
                {
                alt10=4;
                }
                break;
            case 52:
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
                    // InternalRsDsl.g:633:3: this_CodeRepository_0= ruleCodeRepository
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
                    // InternalRsDsl.g:642:3: this_CommunicationChannel_1= ruleCommunicationChannel
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
                    // InternalRsDsl.g:651:3: this_BugTrackingSystem_2= ruleBugTrackingSystem
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
                    // InternalRsDsl.g:660:3: this_DependencyManager_3= ruleDependencyManager
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
                    // InternalRsDsl.g:669:3: this_File_4= ruleFile
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
    // InternalRsDsl.g:681:1: entryRuleDataStructure returns [EObject current=null] : iv_ruleDataStructure= ruleDataStructure EOF ;
    public final EObject entryRuleDataStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataStructure = null;


        try {
            // InternalRsDsl.g:681:54: (iv_ruleDataStructure= ruleDataStructure EOF )
            // InternalRsDsl.g:682:2: iv_ruleDataStructure= ruleDataStructure EOF
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
    // InternalRsDsl.g:688:1: ruleDataStructure returns [EObject current=null] : (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF ) ;
    public final EObject ruleDataStructure() throws RecognitionException {
        EObject current = null;

        EObject this_Graph_Impl_0 = null;

        EObject this_Matrix_1 = null;

        EObject this_Tree_2 = null;

        EObject this_TextualContent_3 = null;

        EObject this_ARFF_4 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:694:2: ( (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF ) )
            // InternalRsDsl.g:695:2: (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF )
            {
            // InternalRsDsl.g:695:2: (this_Graph_Impl_0= ruleGraph_Impl | this_Matrix_1= ruleMatrix | this_Tree_2= ruleTree | this_TextualContent_3= ruleTextualContent | this_ARFF_4= ruleARFF )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt11=1;
                }
                break;
            case 60:
                {
                alt11=2;
                }
                break;
            case 62:
                {
                alt11=3;
                }
                break;
            case 63:
                {
                alt11=4;
                }
                break;
            case 66:
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
                    // InternalRsDsl.g:696:3: this_Graph_Impl_0= ruleGraph_Impl
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
                    // InternalRsDsl.g:705:3: this_Matrix_1= ruleMatrix
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
                    // InternalRsDsl.g:714:3: this_Tree_2= ruleTree
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
                    // InternalRsDsl.g:723:3: this_TextualContent_3= ruleTextualContent
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
                    // InternalRsDsl.g:732:3: this_ARFF_4= ruleARFF
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
    // InternalRsDsl.g:744:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRsDsl.g:744:47: (iv_ruleEString= ruleEString EOF )
            // InternalRsDsl.g:745:2: iv_ruleEString= ruleEString EOF
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
    // InternalRsDsl.g:751:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:757:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRsDsl.g:758:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRsDsl.g:758:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalRsDsl.g:759:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:767:3: this_ID_1= RULE_ID
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
    // InternalRsDsl.g:778:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // InternalRsDsl.g:778:51: (iv_ruleEvaluation= ruleEvaluation EOF )
            // InternalRsDsl.g:779:2: iv_ruleEvaluation= ruleEvaluation EOF
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
    // InternalRsDsl.g:785:1: ruleEvaluation returns [EObject current=null] : ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '[' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= ']' )? (otherlv_10= 'metrics' otherlv_11= '[' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= ']' )? (otherlv_16= 'validationTechnique' otherlv_17= '[' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) ;
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
            // InternalRsDsl.g:791:2: ( ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '[' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= ']' )? (otherlv_10= 'metrics' otherlv_11= '[' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= ']' )? (otherlv_16= 'validationTechnique' otherlv_17= '[' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) )
            // InternalRsDsl.g:792:2: ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '[' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= ']' )? (otherlv_10= 'metrics' otherlv_11= '[' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= ']' )? (otherlv_16= 'validationTechnique' otherlv_17= '[' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:792:2: ( () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '[' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= ']' )? (otherlv_10= 'metrics' otherlv_11= '[' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= ']' )? (otherlv_16= 'validationTechnique' otherlv_17= '[' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            // InternalRsDsl.g:793:3: () otherlv_1= 'Evaluation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'baselines' otherlv_5= '[' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= ']' )? (otherlv_10= 'metrics' otherlv_11= '[' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= ']' )? (otherlv_16= 'validationTechnique' otherlv_17= '[' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= ']' )? otherlv_22= '}'
            {
            // InternalRsDsl.g:793:3: ()
            // InternalRsDsl.g:794:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvaluationAccess().getEvaluationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEvaluationKeyword_1());
            		
            // InternalRsDsl.g:804:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:805:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:805:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:806:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:827:3: (otherlv_4= 'baselines' otherlv_5= '[' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRsDsl.g:828:4: otherlv_4= 'baselines' otherlv_5= '[' ( (lv_baselines_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvaluationAccess().getBaselinesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:836:4: ( (lv_baselines_6_0= ruleEString ) )
                    // InternalRsDsl.g:837:5: (lv_baselines_6_0= ruleEString )
                    {
                    // InternalRsDsl.g:837:5: (lv_baselines_6_0= ruleEString )
                    // InternalRsDsl.g:838:6: lv_baselines_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getBaselinesEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:855:4: (otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRsDsl.g:856:5: otherlv_7= ',' ( (lv_baselines_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEvaluationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:860:5: ( (lv_baselines_8_0= ruleEString ) )
                    	    // InternalRsDsl.g:861:6: (lv_baselines_8_0= ruleEString )
                    	    {
                    	    // InternalRsDsl.g:861:6: (lv_baselines_8_0= ruleEString )
                    	    // InternalRsDsl.g:862:7: lv_baselines_8_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationAccess().getBaselinesEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_9=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getEvaluationAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:885:3: (otherlv_10= 'metrics' otherlv_11= '[' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRsDsl.g:886:4: otherlv_10= 'metrics' otherlv_11= '[' ( (lv_metrics_12_0= ruleMetric ) ) (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )* otherlv_15= ']'
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getMetricsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getEvaluationAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:894:4: ( (lv_metrics_12_0= ruleMetric ) )
                    // InternalRsDsl.g:895:5: (lv_metrics_12_0= ruleMetric )
                    {
                    // InternalRsDsl.g:895:5: (lv_metrics_12_0= ruleMetric )
                    // InternalRsDsl.g:896:6: lv_metrics_12_0= ruleMetric
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getMetricsMetricEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:913:4: (otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==23) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRsDsl.g:914:5: otherlv_13= ',' ( (lv_metrics_14_0= ruleMetric ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_21); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEvaluationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:918:5: ( (lv_metrics_14_0= ruleMetric ) )
                    	    // InternalRsDsl.g:919:6: (lv_metrics_14_0= ruleMetric )
                    	    {
                    	    // InternalRsDsl.g:919:6: (lv_metrics_14_0= ruleMetric )
                    	    // InternalRsDsl.g:920:7: lv_metrics_14_0= ruleMetric
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationAccess().getMetricsMetricEnumRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_15=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getEvaluationAccess().getRightSquareBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:943:3: (otherlv_16= 'validationTechnique' otherlv_17= '[' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRsDsl.g:944:4: otherlv_16= 'validationTechnique' otherlv_17= '[' ( (lv_validationTechnique_18_0= ruleValidationTechnique ) ) (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )* otherlv_21= ']'
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getEvaluationAccess().getValidationTechniqueKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_17, grammarAccess.getEvaluationAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:952:4: ( (lv_validationTechnique_18_0= ruleValidationTechnique ) )
                    // InternalRsDsl.g:953:5: (lv_validationTechnique_18_0= ruleValidationTechnique )
                    {
                    // InternalRsDsl.g:953:5: (lv_validationTechnique_18_0= ruleValidationTechnique )
                    // InternalRsDsl.g:954:6: lv_validationTechnique_18_0= ruleValidationTechnique
                    {

                    						newCompositeNode(grammarAccess.getEvaluationAccess().getValidationTechniqueValidationTechniqueParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:971:4: (otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==23) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRsDsl.g:972:5: otherlv_19= ',' ( (lv_validationTechnique_20_0= ruleValidationTechnique ) )
                    	    {
                    	    otherlv_19=(Token)match(input,23,FOLLOW_23); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEvaluationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:976:5: ( (lv_validationTechnique_20_0= ruleValidationTechnique ) )
                    	    // InternalRsDsl.g:977:6: (lv_validationTechnique_20_0= ruleValidationTechnique )
                    	    {
                    	    // InternalRsDsl.g:977:6: (lv_validationTechnique_20_0= ruleValidationTechnique )
                    	    // InternalRsDsl.g:978:7: lv_validationTechnique_20_0= ruleValidationTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvaluationAccess().getValidationTechniqueValidationTechniqueParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_21=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_21, grammarAccess.getEvaluationAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:1009:1: entryRuleFeedbackComponent returns [EObject current=null] : iv_ruleFeedbackComponent= ruleFeedbackComponent EOF ;
    public final EObject entryRuleFeedbackComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedbackComponent = null;


        try {
            // InternalRsDsl.g:1009:58: (iv_ruleFeedbackComponent= ruleFeedbackComponent EOF )
            // InternalRsDsl.g:1010:2: iv_ruleFeedbackComponent= ruleFeedbackComponent EOF
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
    // InternalRsDsl.g:1016:1: ruleFeedbackComponent returns [EObject current=null] : ( () otherlv_1= 'FeedbackComponent' (otherlv_2= 'library' ( (lv_library_3_0= ruleFeedbackLibType ) ) )? (otherlv_4= 'query' ( (lv_query_5_0= ruleRecommendationContext ) ) )? (otherlv_6= 'expressedFeedback' ( (lv_expressedFeedback_7_0= ruleFeedback ) ) )? ) ;
    public final EObject ruleFeedbackComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_library_3_0 = null;

        EObject lv_query_5_0 = null;

        EObject lv_expressedFeedback_7_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:1022:2: ( ( () otherlv_1= 'FeedbackComponent' (otherlv_2= 'library' ( (lv_library_3_0= ruleFeedbackLibType ) ) )? (otherlv_4= 'query' ( (lv_query_5_0= ruleRecommendationContext ) ) )? (otherlv_6= 'expressedFeedback' ( (lv_expressedFeedback_7_0= ruleFeedback ) ) )? ) )
            // InternalRsDsl.g:1023:2: ( () otherlv_1= 'FeedbackComponent' (otherlv_2= 'library' ( (lv_library_3_0= ruleFeedbackLibType ) ) )? (otherlv_4= 'query' ( (lv_query_5_0= ruleRecommendationContext ) ) )? (otherlv_6= 'expressedFeedback' ( (lv_expressedFeedback_7_0= ruleFeedback ) ) )? )
            {
            // InternalRsDsl.g:1023:2: ( () otherlv_1= 'FeedbackComponent' (otherlv_2= 'library' ( (lv_library_3_0= ruleFeedbackLibType ) ) )? (otherlv_4= 'query' ( (lv_query_5_0= ruleRecommendationContext ) ) )? (otherlv_6= 'expressedFeedback' ( (lv_expressedFeedback_7_0= ruleFeedback ) ) )? )
            // InternalRsDsl.g:1024:3: () otherlv_1= 'FeedbackComponent' (otherlv_2= 'library' ( (lv_library_3_0= ruleFeedbackLibType ) ) )? (otherlv_4= 'query' ( (lv_query_5_0= ruleRecommendationContext ) ) )? (otherlv_6= 'expressedFeedback' ( (lv_expressedFeedback_7_0= ruleFeedback ) ) )?
            {
            // InternalRsDsl.g:1024:3: ()
            // InternalRsDsl.g:1025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeedbackComponentAccess().getFeedbackComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getFeedbackComponentAccess().getFeedbackComponentKeyword_1());
            		
            // InternalRsDsl.g:1035:3: (otherlv_2= 'library' ( (lv_library_3_0= ruleFeedbackLibType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRsDsl.g:1036:4: otherlv_2= 'library' ( (lv_library_3_0= ruleFeedbackLibType ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeedbackComponentAccess().getLibraryKeyword_2_0());
                    			
                    // InternalRsDsl.g:1040:4: ( (lv_library_3_0= ruleFeedbackLibType ) )
                    // InternalRsDsl.g:1041:5: (lv_library_3_0= ruleFeedbackLibType )
                    {
                    // InternalRsDsl.g:1041:5: (lv_library_3_0= ruleFeedbackLibType )
                    // InternalRsDsl.g:1042:6: lv_library_3_0= ruleFeedbackLibType
                    {

                    						newCompositeNode(grammarAccess.getFeedbackComponentAccess().getLibraryFeedbackLibTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_library_3_0=ruleFeedbackLibType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackComponentRule());
                    						}
                    						set(
                    							current,
                    							"library",
                    							lv_library_3_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.FeedbackLibType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:1060:3: (otherlv_4= 'query' ( (lv_query_5_0= ruleRecommendationContext ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRsDsl.g:1061:4: otherlv_4= 'query' ( (lv_query_5_0= ruleRecommendationContext ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedbackComponentAccess().getQueryKeyword_3_0());
                    			
                    // InternalRsDsl.g:1065:4: ( (lv_query_5_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:1066:5: (lv_query_5_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:1066:5: (lv_query_5_0= ruleRecommendationContext )
                    // InternalRsDsl.g:1067:6: lv_query_5_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getFeedbackComponentAccess().getQueryRecommendationContextParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_query_5_0=ruleRecommendationContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackComponentRule());
                    						}
                    						set(
                    							current,
                    							"query",
                    							lv_query_5_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.RecommendationContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:1085:3: (otherlv_6= 'expressedFeedback' ( (lv_expressedFeedback_7_0= ruleFeedback ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRsDsl.g:1086:4: otherlv_6= 'expressedFeedback' ( (lv_expressedFeedback_7_0= ruleFeedback ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedbackComponentAccess().getExpressedFeedbackKeyword_4_0());
                    			
                    // InternalRsDsl.g:1090:4: ( (lv_expressedFeedback_7_0= ruleFeedback ) )
                    // InternalRsDsl.g:1091:5: (lv_expressedFeedback_7_0= ruleFeedback )
                    {
                    // InternalRsDsl.g:1091:5: (lv_expressedFeedback_7_0= ruleFeedback )
                    // InternalRsDsl.g:1092:6: lv_expressedFeedback_7_0= ruleFeedback
                    {

                    						newCompositeNode(grammarAccess.getFeedbackComponentAccess().getExpressedFeedbackFeedbackParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressedFeedback_7_0=ruleFeedback();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeedbackComponentRule());
                    						}
                    						set(
                    							current,
                    							"expressedFeedback",
                    							lv_expressedFeedback_7_0,
                    							"org.xtext.lev4recgrammar.first.RsDsl.Feedback");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleFeedbackComponent"


    // $ANTLR start "entryRuleVariable"
    // InternalRsDsl.g:1114:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalRsDsl.g:1114:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalRsDsl.g:1115:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalRsDsl.g:1121:1: ruleVariable returns [EObject current=null] : ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' ) ;
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
            // InternalRsDsl.g:1127:2: ( ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' ) )
            // InternalRsDsl.g:1128:2: ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' )
            {
            // InternalRsDsl.g:1128:2: ( ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}' )
            // InternalRsDsl.g:1129:3: ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )? ( (lv_isMultiple_1_0= 'isMultiple' ) )? otherlv_2= 'Variable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'type' ( (lv_type_6_0= ruleVariableType ) ) otherlv_7= 'dataSource' ( (lv_dataSource_8_0= ruleDataSource ) ) (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )? otherlv_11= '}'
            {
            // InternalRsDsl.g:1129:3: ( (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRsDsl.g:1130:4: (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' )
                    {
                    // InternalRsDsl.g:1130:4: (lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed' )
                    // InternalRsDsl.g:1131:5: lv_isMissingValueAllowed_0_0= 'isMissingValueAllowed'
                    {
                    lv_isMissingValueAllowed_0_0=(Token)match(input,31,FOLLOW_30); 

                    					newLeafNode(lv_isMissingValueAllowed_0_0, grammarAccess.getVariableAccess().getIsMissingValueAllowedIsMissingValueAllowedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "isMissingValueAllowed", lv_isMissingValueAllowed_0_0 != null, "isMissingValueAllowed");
                    				

                    }


                    }
                    break;

            }

            // InternalRsDsl.g:1143:3: ( (lv_isMultiple_1_0= 'isMultiple' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRsDsl.g:1144:4: (lv_isMultiple_1_0= 'isMultiple' )
                    {
                    // InternalRsDsl.g:1144:4: (lv_isMultiple_1_0= 'isMultiple' )
                    // InternalRsDsl.g:1145:5: lv_isMultiple_1_0= 'isMultiple'
                    {
                    lv_isMultiple_1_0=(Token)match(input,32,FOLLOW_31); 

                    					newLeafNode(lv_isMultiple_1_0, grammarAccess.getVariableAccess().getIsMultipleIsMultipleKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(current, "isMultiple", lv_isMultiple_1_0 != null, "isMultiple");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVariableKeyword_2());
            		
            // InternalRsDsl.g:1161:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:1162:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:1162:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:1163:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getTypeKeyword_5());
            		
            // InternalRsDsl.g:1188:3: ( (lv_type_6_0= ruleVariableType ) )
            // InternalRsDsl.g:1189:4: (lv_type_6_0= ruleVariableType )
            {
            // InternalRsDsl.g:1189:4: (lv_type_6_0= ruleVariableType )
            // InternalRsDsl.g:1190:5: lv_type_6_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeVariableTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_7=(Token)match(input,35,FOLLOW_35); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getDataSourceKeyword_7());
            		
            // InternalRsDsl.g:1211:3: ( (lv_dataSource_8_0= ruleDataSource ) )
            // InternalRsDsl.g:1212:4: (lv_dataSource_8_0= ruleDataSource )
            {
            // InternalRsDsl.g:1212:4: (lv_dataSource_8_0= ruleDataSource )
            // InternalRsDsl.g:1213:5: lv_dataSource_8_0= ruleDataSource
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getDataSourceDataSourceParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalRsDsl.g:1230:3: (otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRsDsl.g:1231:4: otherlv_9= 'preprocessing' ( (lv_preprocessing_10_0= rulePreprocessing ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getPreprocessingKeyword_9_0());
                    			
                    // InternalRsDsl.g:1235:4: ( (lv_preprocessing_10_0= rulePreprocessing ) )
                    // InternalRsDsl.g:1236:5: (lv_preprocessing_10_0= rulePreprocessing )
                    {
                    // InternalRsDsl.g:1236:5: (lv_preprocessing_10_0= rulePreprocessing )
                    // InternalRsDsl.g:1237:6: lv_preprocessing_10_0= rulePreprocessing
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getPreprocessingPreprocessingParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:1263:1: entryRuleUnsupervisedDataset returns [EObject current=null] : iv_ruleUnsupervisedDataset= ruleUnsupervisedDataset EOF ;
    public final EObject entryRuleUnsupervisedDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnsupervisedDataset = null;


        try {
            // InternalRsDsl.g:1263:60: (iv_ruleUnsupervisedDataset= ruleUnsupervisedDataset EOF )
            // InternalRsDsl.g:1264:2: iv_ruleUnsupervisedDataset= ruleUnsupervisedDataset EOF
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
    // InternalRsDsl.g:1270:1: ruleUnsupervisedDataset returns [EObject current=null] : ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' ) ;
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
            // InternalRsDsl.g:1276:2: ( ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' ) )
            // InternalRsDsl.g:1277:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' )
            {
            // InternalRsDsl.g:1277:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}' )
            // InternalRsDsl.g:1278:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'UnsupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= '}'
            {
            // InternalRsDsl.g:1278:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRsDsl.g:1279:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    {
                    // InternalRsDsl.g:1279:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    // InternalRsDsl.g:1280:5: lv_isBuiltIn_0_0= 'isBuiltIn'
                    {
                    lv_isBuiltIn_0_0=(Token)match(input,37,FOLLOW_38); 

                    					newLeafNode(lv_isBuiltIn_0_0, grammarAccess.getUnsupervisedDatasetAccess().getIsBuiltInIsBuiltInKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsupervisedDatasetRule());
                    					}
                    					setWithLastConsumed(current, "isBuiltIn", lv_isBuiltIn_0_0 != null, "isBuiltIn");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUnsupervisedDatasetAccess().getUnsupervisedDatasetKeyword_1());
            		
            // InternalRsDsl.g:1296:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:1297:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:1297:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:1298:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getUnsupervisedDatasetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:1319:3: (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRsDsl.g:1320:4: otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getUnsupervisedDatasetAccess().getPreprocessingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getUnsupervisedDatasetAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:1328:4: ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) )
                    // InternalRsDsl.g:1329:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    {
                    // InternalRsDsl.g:1329:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    // InternalRsDsl.g:1330:6: lv_preprocessing_6_0= rulePreprocessingTechnique
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:1347:4: (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==23) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalRsDsl.g:1348:5: otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_40); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUnsupervisedDatasetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:1352:5: ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    // InternalRsDsl.g:1353:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    {
                    	    // InternalRsDsl.g:1353:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    // InternalRsDsl.g:1354:7: lv_preprocessing_8_0= rulePreprocessingTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_9=(Token)match(input,24,FOLLOW_41); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnsupervisedDatasetAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1377:3: (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRsDsl.g:1378:4: otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']'
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getUnsupervisedDatasetAccess().getDatasetManipulationLibraryKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_42); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnsupervisedDatasetAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:1386:4: ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) )
                    // InternalRsDsl.g:1387:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    {
                    // InternalRsDsl.g:1387:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    // InternalRsDsl.g:1388:6: lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:1405:4: (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==23) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRsDsl.g:1406:5: otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_42); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getUnsupervisedDatasetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:1410:5: ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    // InternalRsDsl.g:1411:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    {
                    	    // InternalRsDsl.g:1411:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    // InternalRsDsl.g:1412:7: lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_15=(Token)match(input,24,FOLLOW_43); 

                    				newLeafNode(otherlv_15, grammarAccess.getUnsupervisedDatasetAccess().getRightSquareBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getUnsupervisedDatasetAccess().getPathKeyword_6());
            		
            // InternalRsDsl.g:1439:3: ( (lv_path_17_0= ruleEString ) )
            // InternalRsDsl.g:1440:4: (lv_path_17_0= ruleEString )
            {
            // InternalRsDsl.g:1440:4: (lv_path_17_0= ruleEString )
            // InternalRsDsl.g:1441:5: lv_path_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getPathEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalRsDsl.g:1458:3: (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRsDsl.g:1459:4: otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']'
                    {
                    otherlv_18=(Token)match(input,41,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getUnsupervisedDatasetAccess().getIndipendentVariablesKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,22,FOLLOW_45); 

                    				newLeafNode(otherlv_19, grammarAccess.getUnsupervisedDatasetAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:1467:4: ( (lv_indipendentVariables_20_0= ruleVariable ) )
                    // InternalRsDsl.g:1468:5: (lv_indipendentVariables_20_0= ruleVariable )
                    {
                    // InternalRsDsl.g:1468:5: (lv_indipendentVariables_20_0= ruleVariable )
                    // InternalRsDsl.g:1469:6: lv_indipendentVariables_20_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:1486:4: (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalRsDsl.g:1487:5: otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    {
                    	    otherlv_21=(Token)match(input,23,FOLLOW_45); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getUnsupervisedDatasetAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:1491:5: ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    // InternalRsDsl.g:1492:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    {
                    	    // InternalRsDsl.g:1492:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    // InternalRsDsl.g:1493:7: lv_indipendentVariables_22_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_23=(Token)match(input,24,FOLLOW_46); 

                    				newLeafNode(otherlv_23, grammarAccess.getUnsupervisedDatasetAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1516:3: (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRsDsl.g:1517:4: otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    {
                    otherlv_24=(Token)match(input,42,FOLLOW_47); 

                    				newLeafNode(otherlv_24, grammarAccess.getUnsupervisedDatasetAccess().getDataStructureKeyword_9_0());
                    			
                    // InternalRsDsl.g:1521:4: ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    // InternalRsDsl.g:1522:5: (lv_dataStructure_25_0= ruleDataStructure )
                    {
                    // InternalRsDsl.g:1522:5: (lv_dataStructure_25_0= ruleDataStructure )
                    // InternalRsDsl.g:1523:6: lv_dataStructure_25_0= ruleDataStructure
                    {

                    						newCompositeNode(grammarAccess.getUnsupervisedDatasetAccess().getDataStructureDataStructureParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:1549:1: entryRuleSupervisedDataset returns [EObject current=null] : iv_ruleSupervisedDataset= ruleSupervisedDataset EOF ;
    public final EObject entryRuleSupervisedDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupervisedDataset = null;


        try {
            // InternalRsDsl.g:1549:58: (iv_ruleSupervisedDataset= ruleSupervisedDataset EOF )
            // InternalRsDsl.g:1550:2: iv_ruleSupervisedDataset= ruleSupervisedDataset EOF
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
    // InternalRsDsl.g:1556:1: ruleSupervisedDataset returns [EObject current=null] : ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' ) ;
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
            // InternalRsDsl.g:1562:2: ( ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' ) )
            // InternalRsDsl.g:1563:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' )
            {
            // InternalRsDsl.g:1563:2: ( ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}' )
            // InternalRsDsl.g:1564:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )? otherlv_1= 'SupervisedDataset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )? (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )? otherlv_16= 'path' ( (lv_path_17_0= ruleEString ) ) (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )? (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )? otherlv_26= 'dependatVariable' ( (lv_dependatVariable_27_0= ruleVariable ) ) otherlv_28= '}'
            {
            // InternalRsDsl.g:1564:3: ( (lv_isBuiltIn_0_0= 'isBuiltIn' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRsDsl.g:1565:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    {
                    // InternalRsDsl.g:1565:4: (lv_isBuiltIn_0_0= 'isBuiltIn' )
                    // InternalRsDsl.g:1566:5: lv_isBuiltIn_0_0= 'isBuiltIn'
                    {
                    lv_isBuiltIn_0_0=(Token)match(input,37,FOLLOW_48); 

                    					newLeafNode(lv_isBuiltIn_0_0, grammarAccess.getSupervisedDatasetAccess().getIsBuiltInIsBuiltInKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSupervisedDatasetRule());
                    					}
                    					setWithLastConsumed(current, "isBuiltIn", lv_isBuiltIn_0_0 != null, "isBuiltIn");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSupervisedDatasetAccess().getSupervisedDatasetKeyword_1());
            		
            // InternalRsDsl.g:1582:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:1583:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:1583:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:1584:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getSupervisedDatasetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:1605:3: (otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRsDsl.g:1606:4: otherlv_4= 'preprocessing' otherlv_5= '[' ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) ) (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getSupervisedDatasetAccess().getPreprocessingKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getSupervisedDatasetAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:1614:4: ( (lv_preprocessing_6_0= rulePreprocessingTechnique ) )
                    // InternalRsDsl.g:1615:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    {
                    // InternalRsDsl.g:1615:5: (lv_preprocessing_6_0= rulePreprocessingTechnique )
                    // InternalRsDsl.g:1616:6: lv_preprocessing_6_0= rulePreprocessingTechnique
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:1633:4: (otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==23) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRsDsl.g:1634:5: otherlv_7= ',' ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_40); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSupervisedDatasetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:1638:5: ( (lv_preprocessing_8_0= rulePreprocessingTechnique ) )
                    	    // InternalRsDsl.g:1639:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    {
                    	    // InternalRsDsl.g:1639:6: (lv_preprocessing_8_0= rulePreprocessingTechnique )
                    	    // InternalRsDsl.g:1640:7: lv_preprocessing_8_0= rulePreprocessingTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getPreprocessingPreprocessingTechniqueEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_9=(Token)match(input,24,FOLLOW_41); 

                    				newLeafNode(otherlv_9, grammarAccess.getSupervisedDatasetAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1663:3: (otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRsDsl.g:1664:4: otherlv_10= 'datasetManipulationLibrary' otherlv_11= '[' ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) ) (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )* otherlv_15= ']'
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getSupervisedDatasetAccess().getDatasetManipulationLibraryKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_42); 

                    				newLeafNode(otherlv_11, grammarAccess.getSupervisedDatasetAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:1672:4: ( (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary ) )
                    // InternalRsDsl.g:1673:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    {
                    // InternalRsDsl.g:1673:5: (lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary )
                    // InternalRsDsl.g:1674:6: lv_datasetManipulationLibrary_12_0= ruleDatasetManipulationLibrary
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:1691:4: (otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==23) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRsDsl.g:1692:5: otherlv_13= ',' ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_42); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSupervisedDatasetAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:1696:5: ( (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary ) )
                    	    // InternalRsDsl.g:1697:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    {
                    	    // InternalRsDsl.g:1697:6: (lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary )
                    	    // InternalRsDsl.g:1698:7: lv_datasetManipulationLibrary_14_0= ruleDatasetManipulationLibrary
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDatasetManipulationLibraryDatasetManipulationLibraryEnumRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_15=(Token)match(input,24,FOLLOW_43); 

                    				newLeafNode(otherlv_15, grammarAccess.getSupervisedDatasetAccess().getRightSquareBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getSupervisedDatasetAccess().getPathKeyword_6());
            		
            // InternalRsDsl.g:1725:3: ( (lv_path_17_0= ruleEString ) )
            // InternalRsDsl.g:1726:4: (lv_path_17_0= ruleEString )
            {
            // InternalRsDsl.g:1726:4: (lv_path_17_0= ruleEString )
            // InternalRsDsl.g:1727:5: lv_path_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getPathEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalRsDsl.g:1744:3: (otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRsDsl.g:1745:4: otherlv_18= 'indipendentVariables' otherlv_19= '[' ( (lv_indipendentVariables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )* otherlv_23= ']'
                    {
                    otherlv_18=(Token)match(input,41,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getSupervisedDatasetAccess().getIndipendentVariablesKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,22,FOLLOW_45); 

                    				newLeafNode(otherlv_19, grammarAccess.getSupervisedDatasetAccess().getLeftSquareBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:1753:4: ( (lv_indipendentVariables_20_0= ruleVariable ) )
                    // InternalRsDsl.g:1754:5: (lv_indipendentVariables_20_0= ruleVariable )
                    {
                    // InternalRsDsl.g:1754:5: (lv_indipendentVariables_20_0= ruleVariable )
                    // InternalRsDsl.g:1755:6: lv_indipendentVariables_20_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:1772:4: (otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==23) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRsDsl.g:1773:5: otherlv_21= ',' ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    {
                    	    otherlv_21=(Token)match(input,23,FOLLOW_45); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getSupervisedDatasetAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:1777:5: ( (lv_indipendentVariables_22_0= ruleVariable ) )
                    	    // InternalRsDsl.g:1778:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    {
                    	    // InternalRsDsl.g:1778:6: (lv_indipendentVariables_22_0= ruleVariable )
                    	    // InternalRsDsl.g:1779:7: lv_indipendentVariables_22_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getIndipendentVariablesVariableParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_23=(Token)match(input,24,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getSupervisedDatasetAccess().getRightSquareBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:1802:3: (otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRsDsl.g:1803:4: otherlv_24= 'dataStructure' ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    {
                    otherlv_24=(Token)match(input,42,FOLLOW_47); 

                    				newLeafNode(otherlv_24, grammarAccess.getSupervisedDatasetAccess().getDataStructureKeyword_9_0());
                    			
                    // InternalRsDsl.g:1807:4: ( (lv_dataStructure_25_0= ruleDataStructure ) )
                    // InternalRsDsl.g:1808:5: (lv_dataStructure_25_0= ruleDataStructure )
                    {
                    // InternalRsDsl.g:1808:5: (lv_dataStructure_25_0= ruleDataStructure )
                    // InternalRsDsl.g:1809:6: lv_dataStructure_25_0= ruleDataStructure
                    {

                    						newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDataStructureDataStructureParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            otherlv_26=(Token)match(input,44,FOLLOW_45); 

            			newLeafNode(otherlv_26, grammarAccess.getSupervisedDatasetAccess().getDependatVariableKeyword_10());
            		
            // InternalRsDsl.g:1831:3: ( (lv_dependatVariable_27_0= ruleVariable ) )
            // InternalRsDsl.g:1832:4: (lv_dependatVariable_27_0= ruleVariable )
            {
            // InternalRsDsl.g:1832:4: (lv_dependatVariable_27_0= ruleVariable )
            // InternalRsDsl.g:1833:5: lv_dependatVariable_27_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getSupervisedDatasetAccess().getDependatVariableVariableParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_28=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:1858:1: entryRulePreprocessing returns [EObject current=null] : iv_rulePreprocessing= rulePreprocessing EOF ;
    public final EObject entryRulePreprocessing() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreprocessing = null;


        try {
            // InternalRsDsl.g:1858:54: (iv_rulePreprocessing= rulePreprocessing EOF )
            // InternalRsDsl.g:1859:2: iv_rulePreprocessing= rulePreprocessing EOF
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
    // InternalRsDsl.g:1865:1: rulePreprocessing returns [EObject current=null] : ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '[' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= ']' )? otherlv_9= '}' ) ;
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
            // InternalRsDsl.g:1871:2: ( ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '[' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= ']' )? otherlv_9= '}' ) )
            // InternalRsDsl.g:1872:2: ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '[' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= ']' )? otherlv_9= '}' )
            {
            // InternalRsDsl.g:1872:2: ( () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '[' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= ']' )? otherlv_9= '}' )
            // InternalRsDsl.g:1873:3: () otherlv_1= 'Preprocessing' otherlv_2= '{' (otherlv_3= 'preprocessigTechnique' otherlv_4= '[' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= ']' )? otherlv_9= '}'
            {
            // InternalRsDsl.g:1873:3: ()
            // InternalRsDsl.g:1874:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPreprocessingAccess().getPreprocessingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPreprocessingAccess().getPreprocessingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getPreprocessingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:1888:3: (otherlv_3= 'preprocessigTechnique' otherlv_4= '[' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRsDsl.g:1889:4: otherlv_3= 'preprocessigTechnique' otherlv_4= '[' ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) ) (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getPreprocessingAccess().getPreprocessigTechniqueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getPreprocessingAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalRsDsl.g:1897:4: ( (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique ) )
                    // InternalRsDsl.g:1898:5: (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique )
                    {
                    // InternalRsDsl.g:1898:5: (lv_preprocessigTechnique_5_0= rulePreprocessingTechnique )
                    // InternalRsDsl.g:1899:6: lv_preprocessigTechnique_5_0= rulePreprocessingTechnique
                    {

                    						newCompositeNode(grammarAccess.getPreprocessingAccess().getPreprocessigTechniquePreprocessingTechniqueEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalRsDsl.g:1916:4: (otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==23) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalRsDsl.g:1917:5: otherlv_6= ',' ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) )
                    	    {
                    	    otherlv_6=(Token)match(input,23,FOLLOW_40); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPreprocessingAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRsDsl.g:1921:5: ( (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique ) )
                    	    // InternalRsDsl.g:1922:6: (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique )
                    	    {
                    	    // InternalRsDsl.g:1922:6: (lv_preprocessigTechnique_7_0= rulePreprocessingTechnique )
                    	    // InternalRsDsl.g:1923:7: lv_preprocessigTechnique_7_0= rulePreprocessingTechnique
                    	    {

                    	    							newCompositeNode(grammarAccess.getPreprocessingAccess().getPreprocessigTechniquePreprocessingTechniqueEnumRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    otherlv_8=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getPreprocessingAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:1954:1: entryRuleCodeRepository returns [EObject current=null] : iv_ruleCodeRepository= ruleCodeRepository EOF ;
    public final EObject entryRuleCodeRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRepository = null;


        try {
            // InternalRsDsl.g:1954:55: (iv_ruleCodeRepository= ruleCodeRepository EOF )
            // InternalRsDsl.g:1955:2: iv_ruleCodeRepository= ruleCodeRepository EOF
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
    // InternalRsDsl.g:1961:1: ruleCodeRepository returns [EObject current=null] : ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleCodeRepository() throws RecognitionException {
        EObject current = null;

        Token lv_metadata_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:1967:2: ( ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalRsDsl.g:1968:2: ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:1968:2: ( () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) ) )
            // InternalRsDsl.g:1969:3: () ( (lv_metadata_1_0= 'metadata' ) )? otherlv_2= 'CodeRepository' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalRsDsl.g:1969:3: ()
            // InternalRsDsl.g:1970:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeRepositoryAccess().getCodeRepositoryAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:1976:3: ( (lv_metadata_1_0= 'metadata' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRsDsl.g:1977:4: (lv_metadata_1_0= 'metadata' )
                    {
                    // InternalRsDsl.g:1977:4: (lv_metadata_1_0= 'metadata' )
                    // InternalRsDsl.g:1978:5: lv_metadata_1_0= 'metadata'
                    {
                    lv_metadata_1_0=(Token)match(input,47,FOLLOW_53); 

                    					newLeafNode(lv_metadata_1_0, grammarAccess.getCodeRepositoryAccess().getMetadataMetadataKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCodeRepositoryRule());
                    					}
                    					setWithLastConsumed(current, "metadata", lv_metadata_1_0 != null, "metadata");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCodeRepositoryAccess().getCodeRepositoryKeyword_2());
            		
            // InternalRsDsl.g:1994:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:1995:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:1995:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:1996:5: lv_name_3_0= ruleEString
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
    // InternalRsDsl.g:2017:1: entryRuleCommunicationChannel returns [EObject current=null] : iv_ruleCommunicationChannel= ruleCommunicationChannel EOF ;
    public final EObject entryRuleCommunicationChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationChannel = null;


        try {
            // InternalRsDsl.g:2017:61: (iv_ruleCommunicationChannel= ruleCommunicationChannel EOF )
            // InternalRsDsl.g:2018:2: iv_ruleCommunicationChannel= ruleCommunicationChannel EOF
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
    // InternalRsDsl.g:2024:1: ruleCommunicationChannel returns [EObject current=null] : ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCommunicationChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2030:2: ( ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRsDsl.g:2031:2: ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:2031:2: ( () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRsDsl.g:2032:3: () otherlv_1= 'CommunicationChannel' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRsDsl.g:2032:3: ()
            // InternalRsDsl.g:2033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommunicationChannelAccess().getCommunicationChannelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommunicationChannelAccess().getCommunicationChannelKeyword_1());
            		
            // InternalRsDsl.g:2043:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2044:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2044:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2045:5: lv_name_2_0= ruleEString
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
    // InternalRsDsl.g:2066:1: entryRuleBugTrackingSystem returns [EObject current=null] : iv_ruleBugTrackingSystem= ruleBugTrackingSystem EOF ;
    public final EObject entryRuleBugTrackingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBugTrackingSystem = null;


        try {
            // InternalRsDsl.g:2066:58: (iv_ruleBugTrackingSystem= ruleBugTrackingSystem EOF )
            // InternalRsDsl.g:2067:2: iv_ruleBugTrackingSystem= ruleBugTrackingSystem EOF
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
    // InternalRsDsl.g:2073:1: ruleBugTrackingSystem returns [EObject current=null] : ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBugTrackingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2079:2: ( ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRsDsl.g:2080:2: ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:2080:2: ( () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRsDsl.g:2081:3: () otherlv_1= 'BugTrackingSystem' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRsDsl.g:2081:3: ()
            // InternalRsDsl.g:2082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBugTrackingSystemAccess().getBugTrackingSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBugTrackingSystemAccess().getBugTrackingSystemKeyword_1());
            		
            // InternalRsDsl.g:2092:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2093:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2093:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2094:5: lv_name_2_0= ruleEString
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
    // InternalRsDsl.g:2115:1: entryRuleDependencyManager returns [EObject current=null] : iv_ruleDependencyManager= ruleDependencyManager EOF ;
    public final EObject entryRuleDependencyManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyManager = null;


        try {
            // InternalRsDsl.g:2115:58: (iv_ruleDependencyManager= ruleDependencyManager EOF )
            // InternalRsDsl.g:2116:2: iv_ruleDependencyManager= ruleDependencyManager EOF
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
    // InternalRsDsl.g:2122:1: ruleDependencyManager returns [EObject current=null] : ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDependencyManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:2128:2: ( ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRsDsl.g:2129:2: ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRsDsl.g:2129:2: ( () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRsDsl.g:2130:3: () otherlv_1= 'DependencyManager' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRsDsl.g:2130:3: ()
            // InternalRsDsl.g:2131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDependencyManagerAccess().getDependencyManagerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyManagerAccess().getDependencyManagerKeyword_1());
            		
            // InternalRsDsl.g:2141:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2142:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2142:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2143:5: lv_name_2_0= ruleEString
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
    // InternalRsDsl.g:2164:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalRsDsl.g:2164:45: (iv_ruleFile= ruleFile EOF )
            // InternalRsDsl.g:2165:2: iv_ruleFile= ruleFile EOF
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
    // InternalRsDsl.g:2171:1: ruleFile returns [EObject current=null] : ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalRsDsl.g:2177:2: ( ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:2178:2: ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:2178:2: ( () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:2179:3: () otherlv_1= 'File' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )? (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:2179:3: ()
            // InternalRsDsl.g:2180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getFileKeyword_1());
            		
            // InternalRsDsl.g:2190:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2191:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2191:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2192:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getFileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2213:3: (otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRsDsl.g:2214:4: otherlv_4= 'sourcePath' ( (lv_sourcePath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFileAccess().getSourcePathKeyword_4_0());
                    			
                    // InternalRsDsl.g:2218:4: ( (lv_sourcePath_5_0= ruleEString ) )
                    // InternalRsDsl.g:2219:5: (lv_sourcePath_5_0= ruleEString )
                    {
                    // InternalRsDsl.g:2219:5: (lv_sourcePath_5_0= ruleEString )
                    // InternalRsDsl.g:2220:6: lv_sourcePath_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileAccess().getSourcePathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            // InternalRsDsl.g:2238:3: (otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRsDsl.g:2239:4: otherlv_6= 'encoding' ( (lv_encoding_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFileAccess().getEncodingKeyword_5_0());
                    			
                    // InternalRsDsl.g:2243:4: ( (lv_encoding_7_0= ruleEString ) )
                    // InternalRsDsl.g:2244:5: (lv_encoding_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:2244:5: (lv_encoding_7_0= ruleEString )
                    // InternalRsDsl.g:2245:6: lv_encoding_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileAccess().getEncodingEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:2271:1: entryRuleGraph_Impl returns [EObject current=null] : iv_ruleGraph_Impl= ruleGraph_Impl EOF ;
    public final EObject entryRuleGraph_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph_Impl = null;


        try {
            // InternalRsDsl.g:2271:51: (iv_ruleGraph_Impl= ruleGraph_Impl EOF )
            // InternalRsDsl.g:2272:2: iv_ruleGraph_Impl= ruleGraph_Impl EOF
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
    // InternalRsDsl.g:2278:1: ruleGraph_Impl returns [EObject current=null] : ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) ;
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
            // InternalRsDsl.g:2284:2: ( ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) )
            // InternalRsDsl.g:2285:2: ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            {
            // InternalRsDsl.g:2285:2: ( () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            // InternalRsDsl.g:2286:3: () otherlv_1= 'Graph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}'
            {
            // InternalRsDsl.g:2286:3: ()
            // InternalRsDsl.g:2287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGraph_ImplAccess().getGraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGraph_ImplAccess().getGraphKeyword_1());
            		
            // InternalRsDsl.g:2297:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2298:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2298:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2299:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getGraph_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2320:3: (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRsDsl.g:2321:4: otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getGraph_ImplAccess().getNodesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getGraph_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2329:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2330:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2330:5: ( ruleEString )
                    // InternalRsDsl.g:2331:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraph_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGraph_ImplAccess().getNodesVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2345:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==23) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalRsDsl.g:2346:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGraph_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2350:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2351:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2351:6: ( ruleEString )
                    	    // InternalRsDsl.g:2352:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGraph_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getGraph_ImplAccess().getNodesVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
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

                    otherlv_9=(Token)match(input,58,FOLLOW_59); 

                    				newLeafNode(otherlv_9, grammarAccess.getGraph_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:2372:3: (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRsDsl.g:2373:4: otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) )
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_60); 

                    				newLeafNode(otherlv_10, grammarAccess.getGraph_ImplAccess().getRelationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:2377:4: ( (lv_relations_11_0= ruleVariableRelation ) )
                    // InternalRsDsl.g:2378:5: (lv_relations_11_0= ruleVariableRelation )
                    {
                    // InternalRsDsl.g:2378:5: (lv_relations_11_0= ruleVariableRelation )
                    // InternalRsDsl.g:2379:6: lv_relations_11_0= ruleVariableRelation
                    {

                    						newCompositeNode(grammarAccess.getGraph_ImplAccess().getRelationsVariableRelationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:2405:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalRsDsl.g:2405:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalRsDsl.g:2406:2: iv_ruleMatrix= ruleMatrix EOF
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
    // InternalRsDsl.g:2412:1: ruleMatrix returns [EObject current=null] : ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
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
            // InternalRsDsl.g:2418:2: ( ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalRsDsl.g:2419:2: ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalRsDsl.g:2419:2: ( () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalRsDsl.g:2420:3: () otherlv_1= 'Matrix' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalRsDsl.g:2420:3: ()
            // InternalRsDsl.g:2421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatrixAccess().getMatrixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getMatrixKeyword_1());
            		
            // InternalRsDsl.g:2431:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2432:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2432:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2433:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2454:3: (otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRsDsl.g:2455:4: otherlv_4= 'columns' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getMatrixAccess().getColumnsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2463:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2464:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2464:5: ( ruleEString )
                    // InternalRsDsl.g:2465:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMatrixRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMatrixAccess().getColumnsVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2479:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==23) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalRsDsl.g:2480:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMatrixAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2484:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2485:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2485:6: ( ruleEString )
                    	    // InternalRsDsl.g:2486:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMatrixRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMatrixAccess().getColumnsVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
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

                    otherlv_9=(Token)match(input,58,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getMatrixAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:2514:1: entryRuleTree returns [EObject current=null] : iv_ruleTree= ruleTree EOF ;
    public final EObject entryRuleTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTree = null;


        try {
            // InternalRsDsl.g:2514:45: (iv_ruleTree= ruleTree EOF )
            // InternalRsDsl.g:2515:2: iv_ruleTree= ruleTree EOF
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
    // InternalRsDsl.g:2521:1: ruleTree returns [EObject current=null] : ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) ;
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
            // InternalRsDsl.g:2527:2: ( ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' ) )
            // InternalRsDsl.g:2528:2: ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            {
            // InternalRsDsl.g:2528:2: ( () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}' )
            // InternalRsDsl.g:2529:3: () otherlv_1= 'Tree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )? otherlv_12= '}'
            {
            // InternalRsDsl.g:2529:3: ()
            // InternalRsDsl.g:2530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTreeAccess().getTreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTreeAccess().getTreeKeyword_1());
            		
            // InternalRsDsl.g:2540:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2541:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2541:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2542:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getTreeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2563:3: (otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRsDsl.g:2564:4: otherlv_4= 'nodes' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getTreeAccess().getNodesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTreeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2572:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2573:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2573:5: ( ruleEString )
                    // InternalRsDsl.g:2574:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTreeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTreeAccess().getNodesVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2588:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==23) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRsDsl.g:2589:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTreeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2593:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2594:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2594:6: ( ruleEString )
                    	    // InternalRsDsl.g:2595:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTreeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTreeAccess().getNodesVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
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

                    otherlv_9=(Token)match(input,58,FOLLOW_59); 

                    				newLeafNode(otherlv_9, grammarAccess.getTreeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:2615:3: (otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==59) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRsDsl.g:2616:4: otherlv_10= 'relations' ( (lv_relations_11_0= ruleVariableRelation ) )
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_60); 

                    				newLeafNode(otherlv_10, grammarAccess.getTreeAccess().getRelationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:2620:4: ( (lv_relations_11_0= ruleVariableRelation ) )
                    // InternalRsDsl.g:2621:5: (lv_relations_11_0= ruleVariableRelation )
                    {
                    // InternalRsDsl.g:2621:5: (lv_relations_11_0= ruleVariableRelation )
                    // InternalRsDsl.g:2622:6: lv_relations_11_0= ruleVariableRelation
                    {

                    						newCompositeNode(grammarAccess.getTreeAccess().getRelationsVariableRelationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:2648:1: entryRuleTextualContent returns [EObject current=null] : iv_ruleTextualContent= ruleTextualContent EOF ;
    public final EObject entryRuleTextualContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualContent = null;


        try {
            // InternalRsDsl.g:2648:55: (iv_ruleTextualContent= ruleTextualContent EOF )
            // InternalRsDsl.g:2649:2: iv_ruleTextualContent= ruleTextualContent EOF
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
    // InternalRsDsl.g:2655:1: ruleTextualContent returns [EObject current=null] : ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalRsDsl.g:2661:2: ( ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:2662:2: ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:2662:2: ( () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:2663:3: () otherlv_1= 'TextualContent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )? (otherlv_6= 'contents' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:2663:3: ()
            // InternalRsDsl.g:2664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextualContentAccess().getTextualContentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTextualContentAccess().getTextualContentKeyword_1());
            		
            // InternalRsDsl.g:2674:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2675:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2675:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2676:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getTextualContentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2697:3: (otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRsDsl.g:2698:4: otherlv_4= 'rootPath' ( (lv_rootPath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextualContentAccess().getRootPathKeyword_4_0());
                    			
                    // InternalRsDsl.g:2702:4: ( (lv_rootPath_5_0= ruleEString ) )
                    // InternalRsDsl.g:2703:5: (lv_rootPath_5_0= ruleEString )
                    {
                    // InternalRsDsl.g:2703:5: (lv_rootPath_5_0= ruleEString )
                    // InternalRsDsl.g:2704:6: lv_rootPath_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextualContentAccess().getRootPathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalRsDsl.g:2722:3: (otherlv_6= 'contents' ( ( ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==65) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRsDsl.g:2723:4: otherlv_6= 'contents' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextualContentAccess().getContentsKeyword_5_0());
                    			
                    // InternalRsDsl.g:2727:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2728:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2728:5: ( ruleEString )
                    // InternalRsDsl.g:2729:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextualContentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTextualContentAccess().getContentsVariableCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:2752:1: entryRuleARFF returns [EObject current=null] : iv_ruleARFF= ruleARFF EOF ;
    public final EObject entryRuleARFF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARFF = null;


        try {
            // InternalRsDsl.g:2752:45: (iv_ruleARFF= ruleARFF EOF )
            // InternalRsDsl.g:2753:2: iv_ruleARFF= ruleARFF EOF
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
    // InternalRsDsl.g:2759:1: ruleARFF returns [EObject current=null] : ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
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
            // InternalRsDsl.g:2765:2: ( ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalRsDsl.g:2766:2: ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalRsDsl.g:2766:2: ( () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalRsDsl.g:2767:3: () otherlv_1= 'ARFF' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalRsDsl.g:2767:3: ()
            // InternalRsDsl.g:2768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getARFFAccess().getARFFAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getARFFAccess().getARFFKeyword_1());
            		
            // InternalRsDsl.g:2778:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:2779:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:2779:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:2780:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getARFFAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:2801:3: (otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==67) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRsDsl.g:2802:4: otherlv_4= 'variables' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getARFFAccess().getVariablesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getARFFAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:2810:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2811:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2811:5: ( ruleEString )
                    // InternalRsDsl.g:2812:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getARFFRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getARFFAccess().getVariablesVariableCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:2826:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==23) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalRsDsl.g:2827:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getARFFAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:2831:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:2832:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:2832:6: ( ruleEString )
                    	    // InternalRsDsl.g:2833:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getARFFRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getARFFAccess().getVariablesVariableCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
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

                    otherlv_9=(Token)match(input,58,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getARFFAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:2861:1: entryRuleVariableRelation returns [EObject current=null] : iv_ruleVariableRelation= ruleVariableRelation EOF ;
    public final EObject entryRuleVariableRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRelation = null;


        try {
            // InternalRsDsl.g:2861:57: (iv_ruleVariableRelation= ruleVariableRelation EOF )
            // InternalRsDsl.g:2862:2: iv_ruleVariableRelation= ruleVariableRelation EOF
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
    // InternalRsDsl.g:2868:1: ruleVariableRelation returns [EObject current=null] : ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVariableRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRsDsl.g:2874:2: ( ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:2875:2: ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:2875:2: ( () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:2876:3: () otherlv_1= 'VariableRelation' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRsDsl.g:2876:3: ()
            // InternalRsDsl.g:2877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableRelationAccess().getVariableRelationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableRelationAccess().getVariableRelationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableRelationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:2891:3: (otherlv_3= 'source' ( ( ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==69) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRsDsl.g:2892:4: otherlv_3= 'source' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableRelationAccess().getSourceKeyword_3_0());
                    			
                    // InternalRsDsl.g:2896:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2897:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2897:5: ( ruleEString )
                    // InternalRsDsl.g:2898:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableRelationAccess().getSourceVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:2913:3: (otherlv_5= 'target' ( ( ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==70) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRsDsl.g:2914:4: otherlv_5= 'target' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,70,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableRelationAccess().getTargetKeyword_4_0());
                    			
                    // InternalRsDsl.g:2918:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:2919:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:2919:5: ( ruleEString )
                    // InternalRsDsl.g:2920:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRelationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableRelationAccess().getTargetVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:2943:1: entryRuleRecommendedItem returns [EObject current=null] : iv_ruleRecommendedItem= ruleRecommendedItem EOF ;
    public final EObject entryRuleRecommendedItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendedItem = null;


        try {
            // InternalRsDsl.g:2943:56: (iv_ruleRecommendedItem= ruleRecommendedItem EOF )
            // InternalRsDsl.g:2944:2: iv_ruleRecommendedItem= ruleRecommendedItem EOF
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
    // InternalRsDsl.g:2950:1: ruleRecommendedItem returns [EObject current=null] : ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
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
            // InternalRsDsl.g:2956:2: ( ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalRsDsl.g:2957:2: ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalRsDsl.g:2957:2: ( () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalRsDsl.g:2958:3: () ( (lv_ordered_1_0= 'ordered' ) )? otherlv_2= 'RecommendedItem' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            // InternalRsDsl.g:2958:3: ()
            // InternalRsDsl.g:2959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendedItemAccess().getRecommendedItemAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:2965:3: ( (lv_ordered_1_0= 'ordered' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==71) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRsDsl.g:2966:4: (lv_ordered_1_0= 'ordered' )
                    {
                    // InternalRsDsl.g:2966:4: (lv_ordered_1_0= 'ordered' )
                    // InternalRsDsl.g:2967:5: lv_ordered_1_0= 'ordered'
                    {
                    lv_ordered_1_0=(Token)match(input,71,FOLLOW_67); 

                    					newLeafNode(lv_ordered_1_0, grammarAccess.getRecommendedItemAccess().getOrderedOrderedKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecommendedItemRule());
                    					}
                    					setWithLastConsumed(current, "ordered", lv_ordered_1_0 != null, "ordered");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendedItemAccess().getRecommendedItemKeyword_2());
            		
            // InternalRsDsl.g:2983:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:2984:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:2984:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:2985:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_4, grammarAccess.getRecommendedItemAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRsDsl.g:3006:3: (otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==73) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRsDsl.g:3007:4: otherlv_5= 'outcame' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,73,FOLLOW_57); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecommendedItemAccess().getOutcameKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecommendedItemAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRsDsl.g:3015:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3016:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3016:5: ( ruleEString )
                    // InternalRsDsl.g:3017:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendedItemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendedItemAccess().getOutcameVariableCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:3031:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==23) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalRsDsl.g:3032:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRecommendedItemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:3036:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:3037:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:3037:6: ( ruleEString )
                    	    // InternalRsDsl.g:3038:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRecommendedItemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRecommendedItemAccess().getOutcameVariableCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
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

                    otherlv_10=(Token)match(input,58,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecommendedItemAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:3066:1: entryRuleWebIService returns [EObject current=null] : iv_ruleWebIService= ruleWebIService EOF ;
    public final EObject entryRuleWebIService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebIService = null;


        try {
            // InternalRsDsl.g:3066:52: (iv_ruleWebIService= ruleWebIService EOF )
            // InternalRsDsl.g:3067:2: iv_ruleWebIService= ruleWebIService EOF
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
    // InternalRsDsl.g:3073:1: ruleWebIService returns [EObject current=null] : ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalRsDsl.g:3079:2: ( ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:3080:2: ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:3080:2: ( () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:3081:3: () otherlv_1= 'WebIService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:3081:3: ()
            // InternalRsDsl.g:3082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWebIServiceAccess().getWebIServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWebIServiceAccess().getWebIServiceKeyword_1());
            		
            // InternalRsDsl.g:3092:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3093:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3093:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3094:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_69); 

            			newLeafNode(otherlv_3, grammarAccess.getWebIServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3115:3: (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==28) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRsDsl.g:3116:4: otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_70); 

                    				newLeafNode(otherlv_4, grammarAccess.getWebIServiceAccess().getLibraryKeyword_4_0());
                    			
                    // InternalRsDsl.g:3120:4: ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    // InternalRsDsl.g:3121:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    {
                    // InternalRsDsl.g:3121:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    // InternalRsDsl.g:3122:6: lv_library_5_0= ruleWebInterfaceLibrary
                    {

                    						newCompositeNode(grammarAccess.getWebIServiceAccess().getLibraryWebInterfaceLibraryEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_71);
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

            // InternalRsDsl.g:3140:3: (otherlv_6= 'recommendations' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==75) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRsDsl.g:3141:4: otherlv_6= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWebIServiceAccess().getRecommendationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:3145:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3146:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3146:5: ( ruleEString )
                    // InternalRsDsl.g:3147:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWebIServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWebIServiceAccess().getRecommendationsRecommendedItemCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:3170:1: entryRuleWebApplication returns [EObject current=null] : iv_ruleWebApplication= ruleWebApplication EOF ;
    public final EObject entryRuleWebApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebApplication = null;


        try {
            // InternalRsDsl.g:3170:55: (iv_ruleWebApplication= ruleWebApplication EOF )
            // InternalRsDsl.g:3171:2: iv_ruleWebApplication= ruleWebApplication EOF
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
    // InternalRsDsl.g:3177:1: ruleWebApplication returns [EObject current=null] : ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
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
            // InternalRsDsl.g:3183:2: ( ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalRsDsl.g:3184:2: ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalRsDsl.g:3184:2: ( () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalRsDsl.g:3185:3: () otherlv_1= 'WebApplication' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )? (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )? (otherlv_10= 'recommendations' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalRsDsl.g:3185:3: ()
            // InternalRsDsl.g:3186:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWebApplicationAccess().getWebApplicationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWebApplicationAccess().getWebApplicationKeyword_1());
            		
            // InternalRsDsl.g:3196:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3197:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3197:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3198:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getWebApplicationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3219:3: (otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==28) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRsDsl.g:3220:4: otherlv_4= 'library' ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_70); 

                    				newLeafNode(otherlv_4, grammarAccess.getWebApplicationAccess().getLibraryKeyword_4_0());
                    			
                    // InternalRsDsl.g:3224:4: ( (lv_library_5_0= ruleWebInterfaceLibrary ) )
                    // InternalRsDsl.g:3225:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    {
                    // InternalRsDsl.g:3225:5: (lv_library_5_0= ruleWebInterfaceLibrary )
                    // InternalRsDsl.g:3226:6: lv_library_5_0= ruleWebInterfaceLibrary
                    {

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getLibraryWebInterfaceLibraryEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalRsDsl.g:3244:3: (otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==77) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRsDsl.g:3245:4: otherlv_6= 'port' ( (lv_port_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWebApplicationAccess().getPortKeyword_5_0());
                    			
                    // InternalRsDsl.g:3249:4: ( (lv_port_7_0= ruleEString ) )
                    // InternalRsDsl.g:3250:5: (lv_port_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:3250:5: (lv_port_7_0= ruleEString )
                    // InternalRsDsl.g:3251:6: lv_port_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getPortEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            // InternalRsDsl.g:3269:3: (otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==78) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRsDsl.g:3270:4: otherlv_8= 'host' ( (lv_host_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getWebApplicationAccess().getHostKeyword_6_0());
                    			
                    // InternalRsDsl.g:3274:4: ( (lv_host_9_0= ruleEString ) )
                    // InternalRsDsl.g:3275:5: (lv_host_9_0= ruleEString )
                    {
                    // InternalRsDsl.g:3275:5: (lv_host_9_0= ruleEString )
                    // InternalRsDsl.g:3276:6: lv_host_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getHostEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_71);
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

            // InternalRsDsl.g:3294:3: (otherlv_10= 'recommendations' ( ( ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==75) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRsDsl.g:3295:4: otherlv_10= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getWebApplicationAccess().getRecommendationsKeyword_7_0());
                    			
                    // InternalRsDsl.g:3299:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3300:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3300:5: ( ruleEString )
                    // InternalRsDsl.g:3301:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWebApplicationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWebApplicationAccess().getRecommendationsRecommendedItemCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:3324:1: entryRuleIDEIntegration_Impl returns [EObject current=null] : iv_ruleIDEIntegration_Impl= ruleIDEIntegration_Impl EOF ;
    public final EObject entryRuleIDEIntegration_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDEIntegration_Impl = null;


        try {
            // InternalRsDsl.g:3324:60: (iv_ruleIDEIntegration_Impl= ruleIDEIntegration_Impl EOF )
            // InternalRsDsl.g:3325:2: iv_ruleIDEIntegration_Impl= ruleIDEIntegration_Impl EOF
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
    // InternalRsDsl.g:3331:1: ruleIDEIntegration_Impl returns [EObject current=null] : ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleIDEIntegration_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3337:2: ( ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRsDsl.g:3338:2: ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRsDsl.g:3338:2: ( () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalRsDsl.g:3339:3: () otherlv_1= 'IDEIntegration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRsDsl.g:3339:3: ()
            // InternalRsDsl.g:3340:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIDEIntegration_ImplAccess().getIDEIntegrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIDEIntegration_ImplAccess().getIDEIntegrationKeyword_1());
            		
            // InternalRsDsl.g:3350:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3351:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3351:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3352:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getIDEIntegration_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3373:3: (otherlv_4= 'recommendations' ( ( ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==75) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRsDsl.g:3374:4: otherlv_4= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIDEIntegration_ImplAccess().getRecommendationsKeyword_4_0());
                    			
                    // InternalRsDsl.g:3378:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3379:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3379:5: ( ruleEString )
                    // InternalRsDsl.g:3380:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIDEIntegration_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIDEIntegration_ImplAccess().getRecommendationsRecommendedItemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleJupyterNotebook"
    // InternalRsDsl.g:3403:1: entryRuleJupyterNotebook returns [EObject current=null] : iv_ruleJupyterNotebook= ruleJupyterNotebook EOF ;
    public final EObject entryRuleJupyterNotebook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJupyterNotebook = null;


        try {
            // InternalRsDsl.g:3403:56: (iv_ruleJupyterNotebook= ruleJupyterNotebook EOF )
            // InternalRsDsl.g:3404:2: iv_ruleJupyterNotebook= ruleJupyterNotebook EOF
            {
             newCompositeNode(grammarAccess.getJupyterNotebookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJupyterNotebook=ruleJupyterNotebook();

            state._fsp--;

             current =iv_ruleJupyterNotebook; 
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
    // $ANTLR end "entryRuleJupyterNotebook"


    // $ANTLR start "ruleJupyterNotebook"
    // InternalRsDsl.g:3410:1: ruleJupyterNotebook returns [EObject current=null] : ( () otherlv_1= 'JupyterNotebook' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleJupyterNotebook() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3416:2: ( ( () otherlv_1= 'JupyterNotebook' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRsDsl.g:3417:2: ( () otherlv_1= 'JupyterNotebook' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRsDsl.g:3417:2: ( () otherlv_1= 'JupyterNotebook' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalRsDsl.g:3418:3: () otherlv_1= 'JupyterNotebook' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRsDsl.g:3418:3: ()
            // InternalRsDsl.g:3419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJupyterNotebookAccess().getJupyterNotebookAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJupyterNotebookAccess().getJupyterNotebookKeyword_1());
            		
            // InternalRsDsl.g:3429:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3430:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3430:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3431:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJupyterNotebookAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJupyterNotebookRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.lev4recgrammar.first.RsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getJupyterNotebookAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3452:3: (otherlv_4= 'recommendations' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==75) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRsDsl.g:3453:4: otherlv_4= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getJupyterNotebookAccess().getRecommendationsKeyword_4_0());
                    			
                    // InternalRsDsl.g:3457:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3458:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3458:5: ( ruleEString )
                    // InternalRsDsl.g:3459:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJupyterNotebookRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJupyterNotebookAccess().getRecommendationsRecommendedItemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJupyterNotebookAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleJupyterNotebook"


    // $ANTLR start "entryRuleVSCodePlugin"
    // InternalRsDsl.g:3482:1: entryRuleVSCodePlugin returns [EObject current=null] : iv_ruleVSCodePlugin= ruleVSCodePlugin EOF ;
    public final EObject entryRuleVSCodePlugin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVSCodePlugin = null;


        try {
            // InternalRsDsl.g:3482:53: (iv_ruleVSCodePlugin= ruleVSCodePlugin EOF )
            // InternalRsDsl.g:3483:2: iv_ruleVSCodePlugin= ruleVSCodePlugin EOF
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
    // InternalRsDsl.g:3489:1: ruleVSCodePlugin returns [EObject current=null] : (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' ) ;
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
            // InternalRsDsl.g:3495:2: ( (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' ) )
            // InternalRsDsl.g:3496:2: (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalRsDsl.g:3496:2: (otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}' )
            // InternalRsDsl.g:3497:3: otherlv_0= 'VSCodePlugin' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'recommendations' ( ( ruleEString ) ) )? otherlv_5= 'handler' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVSCodePluginAccess().getVSCodePluginKeyword_0());
            		
            // InternalRsDsl.g:3501:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:3502:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:3502:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:3503:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getVSCodePluginAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:3524:3: (otherlv_3= 'recommendations' ( ( ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==75) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRsDsl.g:3525:4: otherlv_3= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVSCodePluginAccess().getRecommendationsKeyword_3_0());
                    			
                    // InternalRsDsl.g:3529:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3530:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3530:5: ( ruleEString )
                    // InternalRsDsl.g:3531:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVSCodePluginRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVSCodePluginAccess().getRecommendationsRecommendedItemCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,82,FOLLOW_57); 

            			newLeafNode(otherlv_5, grammarAccess.getVSCodePluginAccess().getHandlerKeyword_4());
            		
            otherlv_6=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getVSCodePluginAccess().getLeftParenthesisKeyword_5());
            		
            // InternalRsDsl.g:3554:3: ( ( ruleEString ) )
            // InternalRsDsl.g:3555:4: ( ruleEString )
            {
            // InternalRsDsl.g:3555:4: ( ruleEString )
            // InternalRsDsl.g:3556:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVSCodePluginRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVSCodePluginAccess().getHandlerRecommendationHandlerCrossReference_6_0());
            				
            pushFollow(FOLLOW_58);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRsDsl.g:3570:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==23) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalRsDsl.g:3571:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getVSCodePluginAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRsDsl.g:3575:4: ( ( ruleEString ) )
            	    // InternalRsDsl.g:3576:5: ( ruleEString )
            	    {
            	    // InternalRsDsl.g:3576:5: ( ruleEString )
            	    // InternalRsDsl.g:3577:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVSCodePluginRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getVSCodePluginAccess().getHandlerRecommendationHandlerCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_58);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_10=(Token)match(input,58,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getVSCodePluginAccess().getRightParenthesisKeyword_8());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:3604:1: entryRuleTraversableGraph returns [EObject current=null] : iv_ruleTraversableGraph= ruleTraversableGraph EOF ;
    public final EObject entryRuleTraversableGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraversableGraph = null;


        try {
            // InternalRsDsl.g:3604:57: (iv_ruleTraversableGraph= ruleTraversableGraph EOF )
            // InternalRsDsl.g:3605:2: iv_ruleTraversableGraph= ruleTraversableGraph EOF
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
    // InternalRsDsl.g:3611:1: ruleTraversableGraph returns [EObject current=null] : ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTraversableGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:3617:2: ( ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalRsDsl.g:3618:2: ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalRsDsl.g:3618:2: ( () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalRsDsl.g:3619:3: () otherlv_1= 'TraversableGraph' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'recommendations' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalRsDsl.g:3619:3: ()
            // InternalRsDsl.g:3620:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTraversableGraphAccess().getTraversableGraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTraversableGraphAccess().getTraversableGraphKeyword_1());
            		
            // InternalRsDsl.g:3630:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3631:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3631:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3632:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_3, grammarAccess.getTraversableGraphAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3653:3: (otherlv_4= 'recommendations' ( ( ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==75) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRsDsl.g:3654:4: otherlv_4= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTraversableGraphAccess().getRecommendationsKeyword_4_0());
                    			
                    // InternalRsDsl.g:3658:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3659:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3659:5: ( ruleEString )
                    // InternalRsDsl.g:3660:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTraversableGraphRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTraversableGraphAccess().getRecommendationsRecommendedItemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:3683:1: entryRuleRawOutcomes returns [EObject current=null] : iv_ruleRawOutcomes= ruleRawOutcomes EOF ;
    public final EObject entryRuleRawOutcomes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawOutcomes = null;


        try {
            // InternalRsDsl.g:3683:52: (iv_ruleRawOutcomes= ruleRawOutcomes EOF )
            // InternalRsDsl.g:3684:2: iv_ruleRawOutcomes= ruleRawOutcomes EOF
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
    // InternalRsDsl.g:3690:1: ruleRawOutcomes returns [EObject current=null] : ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
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
            // InternalRsDsl.g:3696:2: ( ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalRsDsl.g:3697:2: ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalRsDsl.g:3697:2: ( () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalRsDsl.g:3698:3: () otherlv_1= 'RawOutcomes' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )? (otherlv_6= 'recommendations' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalRsDsl.g:3698:3: ()
            // InternalRsDsl.g:3699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRawOutcomesAccess().getRawOutcomesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRawOutcomesAccess().getRawOutcomesKeyword_1());
            		
            // InternalRsDsl.g:3709:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3710:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3710:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3711:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getRawOutcomesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3732:3: (otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==85) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalRsDsl.g:3733:4: otherlv_4= 'format' ( (lv_format_5_0= ruleRawFormat ) )
                    {
                    otherlv_4=(Token)match(input,85,FOLLOW_78); 

                    				newLeafNode(otherlv_4, grammarAccess.getRawOutcomesAccess().getFormatKeyword_4_0());
                    			
                    // InternalRsDsl.g:3737:4: ( (lv_format_5_0= ruleRawFormat ) )
                    // InternalRsDsl.g:3738:5: (lv_format_5_0= ruleRawFormat )
                    {
                    // InternalRsDsl.g:3738:5: (lv_format_5_0= ruleRawFormat )
                    // InternalRsDsl.g:3739:6: lv_format_5_0= ruleRawFormat
                    {

                    						newCompositeNode(grammarAccess.getRawOutcomesAccess().getFormatRawFormatEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_71);
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

            // InternalRsDsl.g:3757:3: (otherlv_6= 'recommendations' ( ( ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==75) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRsDsl.g:3758:4: otherlv_6= 'recommendations' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRawOutcomesAccess().getRecommendationsKeyword_5_0());
                    			
                    // InternalRsDsl.g:3762:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3763:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3763:5: ( ruleEString )
                    // InternalRsDsl.g:3764:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRawOutcomesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRawOutcomesAccess().getRecommendationsRecommendedItemCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:3787:1: entryRuleRecommendationHandler_Impl returns [EObject current=null] : iv_ruleRecommendationHandler_Impl= ruleRecommendationHandler_Impl EOF ;
    public final EObject entryRuleRecommendationHandler_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationHandler_Impl = null;


        try {
            // InternalRsDsl.g:3787:67: (iv_ruleRecommendationHandler_Impl= ruleRecommendationHandler_Impl EOF )
            // InternalRsDsl.g:3788:2: iv_ruleRecommendationHandler_Impl= ruleRecommendationHandler_Impl EOF
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
    // InternalRsDsl.g:3794:1: ruleRecommendationHandler_Impl returns [EObject current=null] : ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalRsDsl.g:3800:2: ( ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalRsDsl.g:3801:2: ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalRsDsl.g:3801:2: ( () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalRsDsl.g:3802:3: () otherlv_1= 'RecommendationHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalRsDsl.g:3802:3: ()
            // InternalRsDsl.g:3803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendationHandler_ImplAccess().getRecommendationHandlerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRecommendationHandler_ImplAccess().getRecommendationHandlerKeyword_1());
            		
            // InternalRsDsl.g:3813:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:3814:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:3814:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:3815:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_3, grammarAccess.getRecommendationHandler_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:3836:3: (otherlv_4= 'webService' ( ( ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==87) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalRsDsl.g:3837:4: otherlv_4= 'webService' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRecommendationHandler_ImplAccess().getWebServiceKeyword_4_0());
                    			
                    // InternalRsDsl.g:3841:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3842:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3842:5: ( ruleEString )
                    // InternalRsDsl.g:3843:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationHandler_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getWebServiceWebIServiceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3858:3: (otherlv_6= 'context' ( ( ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==88) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalRsDsl.g:3859:4: otherlv_6= 'context' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,88,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecommendationHandler_ImplAccess().getContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:3863:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:3864:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:3864:5: ( ruleEString )
                    // InternalRsDsl.g:3865:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationHandler_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getContextRecommendationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:3880:3: (otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==89) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalRsDsl.g:3881:4: otherlv_8= 'usage' otherlv_9= '{' ( (lv_usage_10_0= ruleRecommendationUsage ) ) (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,89,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecommendationHandler_ImplAccess().getUsageKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_82); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecommendationHandler_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:3889:4: ( (lv_usage_10_0= ruleRecommendationUsage ) )
                    // InternalRsDsl.g:3890:5: (lv_usage_10_0= ruleRecommendationUsage )
                    {
                    // InternalRsDsl.g:3890:5: (lv_usage_10_0= ruleRecommendationUsage )
                    // InternalRsDsl.g:3891:6: lv_usage_10_0= ruleRecommendationUsage
                    {

                    						newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getUsageRecommendationUsageParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:3908:4: (otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==23) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalRsDsl.g:3909:5: otherlv_11= ',' ( (lv_usage_12_0= ruleRecommendationUsage ) )
                    	    {
                    	    otherlv_11=(Token)match(input,23,FOLLOW_82); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRecommendationHandler_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:3913:5: ( (lv_usage_12_0= ruleRecommendationUsage ) )
                    	    // InternalRsDsl.g:3914:6: (lv_usage_12_0= ruleRecommendationUsage )
                    	    {
                    	    // InternalRsDsl.g:3914:6: (lv_usage_12_0= ruleRecommendationUsage )
                    	    // InternalRsDsl.g:3915:7: lv_usage_12_0= ruleRecommendationUsage
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecommendationHandler_ImplAccess().getUsageRecommendationUsageParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getRecommendationHandler_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:3946:1: entryRuleRecommendationUsage returns [EObject current=null] : iv_ruleRecommendationUsage= ruleRecommendationUsage EOF ;
    public final EObject entryRuleRecommendationUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationUsage = null;


        try {
            // InternalRsDsl.g:3946:60: (iv_ruleRecommendationUsage= ruleRecommendationUsage EOF )
            // InternalRsDsl.g:3947:2: iv_ruleRecommendationUsage= ruleRecommendationUsage EOF
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
    // InternalRsDsl.g:3953:1: ruleRecommendationUsage returns [EObject current=null] : ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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
            // InternalRsDsl.g:3959:2: ( ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalRsDsl.g:3960:2: ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalRsDsl.g:3960:2: ( () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalRsDsl.g:3961:3: () otherlv_1= 'RecommendationUsage' otherlv_2= '{' (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )? (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalRsDsl.g:3961:3: ()
            // InternalRsDsl.g:3962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendationUsageAccess().getRecommendationUsageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecommendationUsageAccess().getRecommendationUsageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_84); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendationUsageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:3976:3: (otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==91) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalRsDsl.g:3977:4: otherlv_3= 'usageType' ( (lv_usageType_4_0= ruleRecommendationUsageType ) )
                    {
                    otherlv_3=(Token)match(input,91,FOLLOW_85); 

                    				newLeafNode(otherlv_3, grammarAccess.getRecommendationUsageAccess().getUsageTypeKeyword_3_0());
                    			
                    // InternalRsDsl.g:3981:4: ( (lv_usageType_4_0= ruleRecommendationUsageType ) )
                    // InternalRsDsl.g:3982:5: (lv_usageType_4_0= ruleRecommendationUsageType )
                    {
                    // InternalRsDsl.g:3982:5: (lv_usageType_4_0= ruleRecommendationUsageType )
                    // InternalRsDsl.g:3983:6: lv_usageType_4_0= ruleRecommendationUsageType
                    {

                    						newCompositeNode(grammarAccess.getRecommendationUsageAccess().getUsageTypeRecommendationUsageTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_86);
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

            // InternalRsDsl.g:4001:3: (otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==92) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalRsDsl.g:4002:4: otherlv_5= 'recommendedItems' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,92,FOLLOW_57); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecommendationUsageAccess().getRecommendedItemsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecommendationUsageAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRsDsl.g:4010:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4011:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4011:5: ( ruleEString )
                    // InternalRsDsl.g:4012:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationUsageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationUsageAccess().getRecommendedItemsRecommendedItemCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRsDsl.g:4026:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==23) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalRsDsl.g:4027:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRecommendationUsageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:4031:5: ( ( ruleEString ) )
                    	    // InternalRsDsl.g:4032:6: ( ruleEString )
                    	    {
                    	    // InternalRsDsl.g:4032:6: ( ruleEString )
                    	    // InternalRsDsl.g:4033:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRecommendationUsageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRecommendationUsageAccess().getRecommendedItemsRecommendedItemCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,58,FOLLOW_87); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecommendationUsageAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:4053:3: (otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==93) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalRsDsl.g:4054:4: otherlv_11= 'guielements' otherlv_12= '{' ( (lv_guielements_13_0= ruleGUIElement ) ) (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,93,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getRecommendationUsageAccess().getGuielementsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_88); 

                    				newLeafNode(otherlv_12, grammarAccess.getRecommendationUsageAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRsDsl.g:4062:4: ( (lv_guielements_13_0= ruleGUIElement ) )
                    // InternalRsDsl.g:4063:5: (lv_guielements_13_0= ruleGUIElement )
                    {
                    // InternalRsDsl.g:4063:5: (lv_guielements_13_0= ruleGUIElement )
                    // InternalRsDsl.g:4064:6: lv_guielements_13_0= ruleGUIElement
                    {

                    						newCompositeNode(grammarAccess.getRecommendationUsageAccess().getGuielementsGUIElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:4081:4: (otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==23) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalRsDsl.g:4082:5: otherlv_14= ',' ( (lv_guielements_15_0= ruleGUIElement ) )
                    	    {
                    	    otherlv_14=(Token)match(input,23,FOLLOW_88); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRecommendationUsageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRsDsl.g:4086:5: ( (lv_guielements_15_0= ruleGUIElement ) )
                    	    // InternalRsDsl.g:4087:6: (lv_guielements_15_0= ruleGUIElement )
                    	    {
                    	    // InternalRsDsl.g:4087:6: (lv_guielements_15_0= ruleGUIElement )
                    	    // InternalRsDsl.g:4088:7: lv_guielements_15_0= ruleGUIElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecommendationUsageAccess().getGuielementsGUIElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getRecommendationUsageAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:4119:1: entryRuleRecommendationContext returns [EObject current=null] : iv_ruleRecommendationContext= ruleRecommendationContext EOF ;
    public final EObject entryRuleRecommendationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationContext = null;


        try {
            // InternalRsDsl.g:4119:62: (iv_ruleRecommendationContext= ruleRecommendationContext EOF )
            // InternalRsDsl.g:4120:2: iv_ruleRecommendationContext= ruleRecommendationContext EOF
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
    // InternalRsDsl.g:4126:1: ruleRecommendationContext returns [EObject current=null] : ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalRsDsl.g:4132:2: ( ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:4133:2: ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:4133:2: ( () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:4134:3: () ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )? otherlv_2= 'RecommendationContext' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'userContext' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRsDsl.g:4134:3: ()
            // InternalRsDsl.g:4135:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecommendationContextAccess().getRecommendationContextAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:4141:3: ( (lv_isProactiveSystem_1_0= 'isProactiveSystem' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==94) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalRsDsl.g:4142:4: (lv_isProactiveSystem_1_0= 'isProactiveSystem' )
                    {
                    // InternalRsDsl.g:4142:4: (lv_isProactiveSystem_1_0= 'isProactiveSystem' )
                    // InternalRsDsl.g:4143:5: lv_isProactiveSystem_1_0= 'isProactiveSystem'
                    {
                    lv_isProactiveSystem_1_0=(Token)match(input,94,FOLLOW_89); 

                    					newLeafNode(lv_isProactiveSystem_1_0, grammarAccess.getRecommendationContextAccess().getIsProactiveSystemIsProactiveSystemKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecommendationContextRule());
                    					}
                    					setWithLastConsumed(current, "isProactiveSystem", lv_isProactiveSystem_1_0 != null, "isProactiveSystem");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendationContextAccess().getRecommendationContextKeyword_2());
            		
            // InternalRsDsl.g:4159:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:4160:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:4160:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:4161:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,12,FOLLOW_90); 

            			newLeafNode(otherlv_4, grammarAccess.getRecommendationContextAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRsDsl.g:4182:3: (otherlv_5= 'userContext' ( ( ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==96) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalRsDsl.g:4183:4: otherlv_5= 'userContext' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecommendationContextAccess().getUserContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:4187:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4188:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4188:5: ( ruleEString )
                    // InternalRsDsl.g:4189:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecommendationContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRecommendationContextAccess().getUserContextDataStructureCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:4212:1: entryRuleProactiveHandler returns [EObject current=null] : iv_ruleProactiveHandler= ruleProactiveHandler EOF ;
    public final EObject entryRuleProactiveHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProactiveHandler = null;


        try {
            // InternalRsDsl.g:4212:57: (iv_ruleProactiveHandler= ruleProactiveHandler EOF )
            // InternalRsDsl.g:4213:2: iv_ruleProactiveHandler= ruleProactiveHandler EOF
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
    // InternalRsDsl.g:4219:1: ruleProactiveHandler returns [EObject current=null] : ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalRsDsl.g:4225:2: ( ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalRsDsl.g:4226:2: ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalRsDsl.g:4226:2: ( () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalRsDsl.g:4227:3: () ( (lv_condition_1_0= 'condition' ) )? otherlv_2= 'ProactiveHandler' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'webService' ( ( ruleEString ) ) )? (otherlv_7= 'context' ( ( ruleEString ) ) )? (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalRsDsl.g:4227:3: ()
            // InternalRsDsl.g:4228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProactiveHandlerAccess().getProactiveHandlerAction_0(),
            					current);
            			

            }

            // InternalRsDsl.g:4234:3: ( (lv_condition_1_0= 'condition' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==97) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalRsDsl.g:4235:4: (lv_condition_1_0= 'condition' )
                    {
                    // InternalRsDsl.g:4235:4: (lv_condition_1_0= 'condition' )
                    // InternalRsDsl.g:4236:5: lv_condition_1_0= 'condition'
                    {
                    lv_condition_1_0=(Token)match(input,97,FOLLOW_91); 

                    					newLeafNode(lv_condition_1_0, grammarAccess.getProactiveHandlerAccess().getConditionConditionKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProactiveHandlerRule());
                    					}
                    					setWithLastConsumed(current, "condition", lv_condition_1_0 != null, "condition");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,98,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProactiveHandlerAccess().getProactiveHandlerKeyword_2());
            		
            // InternalRsDsl.g:4252:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRsDsl.g:4253:4: (lv_name_3_0= ruleEString )
            {
            // InternalRsDsl.g:4253:4: (lv_name_3_0= ruleEString )
            // InternalRsDsl.g:4254:5: lv_name_3_0= ruleEString
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

            otherlv_4=(Token)match(input,12,FOLLOW_79); 

            			newLeafNode(otherlv_4, grammarAccess.getProactiveHandlerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRsDsl.g:4275:3: (otherlv_5= 'webService' ( ( ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==87) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalRsDsl.g:4276:4: otherlv_5= 'webService' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getProactiveHandlerAccess().getWebServiceKeyword_5_0());
                    			
                    // InternalRsDsl.g:4280:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4281:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4281:5: ( ruleEString )
                    // InternalRsDsl.g:4282:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProactiveHandlerAccess().getWebServiceWebIServiceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4297:3: (otherlv_7= 'context' ( ( ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==88) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalRsDsl.g:4298:4: otherlv_7= 'context' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,88,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getProactiveHandlerAccess().getContextKeyword_6_0());
                    			
                    // InternalRsDsl.g:4302:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4303:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4303:5: ( ruleEString )
                    // InternalRsDsl.g:4304:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProactiveHandlerAccess().getContextRecommendationContextCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4319:3: (otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==89) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalRsDsl.g:4320:4: otherlv_9= 'usage' otherlv_10= '{' ( (lv_usage_11_0= ruleRecommendationUsage ) ) (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,89,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getProactiveHandlerAccess().getUsageKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_82); 

                    				newLeafNode(otherlv_10, grammarAccess.getProactiveHandlerAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRsDsl.g:4328:4: ( (lv_usage_11_0= ruleRecommendationUsage ) )
                    // InternalRsDsl.g:4329:5: (lv_usage_11_0= ruleRecommendationUsage )
                    {
                    // InternalRsDsl.g:4329:5: (lv_usage_11_0= ruleRecommendationUsage )
                    // InternalRsDsl.g:4330:6: lv_usage_11_0= ruleRecommendationUsage
                    {

                    						newCompositeNode(grammarAccess.getProactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:4347:4: (otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==23) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalRsDsl.g:4348:5: otherlv_12= ',' ( (lv_usage_13_0= ruleRecommendationUsage ) )
                    	    {
                    	    otherlv_12=(Token)match(input,23,FOLLOW_82); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProactiveHandlerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRsDsl.g:4352:5: ( (lv_usage_13_0= ruleRecommendationUsage ) )
                    	    // InternalRsDsl.g:4353:6: (lv_usage_13_0= ruleRecommendationUsage )
                    	    {
                    	    // InternalRsDsl.g:4353:6: (lv_usage_13_0= ruleRecommendationUsage )
                    	    // InternalRsDsl.g:4354:7: lv_usage_13_0= ruleRecommendationUsage
                    	    {

                    	    							newCompositeNode(grammarAccess.getProactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getProactiveHandlerAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:4385:1: entryRuleReactiveHandler returns [EObject current=null] : iv_ruleReactiveHandler= ruleReactiveHandler EOF ;
    public final EObject entryRuleReactiveHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReactiveHandler = null;


        try {
            // InternalRsDsl.g:4385:56: (iv_ruleReactiveHandler= ruleReactiveHandler EOF )
            // InternalRsDsl.g:4386:2: iv_ruleReactiveHandler= ruleReactiveHandler EOF
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
    // InternalRsDsl.g:4392:1: ruleReactiveHandler returns [EObject current=null] : ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalRsDsl.g:4398:2: ( ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRsDsl.g:4399:2: ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRsDsl.g:4399:2: ( () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRsDsl.g:4400:3: () otherlv_1= 'ReactiveHandler' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'webService' ( ( ruleEString ) ) )? (otherlv_6= 'context' ( ( ruleEString ) ) )? (otherlv_8= 'event' ( ( ruleEString ) ) )? (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalRsDsl.g:4400:3: ()
            // InternalRsDsl.g:4401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactiveHandlerAccess().getReactiveHandlerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReactiveHandlerAccess().getReactiveHandlerKeyword_1());
            		
            // InternalRsDsl.g:4411:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:4412:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:4412:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:4413:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getReactiveHandlerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:4434:3: (otherlv_4= 'webService' ( ( ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==87) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalRsDsl.g:4435:4: otherlv_4= 'webService' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getReactiveHandlerAccess().getWebServiceKeyword_4_0());
                    			
                    // InternalRsDsl.g:4439:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4440:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4440:5: ( ruleEString )
                    // InternalRsDsl.g:4441:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getWebServiceWebIServiceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4456:3: (otherlv_6= 'context' ( ( ruleEString ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==88) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalRsDsl.g:4457:4: otherlv_6= 'context' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,88,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getReactiveHandlerAccess().getContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:4461:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4462:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4462:5: ( ruleEString )
                    // InternalRsDsl.g:4463:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getContextRecommendationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4478:3: (otherlv_8= 'event' ( ( ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==100) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalRsDsl.g:4479:4: otherlv_8= 'event' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,100,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getReactiveHandlerAccess().getEventKeyword_6_0());
                    			
                    // InternalRsDsl.g:4483:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4484:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4484:5: ( ruleEString )
                    // InternalRsDsl.g:4485:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReactiveHandlerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getEventUserEventCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:4500:3: (otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==89) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalRsDsl.g:4501:4: otherlv_10= 'usage' otherlv_11= '{' ( (lv_usage_12_0= ruleRecommendationUsage ) ) (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,89,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getReactiveHandlerAccess().getUsageKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_82); 

                    				newLeafNode(otherlv_11, grammarAccess.getReactiveHandlerAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRsDsl.g:4509:4: ( (lv_usage_12_0= ruleRecommendationUsage ) )
                    // InternalRsDsl.g:4510:5: (lv_usage_12_0= ruleRecommendationUsage )
                    {
                    // InternalRsDsl.g:4510:5: (lv_usage_12_0= ruleRecommendationUsage )
                    // InternalRsDsl.g:4511:6: lv_usage_12_0= ruleRecommendationUsage
                    {

                    						newCompositeNode(grammarAccess.getReactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:4528:4: (otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==23) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalRsDsl.g:4529:5: otherlv_13= ',' ( (lv_usage_14_0= ruleRecommendationUsage ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_82); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getReactiveHandlerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRsDsl.g:4533:5: ( (lv_usage_14_0= ruleRecommendationUsage ) )
                    	    // InternalRsDsl.g:4534:6: (lv_usage_14_0= ruleRecommendationUsage )
                    	    {
                    	    // InternalRsDsl.g:4534:6: (lv_usage_14_0= ruleRecommendationUsage )
                    	    // InternalRsDsl.g:4535:7: lv_usage_14_0= ruleRecommendationUsage
                    	    {

                    	    							newCompositeNode(grammarAccess.getReactiveHandlerAccess().getUsageRecommendationUsageParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getReactiveHandlerAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:4566:1: entryRuleGUIElement returns [EObject current=null] : iv_ruleGUIElement= ruleGUIElement EOF ;
    public final EObject entryRuleGUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIElement = null;


        try {
            // InternalRsDsl.g:4566:51: (iv_ruleGUIElement= ruleGUIElement EOF )
            // InternalRsDsl.g:4567:2: iv_ruleGUIElement= ruleGUIElement EOF
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
    // InternalRsDsl.g:4573:1: ruleGUIElement returns [EObject current=null] : ( () otherlv_1= 'GUIElement' ) ;
    public final EObject ruleGUIElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:4579:2: ( ( () otherlv_1= 'GUIElement' ) )
            // InternalRsDsl.g:4580:2: ( () otherlv_1= 'GUIElement' )
            {
            // InternalRsDsl.g:4580:2: ( () otherlv_1= 'GUIElement' )
            // InternalRsDsl.g:4581:3: () otherlv_1= 'GUIElement'
            {
            // InternalRsDsl.g:4581:3: ()
            // InternalRsDsl.g:4582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGUIElementAccess().getGUIElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_2); 

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
    // InternalRsDsl.g:4596:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRsDsl.g:4596:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRsDsl.g:4597:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRsDsl.g:4603:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:4609:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRsDsl.g:4610:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRsDsl.g:4610:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRsDsl.g:4611:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRsDsl.g:4611:3: (kw= '-' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==102) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalRsDsl.g:4612:4: kw= '-'
                    {
                    kw=(Token)match(input,102,FOLLOW_95); 

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
    // InternalRsDsl.g:4629:1: entryRuleUserStudy returns [EObject current=null] : iv_ruleUserStudy= ruleUserStudy EOF ;
    public final EObject entryRuleUserStudy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserStudy = null;


        try {
            // InternalRsDsl.g:4629:50: (iv_ruleUserStudy= ruleUserStudy EOF )
            // InternalRsDsl.g:4630:2: iv_ruleUserStudy= ruleUserStudy EOF
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
    // InternalRsDsl.g:4636:1: ruleUserStudy returns [EObject current=null] : (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' ) ;
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
            // InternalRsDsl.g:4642:2: ( (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' ) )
            // InternalRsDsl.g:4643:2: (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' )
            {
            // InternalRsDsl.g:4643:2: (otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}' )
            // InternalRsDsl.g:4644:3: otherlv_0= 'UserStudy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )? (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUserStudyAccess().getUserStudyKeyword_0());
            		
            // InternalRsDsl.g:4648:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:4649:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:4649:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:4650:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getUserStudyAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,104,FOLLOW_97); 

            			newLeafNode(otherlv_3, grammarAccess.getUserStudyAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:4675:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:4676:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:4676:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:4677:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUserStudyAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_98);
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

            // InternalRsDsl.g:4694:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==34) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalRsDsl.g:4695:4: otherlv_5= 'type' ( (lv_type_6_0= ruleUserStudyType ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_99); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserStudyAccess().getTypeKeyword_5_0());
                    			
                    // InternalRsDsl.g:4699:4: ( (lv_type_6_0= ruleUserStudyType ) )
                    // InternalRsDsl.g:4700:5: (lv_type_6_0= ruleUserStudyType )
                    {
                    // InternalRsDsl.g:4700:5: (lv_type_6_0= ruleUserStudyType )
                    // InternalRsDsl.g:4701:6: lv_type_6_0= ruleUserStudyType
                    {

                    						newCompositeNode(grammarAccess.getUserStudyAccess().getTypeUserStudyTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_100);
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

            // InternalRsDsl.g:4719:3: (otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==105) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalRsDsl.g:4720:4: otherlv_7= 'analysis' ( (lv_analysis_8_0= ruleUserStudyAnalysis ) )
                    {
                    otherlv_7=(Token)match(input,105,FOLLOW_101); 

                    				newLeafNode(otherlv_7, grammarAccess.getUserStudyAccess().getAnalysisKeyword_6_0());
                    			
                    // InternalRsDsl.g:4724:4: ( (lv_analysis_8_0= ruleUserStudyAnalysis ) )
                    // InternalRsDsl.g:4725:5: (lv_analysis_8_0= ruleUserStudyAnalysis )
                    {
                    // InternalRsDsl.g:4725:5: (lv_analysis_8_0= ruleUserStudyAnalysis )
                    // InternalRsDsl.g:4726:6: lv_analysis_8_0= ruleUserStudyAnalysis
                    {

                    						newCompositeNode(grammarAccess.getUserStudyAccess().getAnalysisUserStudyAnalysisEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:4752:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalRsDsl.g:4752:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalRsDsl.g:4753:2: iv_ruleCrossValidation= ruleCrossValidation EOF
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
    // InternalRsDsl.g:4759:1: ruleCrossValidation returns [EObject current=null] : (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' ) ;
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
            // InternalRsDsl.g:4765:2: ( (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' ) )
            // InternalRsDsl.g:4766:2: (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' )
            {
            // InternalRsDsl.g:4766:2: (otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}' )
            // InternalRsDsl.g:4767:3: otherlv_0= 'CrossValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )? (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0());
            		
            // InternalRsDsl.g:4771:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:4772:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:4772:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:4773:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,104,FOLLOW_97); 

            			newLeafNode(otherlv_3, grammarAccess.getCrossValidationAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:4798:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:4799:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:4799:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:4800:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCrossValidationAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_102);
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

            // InternalRsDsl.g:4817:3: (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==28) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalRsDsl.g:4818:4: otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_103); 

                    				newLeafNode(otherlv_5, grammarAccess.getCrossValidationAccess().getLibraryKeyword_5_0());
                    			
                    // InternalRsDsl.g:4822:4: ( (lv_library_6_0= ruleValidationLibrary ) )
                    // InternalRsDsl.g:4823:5: (lv_library_6_0= ruleValidationLibrary )
                    {
                    // InternalRsDsl.g:4823:5: (lv_library_6_0= ruleValidationLibrary )
                    // InternalRsDsl.g:4824:6: lv_library_6_0= ruleValidationLibrary
                    {

                    						newCompositeNode(grammarAccess.getCrossValidationAccess().getLibraryValidationLibraryEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_104);
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

            // InternalRsDsl.g:4842:3: (otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==107) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalRsDsl.g:4843:4: otherlv_7= 'numberOfFold' ( (lv_numberOfFold_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,107,FOLLOW_97); 

                    				newLeafNode(otherlv_7, grammarAccess.getCrossValidationAccess().getNumberOfFoldKeyword_6_0());
                    			
                    // InternalRsDsl.g:4847:4: ( (lv_numberOfFold_8_0= ruleEInt ) )
                    // InternalRsDsl.g:4848:5: (lv_numberOfFold_8_0= ruleEInt )
                    {
                    // InternalRsDsl.g:4848:5: (lv_numberOfFold_8_0= ruleEInt )
                    // InternalRsDsl.g:4849:6: lv_numberOfFold_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCrossValidationAccess().getNumberOfFoldEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_105);
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

            // InternalRsDsl.g:4867:3: (otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==108) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalRsDsl.g:4868:4: otherlv_9= 'groundTruthExtractor' ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) )
                    {
                    otherlv_9=(Token)match(input,108,FOLLOW_106); 

                    				newLeafNode(otherlv_9, grammarAccess.getCrossValidationAccess().getGroundTruthExtractorKeyword_7_0());
                    			
                    // InternalRsDsl.g:4872:4: ( (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction ) )
                    // InternalRsDsl.g:4873:5: (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction )
                    {
                    // InternalRsDsl.g:4873:5: (lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction )
                    // InternalRsDsl.g:4874:6: lv_groundTruthExtractor_10_0= ruleGroundTruthExtraction
                    {

                    						newCompositeNode(grammarAccess.getCrossValidationAccess().getGroundTruthExtractorGroundTruthExtractionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:4900:1: entryRuleContextValidation returns [EObject current=null] : iv_ruleContextValidation= ruleContextValidation EOF ;
    public final EObject entryRuleContextValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextValidation = null;


        try {
            // InternalRsDsl.g:4900:58: (iv_ruleContextValidation= ruleContextValidation EOF )
            // InternalRsDsl.g:4901:2: iv_ruleContextValidation= ruleContextValidation EOF
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
    // InternalRsDsl.g:4907:1: ruleContextValidation returns [EObject current=null] : (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalRsDsl.g:4913:2: ( (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:4914:2: (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:4914:2: (otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:4915:3: otherlv_0= 'ContextValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'testContext' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextValidationAccess().getContextValidationKeyword_0());
            		
            // InternalRsDsl.g:4919:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:4920:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:4920:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:4921:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getContextValidationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,104,FOLLOW_97); 

            			newLeafNode(otherlv_3, grammarAccess.getContextValidationAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:4946:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:4947:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:4947:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:4948:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getContextValidationAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_107);
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

            // InternalRsDsl.g:4965:3: (otherlv_5= 'testContext' ( ( ruleEString ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==110) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalRsDsl.g:4966:4: otherlv_5= 'testContext' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextValidationAccess().getTestContextKeyword_5_0());
                    			
                    // InternalRsDsl.g:4970:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:4971:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:4971:5: ( ruleEString )
                    // InternalRsDsl.g:4972:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextValidationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContextValidationAccess().getTestContextRecommendationContextCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:4995:1: entryRuleRandomSplitting returns [EObject current=null] : iv_ruleRandomSplitting= ruleRandomSplitting EOF ;
    public final EObject entryRuleRandomSplitting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomSplitting = null;


        try {
            // InternalRsDsl.g:4995:56: (iv_ruleRandomSplitting= ruleRandomSplitting EOF )
            // InternalRsDsl.g:4996:2: iv_ruleRandomSplitting= ruleRandomSplitting EOF
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
    // InternalRsDsl.g:5002:1: ruleRandomSplitting returns [EObject current=null] : (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) ;
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
            // InternalRsDsl.g:5008:2: ( (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:5009:2: (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:5009:2: (otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:5010:3: otherlv_0= 'RandomSplitting' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRandomSplittingAccess().getRandomSplittingKeyword_0());
            		
            // InternalRsDsl.g:5014:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:5015:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:5015:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:5016:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getRandomSplittingAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,104,FOLLOW_97); 

            			newLeafNode(otherlv_3, grammarAccess.getRandomSplittingAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:5041:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:5042:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:5042:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:5043:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRandomSplittingAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_108);
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

            // InternalRsDsl.g:5060:3: (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==28) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalRsDsl.g:5061:4: otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_103); 

                    				newLeafNode(otherlv_5, grammarAccess.getRandomSplittingAccess().getLibraryKeyword_5_0());
                    			
                    // InternalRsDsl.g:5065:4: ( (lv_library_6_0= ruleValidationLibrary ) )
                    // InternalRsDsl.g:5066:5: (lv_library_6_0= ruleValidationLibrary )
                    {
                    // InternalRsDsl.g:5066:5: (lv_library_6_0= ruleValidationLibrary )
                    // InternalRsDsl.g:5067:6: lv_library_6_0= ruleValidationLibrary
                    {

                    						newCompositeNode(grammarAccess.getRandomSplittingAccess().getLibraryValidationLibraryEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:5093:1: entryRuleAutomatedValidation_Impl returns [EObject current=null] : iv_ruleAutomatedValidation_Impl= ruleAutomatedValidation_Impl EOF ;
    public final EObject entryRuleAutomatedValidation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomatedValidation_Impl = null;


        try {
            // InternalRsDsl.g:5093:65: (iv_ruleAutomatedValidation_Impl= ruleAutomatedValidation_Impl EOF )
            // InternalRsDsl.g:5094:2: iv_ruleAutomatedValidation_Impl= ruleAutomatedValidation_Impl EOF
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
    // InternalRsDsl.g:5100:1: ruleAutomatedValidation_Impl returns [EObject current=null] : (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) ;
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
            // InternalRsDsl.g:5106:2: ( (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:5107:2: (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:5107:2: (otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:5108:3: otherlv_0= 'AutomatedValidation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nOfRecommendations' ( (lv_nOfRecommendations_4_0= ruleEInt ) ) (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomatedValidation_ImplAccess().getAutomatedValidationKeyword_0());
            		
            // InternalRsDsl.g:5112:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRsDsl.g:5113:4: (lv_name_1_0= ruleEString )
            {
            // InternalRsDsl.g:5113:4: (lv_name_1_0= ruleEString )
            // InternalRsDsl.g:5114:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomatedValidation_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,104,FOLLOW_97); 

            			newLeafNode(otherlv_3, grammarAccess.getAutomatedValidation_ImplAccess().getNOfRecommendationsKeyword_3());
            		
            // InternalRsDsl.g:5139:3: ( (lv_nOfRecommendations_4_0= ruleEInt ) )
            // InternalRsDsl.g:5140:4: (lv_nOfRecommendations_4_0= ruleEInt )
            {
            // InternalRsDsl.g:5140:4: (lv_nOfRecommendations_4_0= ruleEInt )
            // InternalRsDsl.g:5141:5: lv_nOfRecommendations_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAutomatedValidation_ImplAccess().getNOfRecommendationsEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_108);
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

            // InternalRsDsl.g:5158:3: (otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==28) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalRsDsl.g:5159:4: otherlv_5= 'library' ( (lv_library_6_0= ruleValidationLibrary ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_103); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutomatedValidation_ImplAccess().getLibraryKeyword_5_0());
                    			
                    // InternalRsDsl.g:5163:4: ( (lv_library_6_0= ruleValidationLibrary ) )
                    // InternalRsDsl.g:5164:5: (lv_library_6_0= ruleValidationLibrary )
                    {
                    // InternalRsDsl.g:5164:5: (lv_library_6_0= ruleValidationLibrary )
                    // InternalRsDsl.g:5165:6: lv_library_6_0= ruleValidationLibrary
                    {

                    						newCompositeNode(grammarAccess.getAutomatedValidation_ImplAccess().getLibraryValidationLibraryEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:5191:1: entryRuleGroundTruthExtraction returns [EObject current=null] : iv_ruleGroundTruthExtraction= ruleGroundTruthExtraction EOF ;
    public final EObject entryRuleGroundTruthExtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTruthExtraction = null;


        try {
            // InternalRsDsl.g:5191:62: (iv_ruleGroundTruthExtraction= ruleGroundTruthExtraction EOF )
            // InternalRsDsl.g:5192:2: iv_ruleGroundTruthExtraction= ruleGroundTruthExtraction EOF
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
    // InternalRsDsl.g:5198:1: ruleGroundTruthExtraction returns [EObject current=null] : ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
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
            // InternalRsDsl.g:5204:2: ( ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalRsDsl.g:5205:2: ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalRsDsl.g:5205:2: ( () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalRsDsl.g:5206:3: () otherlv_1= 'GroundTruthExtraction' otherlv_2= '{' (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )? (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalRsDsl.g:5206:3: ()
            // InternalRsDsl.g:5207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroundTruthExtractionAccess().getGroundTruthExtractionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGroundTruthExtractionAccess().getGroundTruthExtractionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_109); 

            			newLeafNode(otherlv_2, grammarAccess.getGroundTruthExtractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:5221:3: (otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==114) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalRsDsl.g:5222:4: otherlv_3= 'sizeGT' ( (lv_sizeGT_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,114,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGroundTruthExtractionAccess().getSizeGTKeyword_3_0());
                    			
                    // InternalRsDsl.g:5226:4: ( (lv_sizeGT_4_0= ruleEString ) )
                    // InternalRsDsl.g:5227:5: (lv_sizeGT_4_0= ruleEString )
                    {
                    // InternalRsDsl.g:5227:5: (lv_sizeGT_4_0= ruleEString )
                    // InternalRsDsl.g:5228:6: lv_sizeGT_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getSizeGTEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_110);
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

            // InternalRsDsl.g:5246:3: (otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==115) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalRsDsl.g:5247:4: otherlv_5= 'splittingRules' otherlv_6= '{' ( (lv_splittingRules_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,115,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGroundTruthExtractionAccess().getSplittingRulesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGroundTruthExtractionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRsDsl.g:5255:4: ( (lv_splittingRules_7_0= ruleEString ) )
                    // InternalRsDsl.g:5256:5: (lv_splittingRules_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:5256:5: (lv_splittingRules_7_0= ruleEString )
                    // InternalRsDsl.g:5257:6: lv_splittingRules_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getSplittingRulesEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:5274:4: (otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==23) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalRsDsl.g:5275:5: otherlv_8= ',' ( (lv_splittingRules_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getGroundTruthExtractionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRsDsl.g:5279:5: ( (lv_splittingRules_9_0= ruleEString ) )
                    	    // InternalRsDsl.g:5280:6: (lv_splittingRules_9_0= ruleEString )
                    	    {
                    	    // InternalRsDsl.g:5280:6: (lv_splittingRules_9_0= ruleEString )
                    	    // InternalRsDsl.g:5281:7: lv_splittingRules_9_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getSplittingRulesEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_111); 

                    				newLeafNode(otherlv_10, grammarAccess.getGroundTruthExtractionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:5304:3: (otherlv_11= 'targetVariable' ( ( ruleEString ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==116) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalRsDsl.g:5305:4: otherlv_11= 'targetVariable' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,116,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getGroundTruthExtractionAccess().getTargetVariableKeyword_5_0());
                    			
                    // InternalRsDsl.g:5309:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:5310:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:5310:5: ( ruleEString )
                    // InternalRsDsl.g:5311:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGroundTruthExtractionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGroundTruthExtractionAccess().getTargetVariableVariableCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:5334:1: entryRuleRecommendationSetting returns [EObject current=null] : iv_ruleRecommendationSetting= ruleRecommendationSetting EOF ;
    public final EObject entryRuleRecommendationSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecommendationSetting = null;


        try {
            // InternalRsDsl.g:5334:62: (iv_ruleRecommendationSetting= ruleRecommendationSetting EOF )
            // InternalRsDsl.g:5335:2: iv_ruleRecommendationSetting= ruleRecommendationSetting EOF
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
    // InternalRsDsl.g:5341:1: ruleRecommendationSetting returns [EObject current=null] : (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalRsDsl.g:5347:2: ( (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalRsDsl.g:5348:2: (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalRsDsl.g:5348:2: (otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalRsDsl.g:5349:3: otherlv_0= 'RecommendationSetting' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,117,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecommendationSettingAccess().getRecommendationSettingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_112); 

            			newLeafNode(otherlv_1, grammarAccess.getRecommendationSettingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,118,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRecommendationSettingAccess().getKeyKeyword_2());
            		
            // InternalRsDsl.g:5361:3: ( (lv_key_3_0= ruleEString ) )
            // InternalRsDsl.g:5362:4: (lv_key_3_0= ruleEString )
            {
            // InternalRsDsl.g:5362:4: (lv_key_3_0= ruleEString )
            // InternalRsDsl.g:5363:5: lv_key_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecommendationSettingAccess().getKeyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_113);
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

            otherlv_4=(Token)match(input,119,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRecommendationSettingAccess().getValueKeyword_4());
            		
            // InternalRsDsl.g:5384:3: ( (lv_value_5_0= ruleEString ) )
            // InternalRsDsl.g:5385:4: (lv_value_5_0= ruleEString )
            {
            // InternalRsDsl.g:5385:4: (lv_value_5_0= ruleEString )
            // InternalRsDsl.g:5386:5: lv_value_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecommendationSettingAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:5411:1: entryRuleMachineLearningBasedRS_Impl returns [EObject current=null] : iv_ruleMachineLearningBasedRS_Impl= ruleMachineLearningBasedRS_Impl EOF ;
    public final EObject entryRuleMachineLearningBasedRS_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachineLearningBasedRS_Impl = null;


        try {
            // InternalRsDsl.g:5411:68: (iv_ruleMachineLearningBasedRS_Impl= ruleMachineLearningBasedRS_Impl EOF )
            // InternalRsDsl.g:5412:2: iv_ruleMachineLearningBasedRS_Impl= ruleMachineLearningBasedRS_Impl EOF
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
    // InternalRsDsl.g:5418:1: ruleMachineLearningBasedRS_Impl returns [EObject current=null] : ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
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
            // InternalRsDsl.g:5424:2: ( ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:5425:2: ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:5425:2: ( () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:5426:3: () otherlv_1= 'MachineLearningBasedRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:5426:3: ()
            // InternalRsDsl.g:5427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMachineLearningBasedRS_ImplAccess().getMachineLearningBasedRSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,120,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMachineLearningBasedRS_ImplAccess().getMachineLearningBasedRSKeyword_1());
            		
            // InternalRsDsl.g:5437:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:5438:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:5438:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:5439:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_3, grammarAccess.getMachineLearningBasedRS_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:5460:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==121) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalRsDsl.g:5461:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getMachineLearningBasedRS_ImplAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:5465:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:5466:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:5466:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:5467:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_116);
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

            // InternalRsDsl.g:5485:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==122) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalRsDsl.g:5486:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getMachineLearningBasedRS_ImplAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:5490:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:5491:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5491:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:5492:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_117);
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

            // InternalRsDsl.g:5510:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==123) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalRsDsl.g:5511:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getMachineLearningBasedRS_ImplAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:5515:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:5516:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5516:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:5517:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_118);
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

            // InternalRsDsl.g:5535:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==124) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalRsDsl.g:5536:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getMachineLearningBasedRS_ImplAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:5540:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:5541:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5541:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:5542:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:5560:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==125) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalRsDsl.g:5561:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getMachineLearningBasedRS_ImplAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_13, grammarAccess.getMachineLearningBasedRS_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:5569:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:5570:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:5570:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:5571:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:5588:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==23) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalRsDsl.g:5589:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMachineLearningBasedRS_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:5593:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:5594:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:5594:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:5595:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop114;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_17, grammarAccess.getMachineLearningBasedRS_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:5618:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==126) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalRsDsl.g:5619:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_18, grammarAccess.getMachineLearningBasedRS_ImplAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:5623:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:5624:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:5624:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:5625:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:5643:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==88) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalRsDsl.g:5644:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getMachineLearningBasedRS_ImplAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:5648:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:5649:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:5649:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:5650:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getMachineLearningBasedRS_ImplAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:5676:1: entryRuleFilteringRS returns [EObject current=null] : iv_ruleFilteringRS= ruleFilteringRS EOF ;
    public final EObject entryRuleFilteringRS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteringRS = null;


        try {
            // InternalRsDsl.g:5676:52: (iv_ruleFilteringRS= ruleFilteringRS EOF )
            // InternalRsDsl.g:5677:2: iv_ruleFilteringRS= ruleFilteringRS EOF
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
    // InternalRsDsl.g:5683:1: ruleFilteringRS returns [EObject current=null] : ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
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
            // InternalRsDsl.g:5689:2: ( ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:5690:2: ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:5690:2: ( () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:5691:3: () otherlv_1= 'FilteringRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )? (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )? (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )? (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:5691:3: ()
            // InternalRsDsl.g:5692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilteringRSAccess().getFilteringRSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,127,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFilteringRSAccess().getFilteringRSKeyword_1());
            		
            // InternalRsDsl.g:5702:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:5703:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:5703:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:5704:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_124); 

            			newLeafNode(otherlv_3, grammarAccess.getFilteringRSAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:5725:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==121) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalRsDsl.g:5726:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getFilteringRSAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:5730:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:5731:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:5731:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:5732:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_125);
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

            // InternalRsDsl.g:5750:3: (otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==128) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalRsDsl.g:5751:4: otherlv_6= 'filteringRSAlgorithm' ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) )
                    {
                    otherlv_6=(Token)match(input,128,FOLLOW_126); 

                    				newLeafNode(otherlv_6, grammarAccess.getFilteringRSAccess().getFilteringRSAlgorithmKeyword_5_0());
                    			
                    // InternalRsDsl.g:5755:4: ( (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm ) )
                    // InternalRsDsl.g:5756:5: (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm )
                    {
                    // InternalRsDsl.g:5756:5: (lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm )
                    // InternalRsDsl.g:5757:6: lv_filteringRSAlgorithm_7_0= ruleFilteringRSAlgorithm
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getFilteringRSAlgorithmFilteringRSAlgorithmEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_127);
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

            // InternalRsDsl.g:5775:3: (otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==129) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalRsDsl.g:5776:4: otherlv_8= 'similarityCalculator' ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) )
                    {
                    otherlv_8=(Token)match(input,129,FOLLOW_128); 

                    				newLeafNode(otherlv_8, grammarAccess.getFilteringRSAccess().getSimilarityCalculatorKeyword_6_0());
                    			
                    // InternalRsDsl.g:5780:4: ( (lv_similarityCalculator_9_0= ruleSimilarityFunction ) )
                    // InternalRsDsl.g:5781:5: (lv_similarityCalculator_9_0= ruleSimilarityFunction )
                    {
                    // InternalRsDsl.g:5781:5: (lv_similarityCalculator_9_0= ruleSimilarityFunction )
                    // InternalRsDsl.g:5782:6: lv_similarityCalculator_9_0= ruleSimilarityFunction
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getSimilarityCalculatorSimilarityFunctionEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_129);
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

            // InternalRsDsl.g:5800:3: (otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==130) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalRsDsl.g:5801:4: otherlv_10= 'cutoff' ( (lv_cutoff_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,130,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getFilteringRSAccess().getCutoffKeyword_7_0());
                    			
                    // InternalRsDsl.g:5805:4: ( (lv_cutoff_11_0= ruleEInt ) )
                    // InternalRsDsl.g:5806:5: (lv_cutoff_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5806:5: (lv_cutoff_11_0= ruleEInt )
                    // InternalRsDsl.g:5807:6: lv_cutoff_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getCutoffEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_130);
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

            // InternalRsDsl.g:5825:3: (otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==131) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalRsDsl.g:5826:4: otherlv_12= 'neighborhood' ( (lv_neighborhood_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,131,FOLLOW_97); 

                    				newLeafNode(otherlv_12, grammarAccess.getFilteringRSAccess().getNeighborhoodKeyword_8_0());
                    			
                    // InternalRsDsl.g:5830:4: ( (lv_neighborhood_13_0= ruleEInt ) )
                    // InternalRsDsl.g:5831:5: (lv_neighborhood_13_0= ruleEInt )
                    {
                    // InternalRsDsl.g:5831:5: (lv_neighborhood_13_0= ruleEInt )
                    // InternalRsDsl.g:5832:6: lv_neighborhood_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getNeighborhoodEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:5850:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==125) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalRsDsl.g:5851:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getFilteringRSAccess().getSettingsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_15, grammarAccess.getFilteringRSAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRsDsl.g:5859:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:5860:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:5860:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:5861:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getSettingsRecommendationSettingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:5878:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==23) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalRsDsl.g:5879:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getFilteringRSAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRsDsl.g:5883:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:5884:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:5884:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:5885:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getFilteringRSAccess().getSettingsRecommendationSettingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_19, grammarAccess.getFilteringRSAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:5908:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==126) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalRsDsl.g:5909:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_20, grammarAccess.getFilteringRSAccess().getScopeKeyword_10_0());
                    			
                    // InternalRsDsl.g:5913:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:5914:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:5914:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:5915:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getScopeRecommendedItemParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:5933:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==88) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalRsDsl.g:5934:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_22, grammarAccess.getFilteringRSAccess().getContextKeyword_11_0());
                    			
                    // InternalRsDsl.g:5938:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:5939:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:5939:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:5940:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getFilteringRSAccess().getContextRecommendationContextParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_24=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:5966:1: entryRuleDataMiningRS returns [EObject current=null] : iv_ruleDataMiningRS= ruleDataMiningRS EOF ;
    public final EObject entryRuleDataMiningRS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMiningRS = null;


        try {
            // InternalRsDsl.g:5966:53: (iv_ruleDataMiningRS= ruleDataMiningRS EOF )
            // InternalRsDsl.g:5967:2: iv_ruleDataMiningRS= ruleDataMiningRS EOF
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
    // InternalRsDsl.g:5973:1: ruleDataMiningRS returns [EObject current=null] : ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' ) ;
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
            // InternalRsDsl.g:5979:2: ( ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' ) )
            // InternalRsDsl.g:5980:2: ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' )
            {
            // InternalRsDsl.g:5980:2: ( () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}' )
            // InternalRsDsl.g:5981:3: () otherlv_1= 'DataMiningRS' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )? (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )? (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )? (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )? otherlv_18= '}'
            {
            // InternalRsDsl.g:5981:3: ()
            // InternalRsDsl.g:5982:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataMiningRSAccess().getDataMiningRSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,132,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataMiningRSAccess().getDataMiningRSKeyword_1());
            		
            // InternalRsDsl.g:5992:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:5993:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:5993:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:5994:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_131); 

            			newLeafNode(otherlv_3, grammarAccess.getDataMiningRSAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6015:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==121) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalRsDsl.g:6016:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataMiningRSAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6020:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6021:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6021:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6022:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_132);
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

            // InternalRsDsl.g:6040:3: (otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==133) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalRsDsl.g:6041:4: otherlv_6= 'dataMiningRSAlgorithm' ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) )
                    {
                    otherlv_6=(Token)match(input,133,FOLLOW_133); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataMiningRSAccess().getDataMiningRSAlgorithmKeyword_5_0());
                    			
                    // InternalRsDsl.g:6045:4: ( (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm ) )
                    // InternalRsDsl.g:6046:5: (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm )
                    {
                    // InternalRsDsl.g:6046:5: (lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm )
                    // InternalRsDsl.g:6047:6: lv_dataMiningRSAlgorithm_7_0= ruleDataMiningRSAlgorithm
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getDataMiningRSAlgorithmDataMiningRSAlgorithmEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:6065:3: (otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==125) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalRsDsl.g:6066:4: otherlv_8= 'settings' otherlv_9= '{' ( (lv_settings_10_0= ruleRecommendationSetting ) ) (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataMiningRSAccess().getSettingsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataMiningRSAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:6074:4: ( (lv_settings_10_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:6075:5: (lv_settings_10_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:6075:5: (lv_settings_10_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:6076:6: lv_settings_10_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getSettingsRecommendationSettingParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:6093:4: (otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==23) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // InternalRsDsl.g:6094:5: otherlv_11= ',' ( (lv_settings_12_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_11=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDataMiningRSAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:6098:5: ( (lv_settings_12_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:6099:6: (lv_settings_12_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:6099:6: (lv_settings_12_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6100:7: lv_settings_12_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataMiningRSAccess().getSettingsRecommendationSettingParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop129;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataMiningRSAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6123:3: (otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==126) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalRsDsl.g:6124:4: otherlv_14= 'scope' ( (lv_scope_15_0= ruleRecommendedItem ) )
                    {
                    otherlv_14=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_14, grammarAccess.getDataMiningRSAccess().getScopeKeyword_7_0());
                    			
                    // InternalRsDsl.g:6128:4: ( (lv_scope_15_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6129:5: (lv_scope_15_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6129:5: (lv_scope_15_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6130:6: lv_scope_15_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getScopeRecommendedItemParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:6148:3: (otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==88) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalRsDsl.g:6149:4: otherlv_16= 'context' ( (lv_context_17_0= ruleRecommendationContext ) )
                    {
                    otherlv_16=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getDataMiningRSAccess().getContextKeyword_8_0());
                    			
                    // InternalRsDsl.g:6153:4: ( (lv_context_17_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6154:5: (lv_context_17_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6154:5: (lv_context_17_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6155:6: lv_context_17_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getDataMiningRSAccess().getContextRecommendationContextParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:6181:1: entryRuleCustomRecommender returns [EObject current=null] : iv_ruleCustomRecommender= ruleCustomRecommender EOF ;
    public final EObject entryRuleCustomRecommender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomRecommender = null;


        try {
            // InternalRsDsl.g:6181:58: (iv_ruleCustomRecommender= ruleCustomRecommender EOF )
            // InternalRsDsl.g:6182:2: iv_ruleCustomRecommender= ruleCustomRecommender EOF
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
    // InternalRsDsl.g:6188:1: ruleCustomRecommender returns [EObject current=null] : ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
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
            // InternalRsDsl.g:6194:2: ( ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:6195:2: ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:6195:2: ( () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:6196:3: () otherlv_1= 'CustomRecommender' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:6196:3: ()
            // InternalRsDsl.g:6197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomRecommenderAccess().getCustomRecommenderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,134,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomRecommenderAccess().getCustomRecommenderKeyword_1());
            		
            // InternalRsDsl.g:6207:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:6208:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:6208:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:6209:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_134); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomRecommenderAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6230:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==121) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalRsDsl.g:6231:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomRecommenderAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6235:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6236:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6236:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6237:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_135);
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

            // InternalRsDsl.g:6255:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==135) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalRsDsl.g:6256:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,135,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomRecommenderAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalRsDsl.g:6260:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalRsDsl.g:6261:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:6261:5: (lv_description_7_0= ruleEString )
                    // InternalRsDsl.g:6262:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_136);
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

            // InternalRsDsl.g:6280:3: (otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==136) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalRsDsl.g:6281:4: otherlv_8= 'requiredTools' otherlv_9= '{' ( (lv_requiredTools_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,136,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getCustomRecommenderAccess().getRequiredToolsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCustomRecommenderAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRsDsl.g:6289:4: ( (lv_requiredTools_10_0= ruleEString ) )
                    // InternalRsDsl.g:6290:5: (lv_requiredTools_10_0= ruleEString )
                    {
                    // InternalRsDsl.g:6290:5: (lv_requiredTools_10_0= ruleEString )
                    // InternalRsDsl.g:6291:6: lv_requiredTools_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getRequiredToolsEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:6308:4: (otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==23) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalRsDsl.g:6309:5: otherlv_11= ',' ( (lv_requiredTools_12_0= ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCustomRecommenderAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRsDsl.g:6313:5: ( (lv_requiredTools_12_0= ruleEString ) )
                    	    // InternalRsDsl.g:6314:6: (lv_requiredTools_12_0= ruleEString )
                    	    {
                    	    // InternalRsDsl.g:6314:6: (lv_requiredTools_12_0= ruleEString )
                    	    // InternalRsDsl.g:6315:7: lv_requiredTools_12_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomRecommenderAccess().getRequiredToolsEStringParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_119); 

                    				newLeafNode(otherlv_13, grammarAccess.getCustomRecommenderAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6338:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==125) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalRsDsl.g:6339:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getCustomRecommenderAccess().getSettingsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_15, grammarAccess.getCustomRecommenderAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRsDsl.g:6347:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:6348:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:6348:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:6349:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getSettingsRecommendationSettingParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:6366:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==23) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalRsDsl.g:6367:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getCustomRecommenderAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRsDsl.g:6371:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:6372:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:6372:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6373:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomRecommenderAccess().getSettingsRecommendationSettingParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_19, grammarAccess.getCustomRecommenderAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6396:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==126) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalRsDsl.g:6397:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_20, grammarAccess.getCustomRecommenderAccess().getScopeKeyword_8_0());
                    			
                    // InternalRsDsl.g:6401:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6402:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6402:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6403:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getScopeRecommendedItemParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:6421:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==88) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalRsDsl.g:6422:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_22, grammarAccess.getCustomRecommenderAccess().getContextKeyword_9_0());
                    			
                    // InternalRsDsl.g:6426:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6427:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6427:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6428:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getCustomRecommenderAccess().getContextRecommendationContextParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_24=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:6454:1: entryRuleGeneticAlgorithm returns [EObject current=null] : iv_ruleGeneticAlgorithm= ruleGeneticAlgorithm EOF ;
    public final EObject entryRuleGeneticAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneticAlgorithm = null;


        try {
            // InternalRsDsl.g:6454:57: (iv_ruleGeneticAlgorithm= ruleGeneticAlgorithm EOF )
            // InternalRsDsl.g:6455:2: iv_ruleGeneticAlgorithm= ruleGeneticAlgorithm EOF
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
    // InternalRsDsl.g:6461:1: ruleGeneticAlgorithm returns [EObject current=null] : ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
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
            // InternalRsDsl.g:6467:2: ( ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:6468:2: ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:6468:2: ( () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:6469:3: () otherlv_1= 'GeneticAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )? (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )? (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:6469:3: ()
            // InternalRsDsl.g:6470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeneticAlgorithmAccess().getGeneticAlgorithmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,137,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneticAlgorithmAccess().getGeneticAlgorithmKeyword_1());
            		
            // InternalRsDsl.g:6480:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:6481:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:6481:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:6482:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_137); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneticAlgorithmAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6503:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==121) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalRsDsl.g:6504:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getGeneticAlgorithmAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6508:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6509:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6509:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6510:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_138);
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

            // InternalRsDsl.g:6528:3: (otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==138) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalRsDsl.g:6529:4: otherlv_6= 'fitnessFunction' ( (lv_fitnessFunction_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,138,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGeneticAlgorithmAccess().getFitnessFunctionKeyword_5_0());
                    			
                    // InternalRsDsl.g:6533:4: ( (lv_fitnessFunction_7_0= ruleEString ) )
                    // InternalRsDsl.g:6534:5: (lv_fitnessFunction_7_0= ruleEString )
                    {
                    // InternalRsDsl.g:6534:5: (lv_fitnessFunction_7_0= ruleEString )
                    // InternalRsDsl.g:6535:6: lv_fitnessFunction_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getFitnessFunctionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_139);
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

            // InternalRsDsl.g:6553:3: (otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==139) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalRsDsl.g:6554:4: otherlv_8= 'searchStrategy' ( (lv_searchStrategy_9_0= ruleSearchStrategy ) )
                    {
                    otherlv_8=(Token)match(input,139,FOLLOW_140); 

                    				newLeafNode(otherlv_8, grammarAccess.getGeneticAlgorithmAccess().getSearchStrategyKeyword_6_0());
                    			
                    // InternalRsDsl.g:6558:4: ( (lv_searchStrategy_9_0= ruleSearchStrategy ) )
                    // InternalRsDsl.g:6559:5: (lv_searchStrategy_9_0= ruleSearchStrategy )
                    {
                    // InternalRsDsl.g:6559:5: (lv_searchStrategy_9_0= ruleSearchStrategy )
                    // InternalRsDsl.g:6560:6: lv_searchStrategy_9_0= ruleSearchStrategy
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getSearchStrategySearchStrategyEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_141);
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

            // InternalRsDsl.g:6578:3: (otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==140) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalRsDsl.g:6579:4: otherlv_10= 'mutationOperator' ( (lv_mutationOperator_11_0= ruleMutationOperation ) )
                    {
                    otherlv_10=(Token)match(input,140,FOLLOW_142); 

                    				newLeafNode(otherlv_10, grammarAccess.getGeneticAlgorithmAccess().getMutationOperatorKeyword_7_0());
                    			
                    // InternalRsDsl.g:6583:4: ( (lv_mutationOperator_11_0= ruleMutationOperation ) )
                    // InternalRsDsl.g:6584:5: (lv_mutationOperator_11_0= ruleMutationOperation )
                    {
                    // InternalRsDsl.g:6584:5: (lv_mutationOperator_11_0= ruleMutationOperation )
                    // InternalRsDsl.g:6585:6: lv_mutationOperator_11_0= ruleMutationOperation
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getMutationOperatorMutationOperationEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:6603:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==125) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalRsDsl.g:6604:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getGeneticAlgorithmAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_13, grammarAccess.getGeneticAlgorithmAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:6612:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:6613:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:6613:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:6614:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:6631:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==23) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalRsDsl.g:6632:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGeneticAlgorithmAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:6636:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:6637:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:6637:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6638:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_17, grammarAccess.getGeneticAlgorithmAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6661:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==126) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalRsDsl.g:6662:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_18, grammarAccess.getGeneticAlgorithmAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:6666:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6667:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6667:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6668:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:6686:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==88) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalRsDsl.g:6687:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getGeneticAlgorithmAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:6691:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6692:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6692:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6693:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getGeneticAlgorithmAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:6719:1: entryRuleDeepNN returns [EObject current=null] : iv_ruleDeepNN= ruleDeepNN EOF ;
    public final EObject entryRuleDeepNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeepNN = null;


        try {
            // InternalRsDsl.g:6719:47: (iv_ruleDeepNN= ruleDeepNN EOF )
            // InternalRsDsl.g:6720:2: iv_ruleDeepNN= ruleDeepNN EOF
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
    // InternalRsDsl.g:6726:1: ruleDeepNN returns [EObject current=null] : ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
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
            // InternalRsDsl.g:6732:2: ( ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:6733:2: ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:6733:2: ( () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:6734:3: () otherlv_1= 'DeepNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:6734:3: ()
            // InternalRsDsl.g:6735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeepNNAccess().getDeepNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,141,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeepNNAccess().getDeepNNKeyword_1());
            		
            // InternalRsDsl.g:6745:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:6746:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:6746:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:6747:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_143); 

            			newLeafNode(otherlv_3, grammarAccess.getDeepNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:6768:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==121) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalRsDsl.g:6769:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeepNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:6773:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:6774:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:6774:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:6775:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_144);
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

            // InternalRsDsl.g:6793:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==122) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalRsDsl.g:6794:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeepNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:6798:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:6799:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6799:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:6800:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_145);
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

            // InternalRsDsl.g:6818:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==123) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalRsDsl.g:6819:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeepNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:6823:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:6824:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6824:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:6825:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_146);
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

            // InternalRsDsl.g:6843:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==124) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalRsDsl.g:6844:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeepNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:6848:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:6849:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6849:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:6850:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_147);
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

            // InternalRsDsl.g:6868:3: (otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==142) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalRsDsl.g:6869:4: otherlv_12= 'numHiddenLayer' ( (lv_numHiddenLayer_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,142,FOLLOW_97); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeepNNAccess().getNumHiddenLayerKeyword_8_0());
                    			
                    // InternalRsDsl.g:6873:4: ( (lv_numHiddenLayer_13_0= ruleEInt ) )
                    // InternalRsDsl.g:6874:5: (lv_numHiddenLayer_13_0= ruleEInt )
                    {
                    // InternalRsDsl.g:6874:5: (lv_numHiddenLayer_13_0= ruleEInt )
                    // InternalRsDsl.g:6875:6: lv_numHiddenLayer_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getNumHiddenLayerEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:6893:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==125) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalRsDsl.g:6894:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getDeepNNAccess().getSettingsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_15, grammarAccess.getDeepNNAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRsDsl.g:6902:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:6903:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:6903:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:6904:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getSettingsRecommendationSettingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:6921:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==23) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // InternalRsDsl.g:6922:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getDeepNNAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRsDsl.g:6926:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:6927:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:6927:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:6928:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeepNNAccess().getSettingsRecommendationSettingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop154;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_19, grammarAccess.getDeepNNAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:6951:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==126) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalRsDsl.g:6952:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_20, grammarAccess.getDeepNNAccess().getScopeKeyword_10_0());
                    			
                    // InternalRsDsl.g:6956:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:6957:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:6957:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:6958:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getScopeRecommendedItemParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:6976:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==88) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalRsDsl.g:6977:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_22, grammarAccess.getDeepNNAccess().getContextKeyword_11_0());
                    			
                    // InternalRsDsl.g:6981:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:6982:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:6982:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:6983:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getDeepNNAccess().getContextRecommendationContextParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_24=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:7009:1: entryRuleConvolutionalNN returns [EObject current=null] : iv_ruleConvolutionalNN= ruleConvolutionalNN EOF ;
    public final EObject entryRuleConvolutionalNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvolutionalNN = null;


        try {
            // InternalRsDsl.g:7009:56: (iv_ruleConvolutionalNN= ruleConvolutionalNN EOF )
            // InternalRsDsl.g:7010:2: iv_ruleConvolutionalNN= ruleConvolutionalNN EOF
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
    // InternalRsDsl.g:7016:1: ruleConvolutionalNN returns [EObject current=null] : ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
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
            // InternalRsDsl.g:7022:2: ( ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:7023:2: ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:7023:2: ( () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:7024:3: () otherlv_1= 'ConvolutionalNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:7024:3: ()
            // InternalRsDsl.g:7025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConvolutionalNNAccess().getConvolutionalNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,143,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConvolutionalNNAccess().getConvolutionalNNKeyword_1());
            		
            // InternalRsDsl.g:7035:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:7036:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:7036:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:7037:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_3, grammarAccess.getConvolutionalNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:7058:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==121) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalRsDsl.g:7059:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getConvolutionalNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:7063:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:7064:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:7064:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:7065:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_116);
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

            // InternalRsDsl.g:7083:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==122) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalRsDsl.g:7084:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getConvolutionalNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:7088:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:7089:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7089:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:7090:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_117);
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

            // InternalRsDsl.g:7108:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==123) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalRsDsl.g:7109:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getConvolutionalNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7113:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7114:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7114:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7115:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_118);
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

            // InternalRsDsl.g:7133:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==124) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalRsDsl.g:7134:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getConvolutionalNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7138:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7139:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7139:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7140:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:7158:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==125) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalRsDsl.g:7159:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getConvolutionalNNAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_13, grammarAccess.getConvolutionalNNAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:7167:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7168:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7168:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7169:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:7186:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==23) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // InternalRsDsl.g:7187:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getConvolutionalNNAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:7191:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:7192:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:7192:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:7193:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getConvolutionalNNAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop162;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_17, grammarAccess.getConvolutionalNNAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:7216:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==126) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalRsDsl.g:7217:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_18, grammarAccess.getConvolutionalNNAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:7221:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:7222:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:7222:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:7223:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:7241:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==88) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalRsDsl.g:7242:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getConvolutionalNNAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:7246:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:7247:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:7247:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:7248:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getConvolutionalNNAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:7274:1: entryRuleBayesian returns [EObject current=null] : iv_ruleBayesian= ruleBayesian EOF ;
    public final EObject entryRuleBayesian() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBayesian = null;


        try {
            // InternalRsDsl.g:7274:49: (iv_ruleBayesian= ruleBayesian EOF )
            // InternalRsDsl.g:7275:2: iv_ruleBayesian= ruleBayesian EOF
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
    // InternalRsDsl.g:7281:1: ruleBayesian returns [EObject current=null] : ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
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
            // InternalRsDsl.g:7287:2: ( ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:7288:2: ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:7288:2: ( () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:7289:3: () otherlv_1= 'Bayesian' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:7289:3: ()
            // InternalRsDsl.g:7290:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBayesianAccess().getBayesianAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,144,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBayesianAccess().getBayesianKeyword_1());
            		
            // InternalRsDsl.g:7300:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:7301:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:7301:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:7302:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_3, grammarAccess.getBayesianAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:7323:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==121) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalRsDsl.g:7324:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getBayesianAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:7328:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:7329:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:7329:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:7330:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_116);
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

            // InternalRsDsl.g:7348:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==122) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalRsDsl.g:7349:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getBayesianAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:7353:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:7354:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7354:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:7355:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_117);
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

            // InternalRsDsl.g:7373:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==123) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalRsDsl.g:7374:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getBayesianAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7378:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7379:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7379:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7380:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_118);
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

            // InternalRsDsl.g:7398:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==124) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalRsDsl.g:7399:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getBayesianAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7403:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7404:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7404:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7405:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:7423:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==125) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalRsDsl.g:7424:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getBayesianAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_13, grammarAccess.getBayesianAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:7432:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7433:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7433:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7434:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:7451:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop170:
                    do {
                        int alt170=2;
                        int LA170_0 = input.LA(1);

                        if ( (LA170_0==23) ) {
                            alt170=1;
                        }


                        switch (alt170) {
                    	case 1 :
                    	    // InternalRsDsl.g:7452:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getBayesianAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:7456:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:7457:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:7457:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:7458:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getBayesianAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop170;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_17, grammarAccess.getBayesianAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:7481:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==126) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalRsDsl.g:7482:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_18, grammarAccess.getBayesianAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:7486:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:7487:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:7487:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:7488:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:7506:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==88) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalRsDsl.g:7507:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getBayesianAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:7511:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:7512:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:7512:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:7513:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getBayesianAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:7539:1: entryRuleRecurrentNN returns [EObject current=null] : iv_ruleRecurrentNN= ruleRecurrentNN EOF ;
    public final EObject entryRuleRecurrentNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecurrentNN = null;


        try {
            // InternalRsDsl.g:7539:52: (iv_ruleRecurrentNN= ruleRecurrentNN EOF )
            // InternalRsDsl.g:7540:2: iv_ruleRecurrentNN= ruleRecurrentNN EOF
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
    // InternalRsDsl.g:7546:1: ruleRecurrentNN returns [EObject current=null] : ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
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
            // InternalRsDsl.g:7552:2: ( ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:7553:2: ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:7553:2: ( () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:7554:3: () otherlv_1= 'RecurrentNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:7554:3: ()
            // InternalRsDsl.g:7555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecurrentNNAccess().getRecurrentNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,145,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRecurrentNNAccess().getRecurrentNNKeyword_1());
            		
            // InternalRsDsl.g:7565:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:7566:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:7566:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:7567:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_3, grammarAccess.getRecurrentNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:7588:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==121) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalRsDsl.g:7589:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getRecurrentNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:7593:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:7594:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:7594:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:7595:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_116);
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

            // InternalRsDsl.g:7613:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==122) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalRsDsl.g:7614:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getRecurrentNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:7618:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:7619:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7619:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:7620:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_117);
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

            // InternalRsDsl.g:7638:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==123) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalRsDsl.g:7639:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecurrentNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7643:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7644:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7644:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7645:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_118);
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

            // InternalRsDsl.g:7663:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==124) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalRsDsl.g:7664:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecurrentNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7668:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7669:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7669:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7670:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:7688:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==125) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalRsDsl.g:7689:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getRecurrentNNAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_13, grammarAccess.getRecurrentNNAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:7697:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7698:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7698:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7699:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:7716:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop178:
                    do {
                        int alt178=2;
                        int LA178_0 = input.LA(1);

                        if ( (LA178_0==23) ) {
                            alt178=1;
                        }


                        switch (alt178) {
                    	case 1 :
                    	    // InternalRsDsl.g:7717:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRecurrentNNAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:7721:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:7722:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:7722:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:7723:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecurrentNNAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop178;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_17, grammarAccess.getRecurrentNNAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:7746:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==126) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalRsDsl.g:7747:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_18, grammarAccess.getRecurrentNNAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:7751:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:7752:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:7752:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:7753:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:7771:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==88) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // InternalRsDsl.g:7772:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getRecurrentNNAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:7776:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:7777:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:7777:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:7778:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getRecurrentNNAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:7804:1: entryRuleSVM returns [EObject current=null] : iv_ruleSVM= ruleSVM EOF ;
    public final EObject entryRuleSVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM = null;


        try {
            // InternalRsDsl.g:7804:44: (iv_ruleSVM= ruleSVM EOF )
            // InternalRsDsl.g:7805:2: iv_ruleSVM= ruleSVM EOF
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
    // InternalRsDsl.g:7811:1: ruleSVM returns [EObject current=null] : ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) ;
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
            // InternalRsDsl.g:7817:2: ( ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' ) )
            // InternalRsDsl.g:7818:2: ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            {
            // InternalRsDsl.g:7818:2: ( () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}' )
            // InternalRsDsl.g:7819:3: () otherlv_1= 'SVM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )? (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )? (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )? (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )? otherlv_24= '}'
            {
            // InternalRsDsl.g:7819:3: ()
            // InternalRsDsl.g:7820:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSVMAccess().getSVMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,146,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSVMAccess().getSVMKeyword_1());
            		
            // InternalRsDsl.g:7830:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:7831:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:7831:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:7832:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_148); 

            			newLeafNode(otherlv_3, grammarAccess.getSVMAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:7853:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==121) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalRsDsl.g:7854:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getSVMAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:7858:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:7859:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:7859:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:7860:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_149);
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

            // InternalRsDsl.g:7878:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==122) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalRsDsl.g:7879:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getSVMAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:7883:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:7884:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7884:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:7885:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_150);
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

            // InternalRsDsl.g:7903:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==123) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // InternalRsDsl.g:7904:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getSVMAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:7908:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:7909:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7909:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:7910:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_151);
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

            // InternalRsDsl.g:7928:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==124) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalRsDsl.g:7929:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getSVMAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:7933:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:7934:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:7934:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:7935:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_152);
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

            // InternalRsDsl.g:7953:3: (otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) ) )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==147) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // InternalRsDsl.g:7954:4: otherlv_12= 'kernel' ( (lv_kernel_13_0= ruleKernelType ) )
                    {
                    otherlv_12=(Token)match(input,147,FOLLOW_153); 

                    				newLeafNode(otherlv_12, grammarAccess.getSVMAccess().getKernelKeyword_8_0());
                    			
                    // InternalRsDsl.g:7958:4: ( (lv_kernel_13_0= ruleKernelType ) )
                    // InternalRsDsl.g:7959:5: (lv_kernel_13_0= ruleKernelType )
                    {
                    // InternalRsDsl.g:7959:5: (lv_kernel_13_0= ruleKernelType )
                    // InternalRsDsl.g:7960:6: lv_kernel_13_0= ruleKernelType
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getKernelKernelTypeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:7978:3: (otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}' )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==125) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // InternalRsDsl.g:7979:4: otherlv_14= 'settings' otherlv_15= '{' ( (lv_settings_16_0= ruleRecommendationSetting ) ) (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getSVMAccess().getSettingsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_15, grammarAccess.getSVMAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRsDsl.g:7987:4: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:7988:5: (lv_settings_16_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:7988:5: (lv_settings_16_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:7989:6: lv_settings_16_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getSettingsRecommendationSettingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:8006:4: (otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) ) )*
                    loop187:
                    do {
                        int alt187=2;
                        int LA187_0 = input.LA(1);

                        if ( (LA187_0==23) ) {
                            alt187=1;
                        }


                        switch (alt187) {
                    	case 1 :
                    	    // InternalRsDsl.g:8007:5: otherlv_17= ',' ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSVMAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRsDsl.g:8011:5: ( (lv_settings_18_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:8012:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:8012:6: (lv_settings_18_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:8013:7: lv_settings_18_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getSVMAccess().getSettingsRecommendationSettingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop187;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_19, grammarAccess.getSVMAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:8036:3: (otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) ) )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==126) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalRsDsl.g:8037:4: otherlv_20= 'scope' ( (lv_scope_21_0= ruleRecommendedItem ) )
                    {
                    otherlv_20=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_20, grammarAccess.getSVMAccess().getScopeKeyword_10_0());
                    			
                    // InternalRsDsl.g:8041:4: ( (lv_scope_21_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8042:5: (lv_scope_21_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8042:5: (lv_scope_21_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8043:6: lv_scope_21_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getScopeRecommendedItemParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:8061:3: (otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) ) )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==88) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalRsDsl.g:8062:4: otherlv_22= 'context' ( (lv_context_23_0= ruleRecommendationContext ) )
                    {
                    otherlv_22=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_22, grammarAccess.getSVMAccess().getContextKeyword_11_0());
                    			
                    // InternalRsDsl.g:8066:4: ( (lv_context_23_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:8067:5: (lv_context_23_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:8067:5: (lv_context_23_0= ruleRecommendationContext )
                    // InternalRsDsl.g:8068:6: lv_context_23_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getContextRecommendationContextParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_24=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:8094:1: entryRuleDecisionTree returns [EObject current=null] : iv_ruleDecisionTree= ruleDecisionTree EOF ;
    public final EObject entryRuleDecisionTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionTree = null;


        try {
            // InternalRsDsl.g:8094:53: (iv_ruleDecisionTree= ruleDecisionTree EOF )
            // InternalRsDsl.g:8095:2: iv_ruleDecisionTree= ruleDecisionTree EOF
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
    // InternalRsDsl.g:8101:1: ruleDecisionTree returns [EObject current=null] : ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) ;
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
            // InternalRsDsl.g:8107:2: ( ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' ) )
            // InternalRsDsl.g:8108:2: ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            {
            // InternalRsDsl.g:8108:2: ( () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}' )
            // InternalRsDsl.g:8109:3: () otherlv_1= 'DecisionTree' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )? (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )? (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )? otherlv_22= '}'
            {
            // InternalRsDsl.g:8109:3: ()
            // InternalRsDsl.g:8110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecisionTreeAccess().getDecisionTreeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,148,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionTreeAccess().getDecisionTreeKeyword_1());
            		
            // InternalRsDsl.g:8120:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:8121:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:8121:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:8122:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_114); 

            			newLeafNode(otherlv_3, grammarAccess.getDecisionTreeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:8143:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==121) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalRsDsl.g:8144:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getDecisionTreeAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:8148:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:8149:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:8149:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:8150:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_116);
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

            // InternalRsDsl.g:8168:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==122) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // InternalRsDsl.g:8169:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getDecisionTreeAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:8173:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:8174:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8174:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:8175:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_117);
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

            // InternalRsDsl.g:8193:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==123) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalRsDsl.g:8194:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getDecisionTreeAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:8198:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:8199:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8199:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:8200:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_118);
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

            // InternalRsDsl.g:8218:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==124) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // InternalRsDsl.g:8219:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getDecisionTreeAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:8223:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:8224:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8224:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:8225:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:8243:3: (otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}' )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==125) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // InternalRsDsl.g:8244:4: otherlv_12= 'settings' otherlv_13= '{' ( (lv_settings_14_0= ruleRecommendationSetting ) ) (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getDecisionTreeAccess().getSettingsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_13, grammarAccess.getDecisionTreeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRsDsl.g:8252:4: ( (lv_settings_14_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:8253:5: (lv_settings_14_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:8253:5: (lv_settings_14_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:8254:6: lv_settings_14_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getSettingsRecommendationSettingParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:8271:4: (otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) ) )*
                    loop195:
                    do {
                        int alt195=2;
                        int LA195_0 = input.LA(1);

                        if ( (LA195_0==23) ) {
                            alt195=1;
                        }


                        switch (alt195) {
                    	case 1 :
                    	    // InternalRsDsl.g:8272:5: otherlv_15= ',' ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_15=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getDecisionTreeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRsDsl.g:8276:5: ( (lv_settings_16_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:8277:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:8277:6: (lv_settings_16_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:8278:7: lv_settings_16_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getDecisionTreeAccess().getSettingsRecommendationSettingParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop195;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_17, grammarAccess.getDecisionTreeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:8301:3: (otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) ) )?
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( (LA197_0==126) ) {
                alt197=1;
            }
            switch (alt197) {
                case 1 :
                    // InternalRsDsl.g:8302:4: otherlv_18= 'scope' ( (lv_scope_19_0= ruleRecommendedItem ) )
                    {
                    otherlv_18=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_18, grammarAccess.getDecisionTreeAccess().getScopeKeyword_9_0());
                    			
                    // InternalRsDsl.g:8306:4: ( (lv_scope_19_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8307:5: (lv_scope_19_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8307:5: (lv_scope_19_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8308:6: lv_scope_19_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getScopeRecommendedItemParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:8326:3: (otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) ) )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==88) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // InternalRsDsl.g:8327:4: otherlv_20= 'context' ( (lv_context_21_0= ruleRecommendationContext ) )
                    {
                    otherlv_20=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getDecisionTreeAccess().getContextKeyword_10_0());
                    			
                    // InternalRsDsl.g:8331:4: ( (lv_context_21_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:8332:5: (lv_context_21_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:8332:5: (lv_context_21_0= ruleRecommendationContext )
                    // InternalRsDsl.g:8333:6: lv_context_21_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getDecisionTreeAccess().getContextRecommendationContextParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:8359:1: entryRuleFeedForwardNN returns [EObject current=null] : iv_ruleFeedForwardNN= ruleFeedForwardNN EOF ;
    public final EObject entryRuleFeedForwardNN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedForwardNN = null;


        try {
            // InternalRsDsl.g:8359:54: (iv_ruleFeedForwardNN= ruleFeedForwardNN EOF )
            // InternalRsDsl.g:8360:2: iv_ruleFeedForwardNN= ruleFeedForwardNN EOF
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
    // InternalRsDsl.g:8366:1: ruleFeedForwardNN returns [EObject current=null] : ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' ) ;
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
            // InternalRsDsl.g:8372:2: ( ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' ) )
            // InternalRsDsl.g:8373:2: ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' )
            {
            // InternalRsDsl.g:8373:2: ( () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}' )
            // InternalRsDsl.g:8374:3: () otherlv_1= 'FeedForwardNN' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )? (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )? (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )? (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )? (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )? (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )? (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )? (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )? (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )? (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )? (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )? otherlv_30= '}'
            {
            // InternalRsDsl.g:8374:3: ()
            // InternalRsDsl.g:8375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeedForwardNNAccess().getFeedForwardNNAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,149,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFeedForwardNNAccess().getFeedForwardNNKeyword_1());
            		
            // InternalRsDsl.g:8385:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRsDsl.g:8386:4: (lv_name_2_0= ruleEString )
            {
            // InternalRsDsl.g:8386:4: (lv_name_2_0= ruleEString )
            // InternalRsDsl.g:8387:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_154); 

            			newLeafNode(otherlv_3, grammarAccess.getFeedForwardNNAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRsDsl.g:8408:3: (otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) ) )?
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==121) ) {
                alt199=1;
            }
            switch (alt199) {
                case 1 :
                    // InternalRsDsl.g:8409:4: otherlv_4= 'generator' ( (lv_generator_5_0= rulePyLibType ) )
                    {
                    otherlv_4=(Token)match(input,121,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getFeedForwardNNAccess().getGeneratorKeyword_4_0());
                    			
                    // InternalRsDsl.g:8413:4: ( (lv_generator_5_0= rulePyLibType ) )
                    // InternalRsDsl.g:8414:5: (lv_generator_5_0= rulePyLibType )
                    {
                    // InternalRsDsl.g:8414:5: (lv_generator_5_0= rulePyLibType )
                    // InternalRsDsl.g:8415:6: lv_generator_5_0= rulePyLibType
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getGeneratorPyLibTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_155);
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

            // InternalRsDsl.g:8433:3: (otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) ) )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==122) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // InternalRsDsl.g:8434:4: otherlv_6= 'numEpochs' ( (lv_numEpochs_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,122,FOLLOW_97); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeedForwardNNAccess().getNumEpochsKeyword_5_0());
                    			
                    // InternalRsDsl.g:8438:4: ( (lv_numEpochs_7_0= ruleEInt ) )
                    // InternalRsDsl.g:8439:5: (lv_numEpochs_7_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8439:5: (lv_numEpochs_7_0= ruleEInt )
                    // InternalRsDsl.g:8440:6: lv_numEpochs_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getNumEpochsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_156);
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

            // InternalRsDsl.g:8458:3: (otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) ) )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==123) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // InternalRsDsl.g:8459:4: otherlv_8= 'learningRate' ( (lv_learningRate_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,123,FOLLOW_97); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeedForwardNNAccess().getLearningRateKeyword_6_0());
                    			
                    // InternalRsDsl.g:8463:4: ( (lv_learningRate_9_0= ruleEInt ) )
                    // InternalRsDsl.g:8464:5: (lv_learningRate_9_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8464:5: (lv_learningRate_9_0= ruleEInt )
                    // InternalRsDsl.g:8465:6: lv_learningRate_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getLearningRateEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_157);
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

            // InternalRsDsl.g:8483:3: (otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) ) )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==124) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // InternalRsDsl.g:8484:4: otherlv_10= 'miniBatchSize' ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,124,FOLLOW_97); 

                    				newLeafNode(otherlv_10, grammarAccess.getFeedForwardNNAccess().getMiniBatchSizeKeyword_7_0());
                    			
                    // InternalRsDsl.g:8488:4: ( (lv_miniBatchSize_11_0= ruleEInt ) )
                    // InternalRsDsl.g:8489:5: (lv_miniBatchSize_11_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8489:5: (lv_miniBatchSize_11_0= ruleEInt )
                    // InternalRsDsl.g:8490:6: lv_miniBatchSize_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getMiniBatchSizeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_158);
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

            // InternalRsDsl.g:8508:3: (otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) ) )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==150) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // InternalRsDsl.g:8509:4: otherlv_12= 'solver' ( (lv_solver_13_0= ruleSolverType ) )
                    {
                    otherlv_12=(Token)match(input,150,FOLLOW_159); 

                    				newLeafNode(otherlv_12, grammarAccess.getFeedForwardNNAccess().getSolverKeyword_8_0());
                    			
                    // InternalRsDsl.g:8513:4: ( (lv_solver_13_0= ruleSolverType ) )
                    // InternalRsDsl.g:8514:5: (lv_solver_13_0= ruleSolverType )
                    {
                    // InternalRsDsl.g:8514:5: (lv_solver_13_0= ruleSolverType )
                    // InternalRsDsl.g:8515:6: lv_solver_13_0= ruleSolverType
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getSolverSolverTypeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_160);
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

            // InternalRsDsl.g:8533:3: (otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) ) )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==151) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // InternalRsDsl.g:8534:4: otherlv_14= 'alpha' ( (lv_alpha_15_0= ruleEFloat ) )
                    {
                    otherlv_14=(Token)match(input,151,FOLLOW_161); 

                    				newLeafNode(otherlv_14, grammarAccess.getFeedForwardNNAccess().getAlphaKeyword_9_0());
                    			
                    // InternalRsDsl.g:8538:4: ( (lv_alpha_15_0= ruleEFloat ) )
                    // InternalRsDsl.g:8539:5: (lv_alpha_15_0= ruleEFloat )
                    {
                    // InternalRsDsl.g:8539:5: (lv_alpha_15_0= ruleEFloat )
                    // InternalRsDsl.g:8540:6: lv_alpha_15_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getAlphaEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_162);
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

            // InternalRsDsl.g:8558:3: (otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) ) )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==152) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalRsDsl.g:8559:4: otherlv_16= 'activationFunction' ( (lv_activationFunction_17_0= ruleActivationType ) )
                    {
                    otherlv_16=(Token)match(input,152,FOLLOW_163); 

                    				newLeafNode(otherlv_16, grammarAccess.getFeedForwardNNAccess().getActivationFunctionKeyword_10_0());
                    			
                    // InternalRsDsl.g:8563:4: ( (lv_activationFunction_17_0= ruleActivationType ) )
                    // InternalRsDsl.g:8564:5: (lv_activationFunction_17_0= ruleActivationType )
                    {
                    // InternalRsDsl.g:8564:5: (lv_activationFunction_17_0= ruleActivationType )
                    // InternalRsDsl.g:8565:6: lv_activationFunction_17_0= ruleActivationType
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getActivationFunctionActivationTypeEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_164);
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

            // InternalRsDsl.g:8583:3: (otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) ) )?
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( (LA206_0==153) ) {
                alt206=1;
            }
            switch (alt206) {
                case 1 :
                    // InternalRsDsl.g:8584:4: otherlv_18= 'randomState' ( (lv_randomState_19_0= ruleEInt ) )
                    {
                    otherlv_18=(Token)match(input,153,FOLLOW_97); 

                    				newLeafNode(otherlv_18, grammarAccess.getFeedForwardNNAccess().getRandomStateKeyword_11_0());
                    			
                    // InternalRsDsl.g:8588:4: ( (lv_randomState_19_0= ruleEInt ) )
                    // InternalRsDsl.g:8589:5: (lv_randomState_19_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8589:5: (lv_randomState_19_0= ruleEInt )
                    // InternalRsDsl.g:8590:6: lv_randomState_19_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getRandomStateEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_119);
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

            // InternalRsDsl.g:8608:3: (otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}' )?
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==125) ) {
                alt208=1;
            }
            switch (alt208) {
                case 1 :
                    // InternalRsDsl.g:8609:4: otherlv_20= 'settings' otherlv_21= '{' ( (lv_settings_22_0= ruleRecommendationSetting ) ) (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,125,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getFeedForwardNNAccess().getSettingsKeyword_12_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_120); 

                    				newLeafNode(otherlv_21, grammarAccess.getFeedForwardNNAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalRsDsl.g:8617:4: ( (lv_settings_22_0= ruleRecommendationSetting ) )
                    // InternalRsDsl.g:8618:5: (lv_settings_22_0= ruleRecommendationSetting )
                    {
                    // InternalRsDsl.g:8618:5: (lv_settings_22_0= ruleRecommendationSetting )
                    // InternalRsDsl.g:8619:6: lv_settings_22_0= ruleRecommendationSetting
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getSettingsRecommendationSettingParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_83);
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

                    // InternalRsDsl.g:8636:4: (otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) ) )*
                    loop207:
                    do {
                        int alt207=2;
                        int LA207_0 = input.LA(1);

                        if ( (LA207_0==23) ) {
                            alt207=1;
                        }


                        switch (alt207) {
                    	case 1 :
                    	    // InternalRsDsl.g:8637:5: otherlv_23= ',' ( (lv_settings_24_0= ruleRecommendationSetting ) )
                    	    {
                    	    otherlv_23=(Token)match(input,23,FOLLOW_120); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getFeedForwardNNAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalRsDsl.g:8641:5: ( (lv_settings_24_0= ruleRecommendationSetting ) )
                    	    // InternalRsDsl.g:8642:6: (lv_settings_24_0= ruleRecommendationSetting )
                    	    {
                    	    // InternalRsDsl.g:8642:6: (lv_settings_24_0= ruleRecommendationSetting )
                    	    // InternalRsDsl.g:8643:7: lv_settings_24_0= ruleRecommendationSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeedForwardNNAccess().getSettingsRecommendationSettingParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
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
                    	    break loop207;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_121); 

                    				newLeafNode(otherlv_25, grammarAccess.getFeedForwardNNAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:8666:3: (otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) ) )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==126) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // InternalRsDsl.g:8667:4: otherlv_26= 'scope' ( (lv_scope_27_0= ruleRecommendedItem ) )
                    {
                    otherlv_26=(Token)match(input,126,FOLLOW_122); 

                    				newLeafNode(otherlv_26, grammarAccess.getFeedForwardNNAccess().getScopeKeyword_13_0());
                    			
                    // InternalRsDsl.g:8671:4: ( (lv_scope_27_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8672:5: (lv_scope_27_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8672:5: (lv_scope_27_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8673:6: lv_scope_27_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getScopeRecommendedItemParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalRsDsl.g:8691:3: (otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) ) )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==88) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // InternalRsDsl.g:8692:4: otherlv_28= 'context' ( (lv_context_29_0= ruleRecommendationContext ) )
                    {
                    otherlv_28=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_28, grammarAccess.getFeedForwardNNAccess().getContextKeyword_14_0());
                    			
                    // InternalRsDsl.g:8696:4: ( (lv_context_29_0= ruleRecommendationContext ) )
                    // InternalRsDsl.g:8697:5: (lv_context_29_0= ruleRecommendationContext )
                    {
                    // InternalRsDsl.g:8697:5: (lv_context_29_0= ruleRecommendationContext )
                    // InternalRsDsl.g:8698:6: lv_context_29_0= ruleRecommendationContext
                    {

                    						newCompositeNode(grammarAccess.getFeedForwardNNAccess().getContextRecommendationContextParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_30=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:8724:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRsDsl.g:8724:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRsDsl.g:8725:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalRsDsl.g:8731:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRsDsl.g:8737:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRsDsl.g:8738:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRsDsl.g:8738:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRsDsl.g:8739:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRsDsl.g:8739:3: (kw= '-' )?
            int alt211=2;
            int LA211_0 = input.LA(1);

            if ( (LA211_0==102) ) {
                alt211=1;
            }
            switch (alt211) {
                case 1 :
                    // InternalRsDsl.g:8740:4: kw= '-'
                    {
                    kw=(Token)match(input,102,FOLLOW_165); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRsDsl.g:8746:3: (this_INT_1= RULE_INT )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==RULE_INT) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // InternalRsDsl.g:8747:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_166); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,154,FOLLOW_95); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_167); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalRsDsl.g:8767:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( ((LA215_0>=155 && LA215_0<=156)) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // InternalRsDsl.g:8768:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRsDsl.g:8768:4: (kw= 'E' | kw= 'e' )
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==155) ) {
                        alt213=1;
                    }
                    else if ( (LA213_0==156) ) {
                        alt213=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 213, 0, input);

                        throw nvae;
                    }
                    switch (alt213) {
                        case 1 :
                            // InternalRsDsl.g:8769:5: kw= 'E'
                            {
                            kw=(Token)match(input,155,FOLLOW_97); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRsDsl.g:8775:5: kw= 'e'
                            {
                            kw=(Token)match(input,156,FOLLOW_97); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRsDsl.g:8781:4: (kw= '-' )?
                    int alt214=2;
                    int LA214_0 = input.LA(1);

                    if ( (LA214_0==102) ) {
                        alt214=1;
                    }
                    switch (alt214) {
                        case 1 :
                            // InternalRsDsl.g:8782:5: kw= '-'
                            {
                            kw=(Token)match(input,102,FOLLOW_95); 

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
    // InternalRsDsl.g:8800:1: entryRuleImplicitFeedback returns [EObject current=null] : iv_ruleImplicitFeedback= ruleImplicitFeedback EOF ;
    public final EObject entryRuleImplicitFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitFeedback = null;


        try {
            // InternalRsDsl.g:8800:57: (iv_ruleImplicitFeedback= ruleImplicitFeedback EOF )
            // InternalRsDsl.g:8801:2: iv_ruleImplicitFeedback= ruleImplicitFeedback EOF
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
    // InternalRsDsl.g:8807:1: ruleImplicitFeedback returns [EObject current=null] : ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleImplicitFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_item_4_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8813:2: ( ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) )
            // InternalRsDsl.g:8814:2: ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            {
            // InternalRsDsl.g:8814:2: ( () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            // InternalRsDsl.g:8815:3: () otherlv_1= 'ImplicitFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}'
            {
            // InternalRsDsl.g:8815:3: ()
            // InternalRsDsl.g:8816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplicitFeedbackAccess().getImplicitFeedbackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,157,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImplicitFeedbackAccess().getImplicitFeedbackKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_168); 

            			newLeafNode(otherlv_2, grammarAccess.getImplicitFeedbackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:8830:3: (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )?
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==158) ) {
                alt216=1;
            }
            switch (alt216) {
                case 1 :
                    // InternalRsDsl.g:8831:4: otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) )
                    {
                    otherlv_3=(Token)match(input,158,FOLLOW_122); 

                    				newLeafNode(otherlv_3, grammarAccess.getImplicitFeedbackAccess().getItemKeyword_3_0());
                    			
                    // InternalRsDsl.g:8835:4: ( (lv_item_4_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8836:5: (lv_item_4_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8836:5: (lv_item_4_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8837:6: lv_item_4_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getImplicitFeedbackAccess().getItemRecommendedItemParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:8863:1: entryRuleHybridFeedback returns [EObject current=null] : iv_ruleHybridFeedback= ruleHybridFeedback EOF ;
    public final EObject entryRuleHybridFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridFeedback = null;


        try {
            // InternalRsDsl.g:8863:55: (iv_ruleHybridFeedback= ruleHybridFeedback EOF )
            // InternalRsDsl.g:8864:2: iv_ruleHybridFeedback= ruleHybridFeedback EOF
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
    // InternalRsDsl.g:8870:1: ruleHybridFeedback returns [EObject current=null] : ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleHybridFeedback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_item_4_0 = null;



        	enterRule();

        try {
            // InternalRsDsl.g:8876:2: ( ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' ) )
            // InternalRsDsl.g:8877:2: ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            {
            // InternalRsDsl.g:8877:2: ( () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}' )
            // InternalRsDsl.g:8878:3: () otherlv_1= 'HybridFeedback' otherlv_2= '{' (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )? otherlv_5= '}'
            {
            // InternalRsDsl.g:8878:3: ()
            // InternalRsDsl.g:8879:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHybridFeedbackAccess().getHybridFeedbackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,159,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHybridFeedbackAccess().getHybridFeedbackKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_168); 

            			newLeafNode(otherlv_2, grammarAccess.getHybridFeedbackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:8893:3: (otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) ) )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==158) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // InternalRsDsl.g:8894:4: otherlv_3= 'item' ( (lv_item_4_0= ruleRecommendedItem ) )
                    {
                    otherlv_3=(Token)match(input,158,FOLLOW_122); 

                    				newLeafNode(otherlv_3, grammarAccess.getHybridFeedbackAccess().getItemKeyword_3_0());
                    			
                    // InternalRsDsl.g:8898:4: ( (lv_item_4_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:8899:5: (lv_item_4_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:8899:5: (lv_item_4_0= ruleRecommendedItem )
                    // InternalRsDsl.g:8900:6: lv_item_4_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getHybridFeedbackAccess().getItemRecommendedItemParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:8926:1: entryRuleAdditiveFeedback returns [EObject current=null] : iv_ruleAdditiveFeedback= ruleAdditiveFeedback EOF ;
    public final EObject entryRuleAdditiveFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveFeedback = null;


        try {
            // InternalRsDsl.g:8926:57: (iv_ruleAdditiveFeedback= ruleAdditiveFeedback EOF )
            // InternalRsDsl.g:8927:2: iv_ruleAdditiveFeedback= ruleAdditiveFeedback EOF
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
    // InternalRsDsl.g:8933:1: ruleAdditiveFeedback returns [EObject current=null] : ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' ) ;
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
            // InternalRsDsl.g:8939:2: ( ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' ) )
            // InternalRsDsl.g:8940:2: ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' )
            {
            // InternalRsDsl.g:8940:2: ( () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}' )
            // InternalRsDsl.g:8941:3: () otherlv_1= 'AdditiveFeedback' otherlv_2= '{' (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )? (otherlv_5= 'recommender' ( ( ruleEString ) ) )? (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )? otherlv_9= '}'
            {
            // InternalRsDsl.g:8941:3: ()
            // InternalRsDsl.g:8942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAdditiveFeedbackAccess().getAdditiveFeedbackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,160,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditiveFeedbackAccess().getAdditiveFeedbackKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_169); 

            			newLeafNode(otherlv_2, grammarAccess.getAdditiveFeedbackAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:8956:3: (otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) ) )?
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==161) ) {
                alt218=1;
            }
            switch (alt218) {
                case 1 :
                    // InternalRsDsl.g:8957:4: otherlv_3= 'numOfInsertion' ( (lv_numOfInsertion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,161,FOLLOW_97); 

                    				newLeafNode(otherlv_3, grammarAccess.getAdditiveFeedbackAccess().getNumOfInsertionKeyword_3_0());
                    			
                    // InternalRsDsl.g:8961:4: ( (lv_numOfInsertion_4_0= ruleEInt ) )
                    // InternalRsDsl.g:8962:5: (lv_numOfInsertion_4_0= ruleEInt )
                    {
                    // InternalRsDsl.g:8962:5: (lv_numOfInsertion_4_0= ruleEInt )
                    // InternalRsDsl.g:8963:6: lv_numOfInsertion_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAdditiveFeedbackAccess().getNumOfInsertionEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_170);
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

            // InternalRsDsl.g:8981:3: (otherlv_5= 'recommender' ( ( ruleEString ) ) )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==162) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // InternalRsDsl.g:8982:4: otherlv_5= 'recommender' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,162,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAdditiveFeedbackAccess().getRecommenderKeyword_4_0());
                    			
                    // InternalRsDsl.g:8986:4: ( ( ruleEString ) )
                    // InternalRsDsl.g:8987:5: ( ruleEString )
                    {
                    // InternalRsDsl.g:8987:5: ( ruleEString )
                    // InternalRsDsl.g:8988:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditiveFeedbackRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAdditiveFeedbackAccess().getRecommenderRecommendationSystemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_168);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRsDsl.g:9003:3: (otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) ) )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==158) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // InternalRsDsl.g:9004:4: otherlv_7= 'item' ( (lv_item_8_0= ruleRecommendedItem ) )
                    {
                    otherlv_7=(Token)match(input,158,FOLLOW_122); 

                    				newLeafNode(otherlv_7, grammarAccess.getAdditiveFeedbackAccess().getItemKeyword_5_0());
                    			
                    // InternalRsDsl.g:9008:4: ( (lv_item_8_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:9009:5: (lv_item_8_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:9009:5: (lv_item_8_0= ruleRecommendedItem )
                    // InternalRsDsl.g:9010:6: lv_item_8_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getAdditiveFeedbackAccess().getItemRecommendedItemParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:9036:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalRsDsl.g:9036:47: (iv_ruleRating= ruleRating EOF )
            // InternalRsDsl.g:9037:2: iv_ruleRating= ruleRating EOF
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
    // InternalRsDsl.g:9043:1: ruleRating returns [EObject current=null] : ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' ) ;
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
            // InternalRsDsl.g:9049:2: ( ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' ) )
            // InternalRsDsl.g:9050:2: ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' )
            {
            // InternalRsDsl.g:9050:2: ( () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}' )
            // InternalRsDsl.g:9051:3: () otherlv_1= 'Rating' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )? (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )? otherlv_7= '}'
            {
            // InternalRsDsl.g:9051:3: ()
            // InternalRsDsl.g:9052:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRatingAccess().getRatingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,163,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getRatingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_171); 

            			newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRsDsl.g:9066:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) ) )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==34) ) {
                alt221=1;
            }
            switch (alt221) {
                case 1 :
                    // InternalRsDsl.g:9067:4: otherlv_3= 'type' ( (lv_type_4_0= ruleRatingType ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_172); 

                    				newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getTypeKeyword_3_0());
                    			
                    // InternalRsDsl.g:9071:4: ( (lv_type_4_0= ruleRatingType ) )
                    // InternalRsDsl.g:9072:5: (lv_type_4_0= ruleRatingType )
                    {
                    // InternalRsDsl.g:9072:5: (lv_type_4_0= ruleRatingType )
                    // InternalRsDsl.g:9073:6: lv_type_4_0= ruleRatingType
                    {

                    						newCompositeNode(grammarAccess.getRatingAccess().getTypeRatingTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_168);
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

            // InternalRsDsl.g:9091:3: (otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) ) )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==158) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // InternalRsDsl.g:9092:4: otherlv_5= 'item' ( (lv_item_6_0= ruleRecommendedItem ) )
                    {
                    otherlv_5=(Token)match(input,158,FOLLOW_122); 

                    				newLeafNode(otherlv_5, grammarAccess.getRatingAccess().getItemKeyword_4_0());
                    			
                    // InternalRsDsl.g:9096:4: ( (lv_item_6_0= ruleRecommendedItem ) )
                    // InternalRsDsl.g:9097:5: (lv_item_6_0= ruleRecommendedItem )
                    {
                    // InternalRsDsl.g:9097:5: (lv_item_6_0= ruleRecommendedItem )
                    // InternalRsDsl.g:9098:6: lv_item_6_0= ruleRecommendedItem
                    {

                    						newCompositeNode(grammarAccess.getRatingAccess().getItemRecommendedItemParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRsDsl.g:9124:1: rulePreprocessingTechnique returns [Enumerator current=null] : ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) ) ;
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
            // InternalRsDsl.g:9130:2: ( ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) ) )
            // InternalRsDsl.g:9131:2: ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) )
            {
            // InternalRsDsl.g:9131:2: ( (enumLiteral_0= 'DUPLICATES_REMOVAL' ) | (enumLiteral_1= 'NLP' ) | (enumLiteral_2= 'NORMALIZATION' ) | (enumLiteral_3= 'MISSING_DATA_MANIPULATION' ) | (enumLiteral_4= 'VECTORIZATION' ) | (enumLiteral_5= 'FEATURE_SCALING' ) | (enumLiteral_6= 'TFIDF' ) )
            int alt223=7;
            switch ( input.LA(1) ) {
            case 164:
                {
                alt223=1;
                }
                break;
            case 165:
                {
                alt223=2;
                }
                break;
            case 166:
                {
                alt223=3;
                }
                break;
            case 167:
                {
                alt223=4;
                }
                break;
            case 168:
                {
                alt223=5;
                }
                break;
            case 169:
                {
                alt223=6;
                }
                break;
            case 170:
                {
                alt223=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 0, input);

                throw nvae;
            }

            switch (alt223) {
                case 1 :
                    // InternalRsDsl.g:9132:3: (enumLiteral_0= 'DUPLICATES_REMOVAL' )
                    {
                    // InternalRsDsl.g:9132:3: (enumLiteral_0= 'DUPLICATES_REMOVAL' )
                    // InternalRsDsl.g:9133:4: enumLiteral_0= 'DUPLICATES_REMOVAL'
                    {
                    enumLiteral_0=(Token)match(input,164,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getDUPLICATES_REMOVALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPreprocessingTechniqueAccess().getDUPLICATES_REMOVALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9140:3: (enumLiteral_1= 'NLP' )
                    {
                    // InternalRsDsl.g:9140:3: (enumLiteral_1= 'NLP' )
                    // InternalRsDsl.g:9141:4: enumLiteral_1= 'NLP'
                    {
                    enumLiteral_1=(Token)match(input,165,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getNLPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPreprocessingTechniqueAccess().getNLPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9148:3: (enumLiteral_2= 'NORMALIZATION' )
                    {
                    // InternalRsDsl.g:9148:3: (enumLiteral_2= 'NORMALIZATION' )
                    // InternalRsDsl.g:9149:4: enumLiteral_2= 'NORMALIZATION'
                    {
                    enumLiteral_2=(Token)match(input,166,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getNORMALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPreprocessingTechniqueAccess().getNORMALIZATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9156:3: (enumLiteral_3= 'MISSING_DATA_MANIPULATION' )
                    {
                    // InternalRsDsl.g:9156:3: (enumLiteral_3= 'MISSING_DATA_MANIPULATION' )
                    // InternalRsDsl.g:9157:4: enumLiteral_3= 'MISSING_DATA_MANIPULATION'
                    {
                    enumLiteral_3=(Token)match(input,167,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getMISSING_DATA_MANIPULATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPreprocessingTechniqueAccess().getMISSING_DATA_MANIPULATIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9164:3: (enumLiteral_4= 'VECTORIZATION' )
                    {
                    // InternalRsDsl.g:9164:3: (enumLiteral_4= 'VECTORIZATION' )
                    // InternalRsDsl.g:9165:4: enumLiteral_4= 'VECTORIZATION'
                    {
                    enumLiteral_4=(Token)match(input,168,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getVECTORIZATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPreprocessingTechniqueAccess().getVECTORIZATIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9172:3: (enumLiteral_5= 'FEATURE_SCALING' )
                    {
                    // InternalRsDsl.g:9172:3: (enumLiteral_5= 'FEATURE_SCALING' )
                    // InternalRsDsl.g:9173:4: enumLiteral_5= 'FEATURE_SCALING'
                    {
                    enumLiteral_5=(Token)match(input,169,FOLLOW_2); 

                    				current = grammarAccess.getPreprocessingTechniqueAccess().getFEATURE_SCALINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPreprocessingTechniqueAccess().getFEATURE_SCALINGEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:9180:3: (enumLiteral_6= 'TFIDF' )
                    {
                    // InternalRsDsl.g:9180:3: (enumLiteral_6= 'TFIDF' )
                    // InternalRsDsl.g:9181:4: enumLiteral_6= 'TFIDF'
                    {
                    enumLiteral_6=(Token)match(input,170,FOLLOW_2); 

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
    // InternalRsDsl.g:9191:1: ruleDatasetManipulationLibrary returns [Enumerator current=null] : ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) ) ;
    public final Enumerator ruleDatasetManipulationLibrary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9197:2: ( ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) ) )
            // InternalRsDsl.g:9198:2: ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) )
            {
            // InternalRsDsl.g:9198:2: ( (enumLiteral_0= 'PANDAS' ) | (enumLiteral_1= 'NUMPY' ) )
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==171) ) {
                alt224=1;
            }
            else if ( (LA224_0==172) ) {
                alt224=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 224, 0, input);

                throw nvae;
            }
            switch (alt224) {
                case 1 :
                    // InternalRsDsl.g:9199:3: (enumLiteral_0= 'PANDAS' )
                    {
                    // InternalRsDsl.g:9199:3: (enumLiteral_0= 'PANDAS' )
                    // InternalRsDsl.g:9200:4: enumLiteral_0= 'PANDAS'
                    {
                    enumLiteral_0=(Token)match(input,171,FOLLOW_2); 

                    				current = grammarAccess.getDatasetManipulationLibraryAccess().getPANDASEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatasetManipulationLibraryAccess().getPANDASEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9207:3: (enumLiteral_1= 'NUMPY' )
                    {
                    // InternalRsDsl.g:9207:3: (enumLiteral_1= 'NUMPY' )
                    // InternalRsDsl.g:9208:4: enumLiteral_1= 'NUMPY'
                    {
                    enumLiteral_1=(Token)match(input,172,FOLLOW_2); 

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
    // InternalRsDsl.g:9218:1: ruleVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) ) ;
    public final Enumerator ruleVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9224:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) ) )
            // InternalRsDsl.g:9225:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) )
            {
            // InternalRsDsl.g:9225:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'CategoricalData' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Float' ) )
            int alt225=5;
            switch ( input.LA(1) ) {
            case 173:
                {
                alt225=1;
                }
                break;
            case 174:
                {
                alt225=2;
                }
                break;
            case 175:
                {
                alt225=3;
                }
                break;
            case 176:
                {
                alt225=4;
                }
                break;
            case 177:
                {
                alt225=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 225, 0, input);

                throw nvae;
            }

            switch (alt225) {
                case 1 :
                    // InternalRsDsl.g:9226:3: (enumLiteral_0= 'String' )
                    {
                    // InternalRsDsl.g:9226:3: (enumLiteral_0= 'String' )
                    // InternalRsDsl.g:9227:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,173,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariableTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9234:3: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalRsDsl.g:9234:3: (enumLiteral_1= 'Boolean' )
                    // InternalRsDsl.g:9235:4: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,174,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariableTypeAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9242:3: (enumLiteral_2= 'CategoricalData' )
                    {
                    // InternalRsDsl.g:9242:3: (enumLiteral_2= 'CategoricalData' )
                    // InternalRsDsl.g:9243:4: enumLiteral_2= 'CategoricalData'
                    {
                    enumLiteral_2=(Token)match(input,175,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getCategoricalDataEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVariableTypeAccess().getCategoricalDataEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9250:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalRsDsl.g:9250:3: (enumLiteral_3= 'Integer' )
                    // InternalRsDsl.g:9251:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,176,FOLLOW_2); 

                    				current = grammarAccess.getVariableTypeAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVariableTypeAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9258:3: (enumLiteral_4= 'Float' )
                    {
                    // InternalRsDsl.g:9258:3: (enumLiteral_4= 'Float' )
                    // InternalRsDsl.g:9259:4: enumLiteral_4= 'Float'
                    {
                    enumLiteral_4=(Token)match(input,177,FOLLOW_2); 

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
    // InternalRsDsl.g:9269:1: ruleWebInterfaceLibrary returns [Enumerator current=null] : ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) ) ;
    public final Enumerator ruleWebInterfaceLibrary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9275:2: ( ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) ) )
            // InternalRsDsl.g:9276:2: ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) )
            {
            // InternalRsDsl.g:9276:2: ( (enumLiteral_0= 'FLASK' ) | (enumLiteral_1= 'SPRING' ) )
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==178) ) {
                alt226=1;
            }
            else if ( (LA226_0==179) ) {
                alt226=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 0, input);

                throw nvae;
            }
            switch (alt226) {
                case 1 :
                    // InternalRsDsl.g:9277:3: (enumLiteral_0= 'FLASK' )
                    {
                    // InternalRsDsl.g:9277:3: (enumLiteral_0= 'FLASK' )
                    // InternalRsDsl.g:9278:4: enumLiteral_0= 'FLASK'
                    {
                    enumLiteral_0=(Token)match(input,178,FOLLOW_2); 

                    				current = grammarAccess.getWebInterfaceLibraryAccess().getFLASKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWebInterfaceLibraryAccess().getFLASKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9285:3: (enumLiteral_1= 'SPRING' )
                    {
                    // InternalRsDsl.g:9285:3: (enumLiteral_1= 'SPRING' )
                    // InternalRsDsl.g:9286:4: enumLiteral_1= 'SPRING'
                    {
                    enumLiteral_1=(Token)match(input,179,FOLLOW_2); 

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
    // InternalRsDsl.g:9296:1: ruleRecommendationUsageType returns [Enumerator current=null] : ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) ) ;
    public final Enumerator ruleRecommendationUsageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9302:2: ( ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) ) )
            // InternalRsDsl.g:9303:2: ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) )
            {
            // InternalRsDsl.g:9303:2: ( (enumLiteral_0= 'Transformative' ) | (enumLiteral_1= 'Visualization' ) )
            int alt227=2;
            int LA227_0 = input.LA(1);

            if ( (LA227_0==180) ) {
                alt227=1;
            }
            else if ( (LA227_0==181) ) {
                alt227=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 227, 0, input);

                throw nvae;
            }
            switch (alt227) {
                case 1 :
                    // InternalRsDsl.g:9304:3: (enumLiteral_0= 'Transformative' )
                    {
                    // InternalRsDsl.g:9304:3: (enumLiteral_0= 'Transformative' )
                    // InternalRsDsl.g:9305:4: enumLiteral_0= 'Transformative'
                    {
                    enumLiteral_0=(Token)match(input,180,FOLLOW_2); 

                    				current = grammarAccess.getRecommendationUsageTypeAccess().getTransformativeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRecommendationUsageTypeAccess().getTransformativeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9312:3: (enumLiteral_1= 'Visualization' )
                    {
                    // InternalRsDsl.g:9312:3: (enumLiteral_1= 'Visualization' )
                    // InternalRsDsl.g:9313:4: enumLiteral_1= 'Visualization'
                    {
                    enumLiteral_1=(Token)match(input,181,FOLLOW_2); 

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
    // InternalRsDsl.g:9323:1: ruleUserEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) ) ;
    public final Enumerator ruleUserEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9329:2: ( ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) ) )
            // InternalRsDsl.g:9330:2: ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) )
            {
            // InternalRsDsl.g:9330:2: ( (enumLiteral_0= 'Click' ) | (enumLiteral_1= 'Selection' ) )
            int alt228=2;
            int LA228_0 = input.LA(1);

            if ( (LA228_0==182) ) {
                alt228=1;
            }
            else if ( (LA228_0==183) ) {
                alt228=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 228, 0, input);

                throw nvae;
            }
            switch (alt228) {
                case 1 :
                    // InternalRsDsl.g:9331:3: (enumLiteral_0= 'Click' )
                    {
                    // InternalRsDsl.g:9331:3: (enumLiteral_0= 'Click' )
                    // InternalRsDsl.g:9332:4: enumLiteral_0= 'Click'
                    {
                    enumLiteral_0=(Token)match(input,182,FOLLOW_2); 

                    				current = grammarAccess.getUserEventTypeAccess().getClickEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserEventTypeAccess().getClickEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9339:3: (enumLiteral_1= 'Selection' )
                    {
                    // InternalRsDsl.g:9339:3: (enumLiteral_1= 'Selection' )
                    // InternalRsDsl.g:9340:4: enumLiteral_1= 'Selection'
                    {
                    enumLiteral_1=(Token)match(input,183,FOLLOW_2); 

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
    // InternalRsDsl.g:9350:1: ruleRawFormat returns [Enumerator current=null] : (enumLiteral_0= 'CSV' ) ;
    public final Enumerator ruleRawFormat() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9356:2: ( (enumLiteral_0= 'CSV' ) )
            // InternalRsDsl.g:9357:2: (enumLiteral_0= 'CSV' )
            {
            // InternalRsDsl.g:9357:2: (enumLiteral_0= 'CSV' )
            // InternalRsDsl.g:9358:3: enumLiteral_0= 'CSV'
            {
            enumLiteral_0=(Token)match(input,184,FOLLOW_2); 

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
    // InternalRsDsl.g:9367:1: ruleMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) ) ;
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
            // InternalRsDsl.g:9373:2: ( ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) ) )
            // InternalRsDsl.g:9374:2: ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) )
            {
            // InternalRsDsl.g:9374:2: ( (enumLiteral_0= 'PRECISION' ) | (enumLiteral_1= 'RECALL' ) | (enumLiteral_2= 'F1_MEASURE' ) | (enumLiteral_3= 'CATALOG_COVERAGE' ) | (enumLiteral_4= 'NOVELTY' ) | (enumLiteral_5= 'SALE_DIVERSITY' ) | (enumLiteral_6= 'NDCG' ) | (enumLiteral_7= 'ITEM_COVERAGE' ) | (enumLiteral_8= 'EPC' ) | (enumLiteral_9= 'GINI' ) )
            int alt229=10;
            switch ( input.LA(1) ) {
            case 185:
                {
                alt229=1;
                }
                break;
            case 186:
                {
                alt229=2;
                }
                break;
            case 187:
                {
                alt229=3;
                }
                break;
            case 188:
                {
                alt229=4;
                }
                break;
            case 189:
                {
                alt229=5;
                }
                break;
            case 190:
                {
                alt229=6;
                }
                break;
            case 191:
                {
                alt229=7;
                }
                break;
            case 192:
                {
                alt229=8;
                }
                break;
            case 193:
                {
                alt229=9;
                }
                break;
            case 194:
                {
                alt229=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 0, input);

                throw nvae;
            }

            switch (alt229) {
                case 1 :
                    // InternalRsDsl.g:9375:3: (enumLiteral_0= 'PRECISION' )
                    {
                    // InternalRsDsl.g:9375:3: (enumLiteral_0= 'PRECISION' )
                    // InternalRsDsl.g:9376:4: enumLiteral_0= 'PRECISION'
                    {
                    enumLiteral_0=(Token)match(input,185,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getPRECISIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricAccess().getPRECISIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9383:3: (enumLiteral_1= 'RECALL' )
                    {
                    // InternalRsDsl.g:9383:3: (enumLiteral_1= 'RECALL' )
                    // InternalRsDsl.g:9384:4: enumLiteral_1= 'RECALL'
                    {
                    enumLiteral_1=(Token)match(input,186,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getRECALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricAccess().getRECALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9391:3: (enumLiteral_2= 'F1_MEASURE' )
                    {
                    // InternalRsDsl.g:9391:3: (enumLiteral_2= 'F1_MEASURE' )
                    // InternalRsDsl.g:9392:4: enumLiteral_2= 'F1_MEASURE'
                    {
                    enumLiteral_2=(Token)match(input,187,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getF1_MEASUREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMetricAccess().getF1_MEASUREEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9399:3: (enumLiteral_3= 'CATALOG_COVERAGE' )
                    {
                    // InternalRsDsl.g:9399:3: (enumLiteral_3= 'CATALOG_COVERAGE' )
                    // InternalRsDsl.g:9400:4: enumLiteral_3= 'CATALOG_COVERAGE'
                    {
                    enumLiteral_3=(Token)match(input,188,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getCATALOG_COVERAGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMetricAccess().getCATALOG_COVERAGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9407:3: (enumLiteral_4= 'NOVELTY' )
                    {
                    // InternalRsDsl.g:9407:3: (enumLiteral_4= 'NOVELTY' )
                    // InternalRsDsl.g:9408:4: enumLiteral_4= 'NOVELTY'
                    {
                    enumLiteral_4=(Token)match(input,189,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getNOVELTYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMetricAccess().getNOVELTYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9415:3: (enumLiteral_5= 'SALE_DIVERSITY' )
                    {
                    // InternalRsDsl.g:9415:3: (enumLiteral_5= 'SALE_DIVERSITY' )
                    // InternalRsDsl.g:9416:4: enumLiteral_5= 'SALE_DIVERSITY'
                    {
                    enumLiteral_5=(Token)match(input,190,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getSALE_DIVERSITYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMetricAccess().getSALE_DIVERSITYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:9423:3: (enumLiteral_6= 'NDCG' )
                    {
                    // InternalRsDsl.g:9423:3: (enumLiteral_6= 'NDCG' )
                    // InternalRsDsl.g:9424:4: enumLiteral_6= 'NDCG'
                    {
                    enumLiteral_6=(Token)match(input,191,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getNDCGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMetricAccess().getNDCGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRsDsl.g:9431:3: (enumLiteral_7= 'ITEM_COVERAGE' )
                    {
                    // InternalRsDsl.g:9431:3: (enumLiteral_7= 'ITEM_COVERAGE' )
                    // InternalRsDsl.g:9432:4: enumLiteral_7= 'ITEM_COVERAGE'
                    {
                    enumLiteral_7=(Token)match(input,192,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getITEM_COVERAGEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMetricAccess().getITEM_COVERAGEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRsDsl.g:9439:3: (enumLiteral_8= 'EPC' )
                    {
                    // InternalRsDsl.g:9439:3: (enumLiteral_8= 'EPC' )
                    // InternalRsDsl.g:9440:4: enumLiteral_8= 'EPC'
                    {
                    enumLiteral_8=(Token)match(input,193,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getEPCEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMetricAccess().getEPCEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRsDsl.g:9447:3: (enumLiteral_9= 'GINI' )
                    {
                    // InternalRsDsl.g:9447:3: (enumLiteral_9= 'GINI' )
                    // InternalRsDsl.g:9448:4: enumLiteral_9= 'GINI'
                    {
                    enumLiteral_9=(Token)match(input,194,FOLLOW_2); 

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
    // InternalRsDsl.g:9458:1: ruleUserStudyType returns [Enumerator current=null] : ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) ) ;
    public final Enumerator ruleUserStudyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9464:2: ( ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) ) )
            // InternalRsDsl.g:9465:2: ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) )
            {
            // InternalRsDsl.g:9465:2: ( (enumLiteral_0= 'FIELD_STUDIES' ) | (enumLiteral_1= 'CONTROLLED_EXPERIMENT' ) )
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==195) ) {
                alt230=1;
            }
            else if ( (LA230_0==196) ) {
                alt230=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 230, 0, input);

                throw nvae;
            }
            switch (alt230) {
                case 1 :
                    // InternalRsDsl.g:9466:3: (enumLiteral_0= 'FIELD_STUDIES' )
                    {
                    // InternalRsDsl.g:9466:3: (enumLiteral_0= 'FIELD_STUDIES' )
                    // InternalRsDsl.g:9467:4: enumLiteral_0= 'FIELD_STUDIES'
                    {
                    enumLiteral_0=(Token)match(input,195,FOLLOW_2); 

                    				current = grammarAccess.getUserStudyTypeAccess().getFIELD_STUDIESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserStudyTypeAccess().getFIELD_STUDIESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9474:3: (enumLiteral_1= 'CONTROLLED_EXPERIMENT' )
                    {
                    // InternalRsDsl.g:9474:3: (enumLiteral_1= 'CONTROLLED_EXPERIMENT' )
                    // InternalRsDsl.g:9475:4: enumLiteral_1= 'CONTROLLED_EXPERIMENT'
                    {
                    enumLiteral_1=(Token)match(input,196,FOLLOW_2); 

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
    // InternalRsDsl.g:9485:1: ruleUserStudyAnalysis returns [Enumerator current=null] : ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) ) ;
    public final Enumerator ruleUserStudyAnalysis() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9491:2: ( ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) ) )
            // InternalRsDsl.g:9492:2: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) )
            {
            // InternalRsDsl.g:9492:2: ( (enumLiteral_0= 'QUALITATIVE' ) | (enumLiteral_1= 'QUANTITATIVE' ) )
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==197) ) {
                alt231=1;
            }
            else if ( (LA231_0==198) ) {
                alt231=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 231, 0, input);

                throw nvae;
            }
            switch (alt231) {
                case 1 :
                    // InternalRsDsl.g:9493:3: (enumLiteral_0= 'QUALITATIVE' )
                    {
                    // InternalRsDsl.g:9493:3: (enumLiteral_0= 'QUALITATIVE' )
                    // InternalRsDsl.g:9494:4: enumLiteral_0= 'QUALITATIVE'
                    {
                    enumLiteral_0=(Token)match(input,197,FOLLOW_2); 

                    				current = grammarAccess.getUserStudyAnalysisAccess().getQUALITATIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserStudyAnalysisAccess().getQUALITATIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9501:3: (enumLiteral_1= 'QUANTITATIVE' )
                    {
                    // InternalRsDsl.g:9501:3: (enumLiteral_1= 'QUANTITATIVE' )
                    // InternalRsDsl.g:9502:4: enumLiteral_1= 'QUANTITATIVE'
                    {
                    enumLiteral_1=(Token)match(input,198,FOLLOW_2); 

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
    // InternalRsDsl.g:9512:1: ruleValidationLibrary returns [Enumerator current=null] : ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) ) ;
    public final Enumerator ruleValidationLibrary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9518:2: ( ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) ) )
            // InternalRsDsl.g:9519:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) )
            {
            // InternalRsDsl.g:9519:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) )
            int alt232=2;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==199) ) {
                alt232=1;
            }
            else if ( (LA232_0==200) ) {
                alt232=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 232, 0, input);

                throw nvae;
            }
            switch (alt232) {
                case 1 :
                    // InternalRsDsl.g:9520:3: (enumLiteral_0= 'SKLEARN' )
                    {
                    // InternalRsDsl.g:9520:3: (enumLiteral_0= 'SKLEARN' )
                    // InternalRsDsl.g:9521:4: enumLiteral_0= 'SKLEARN'
                    {
                    enumLiteral_0=(Token)match(input,199,FOLLOW_2); 

                    				current = grammarAccess.getValidationLibraryAccess().getSKLEARNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationLibraryAccess().getSKLEARNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9528:3: (enumLiteral_1= 'SURPRISE' )
                    {
                    // InternalRsDsl.g:9528:3: (enumLiteral_1= 'SURPRISE' )
                    // InternalRsDsl.g:9529:4: enumLiteral_1= 'SURPRISE'
                    {
                    enumLiteral_1=(Token)match(input,200,FOLLOW_2); 

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
    // InternalRsDsl.g:9539:1: rulePyLibType returns [Enumerator current=null] : ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) ) ;
    public final Enumerator rulePyLibType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9545:2: ( ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) ) )
            // InternalRsDsl.g:9546:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) )
            {
            // InternalRsDsl.g:9546:2: ( (enumLiteral_0= 'SKLEARN' ) | (enumLiteral_1= 'SURPRISE' ) | (enumLiteral_2= 'TENSOR_FLOW' ) | (enumLiteral_3= 'PYTORCH' ) | (enumLiteral_4= 'ELLIOT' ) )
            int alt233=5;
            switch ( input.LA(1) ) {
            case 199:
                {
                alt233=1;
                }
                break;
            case 200:
                {
                alt233=2;
                }
                break;
            case 201:
                {
                alt233=3;
                }
                break;
            case 202:
                {
                alt233=4;
                }
                break;
            case 203:
                {
                alt233=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 233, 0, input);

                throw nvae;
            }

            switch (alt233) {
                case 1 :
                    // InternalRsDsl.g:9547:3: (enumLiteral_0= 'SKLEARN' )
                    {
                    // InternalRsDsl.g:9547:3: (enumLiteral_0= 'SKLEARN' )
                    // InternalRsDsl.g:9548:4: enumLiteral_0= 'SKLEARN'
                    {
                    enumLiteral_0=(Token)match(input,199,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getSKLEARNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPyLibTypeAccess().getSKLEARNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9555:3: (enumLiteral_1= 'SURPRISE' )
                    {
                    // InternalRsDsl.g:9555:3: (enumLiteral_1= 'SURPRISE' )
                    // InternalRsDsl.g:9556:4: enumLiteral_1= 'SURPRISE'
                    {
                    enumLiteral_1=(Token)match(input,200,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getSURPRISEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPyLibTypeAccess().getSURPRISEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9563:3: (enumLiteral_2= 'TENSOR_FLOW' )
                    {
                    // InternalRsDsl.g:9563:3: (enumLiteral_2= 'TENSOR_FLOW' )
                    // InternalRsDsl.g:9564:4: enumLiteral_2= 'TENSOR_FLOW'
                    {
                    enumLiteral_2=(Token)match(input,201,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getTENSOR_FLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPyLibTypeAccess().getTENSOR_FLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9571:3: (enumLiteral_3= 'PYTORCH' )
                    {
                    // InternalRsDsl.g:9571:3: (enumLiteral_3= 'PYTORCH' )
                    // InternalRsDsl.g:9572:4: enumLiteral_3= 'PYTORCH'
                    {
                    enumLiteral_3=(Token)match(input,202,FOLLOW_2); 

                    				current = grammarAccess.getPyLibTypeAccess().getPYTORCHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPyLibTypeAccess().getPYTORCHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9579:3: (enumLiteral_4= 'ELLIOT' )
                    {
                    // InternalRsDsl.g:9579:3: (enumLiteral_4= 'ELLIOT' )
                    // InternalRsDsl.g:9580:4: enumLiteral_4= 'ELLIOT'
                    {
                    enumLiteral_4=(Token)match(input,203,FOLLOW_2); 

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
    // InternalRsDsl.g:9590:1: ruleFilteringRSAlgorithm returns [Enumerator current=null] : ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) ) ;
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
            // InternalRsDsl.g:9596:2: ( ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) ) )
            // InternalRsDsl.g:9597:2: ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) )
            {
            // InternalRsDsl.g:9597:2: ( (enumLiteral_0= 'CONTENT_BASED' ) | (enumLiteral_1= 'DEMOGRAPHIC' ) | (enumLiteral_2= 'USER_BASED' ) | (enumLiteral_3= 'ITEM_BASED' ) | (enumLiteral_4= 'CONTEXT_AWARE' ) | (enumLiteral_5= 'HYBRID' ) )
            int alt234=6;
            switch ( input.LA(1) ) {
            case 204:
                {
                alt234=1;
                }
                break;
            case 205:
                {
                alt234=2;
                }
                break;
            case 206:
                {
                alt234=3;
                }
                break;
            case 207:
                {
                alt234=4;
                }
                break;
            case 208:
                {
                alt234=5;
                }
                break;
            case 209:
                {
                alt234=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 234, 0, input);

                throw nvae;
            }

            switch (alt234) {
                case 1 :
                    // InternalRsDsl.g:9598:3: (enumLiteral_0= 'CONTENT_BASED' )
                    {
                    // InternalRsDsl.g:9598:3: (enumLiteral_0= 'CONTENT_BASED' )
                    // InternalRsDsl.g:9599:4: enumLiteral_0= 'CONTENT_BASED'
                    {
                    enumLiteral_0=(Token)match(input,204,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getCONTENT_BASEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFilteringRSAlgorithmAccess().getCONTENT_BASEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9606:3: (enumLiteral_1= 'DEMOGRAPHIC' )
                    {
                    // InternalRsDsl.g:9606:3: (enumLiteral_1= 'DEMOGRAPHIC' )
                    // InternalRsDsl.g:9607:4: enumLiteral_1= 'DEMOGRAPHIC'
                    {
                    enumLiteral_1=(Token)match(input,205,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getDEMOGRAPHICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFilteringRSAlgorithmAccess().getDEMOGRAPHICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9614:3: (enumLiteral_2= 'USER_BASED' )
                    {
                    // InternalRsDsl.g:9614:3: (enumLiteral_2= 'USER_BASED' )
                    // InternalRsDsl.g:9615:4: enumLiteral_2= 'USER_BASED'
                    {
                    enumLiteral_2=(Token)match(input,206,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getUSER_BASEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFilteringRSAlgorithmAccess().getUSER_BASEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9622:3: (enumLiteral_3= 'ITEM_BASED' )
                    {
                    // InternalRsDsl.g:9622:3: (enumLiteral_3= 'ITEM_BASED' )
                    // InternalRsDsl.g:9623:4: enumLiteral_3= 'ITEM_BASED'
                    {
                    enumLiteral_3=(Token)match(input,207,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getITEM_BASEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFilteringRSAlgorithmAccess().getITEM_BASEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9630:3: (enumLiteral_4= 'CONTEXT_AWARE' )
                    {
                    // InternalRsDsl.g:9630:3: (enumLiteral_4= 'CONTEXT_AWARE' )
                    // InternalRsDsl.g:9631:4: enumLiteral_4= 'CONTEXT_AWARE'
                    {
                    enumLiteral_4=(Token)match(input,208,FOLLOW_2); 

                    				current = grammarAccess.getFilteringRSAlgorithmAccess().getCONTEXT_AWAREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFilteringRSAlgorithmAccess().getCONTEXT_AWAREEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9638:3: (enumLiteral_5= 'HYBRID' )
                    {
                    // InternalRsDsl.g:9638:3: (enumLiteral_5= 'HYBRID' )
                    // InternalRsDsl.g:9639:4: enumLiteral_5= 'HYBRID'
                    {
                    enumLiteral_5=(Token)match(input,209,FOLLOW_2); 

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
    // InternalRsDsl.g:9649:1: ruleSimilarityFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) ) ;
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
            // InternalRsDsl.g:9655:2: ( ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) ) )
            // InternalRsDsl.g:9656:2: ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) )
            {
            // InternalRsDsl.g:9656:2: ( (enumLiteral_0= 'COSINE_SIMILARITY' ) | (enumLiteral_1= 'JACCARD_DISTANCE' ) | (enumLiteral_2= 'WORD_EMBEDDINGS' ) | (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' ) | (enumLiteral_4= 'SVD' ) | (enumLiteral_5= 'GRAPH_BASED' ) | (enumLiteral_6= 'MSD' ) | (enumLiteral_7= 'EUCLIDEAN_DISTANCE' ) )
            int alt235=8;
            switch ( input.LA(1) ) {
            case 210:
                {
                alt235=1;
                }
                break;
            case 211:
                {
                alt235=2;
                }
                break;
            case 212:
                {
                alt235=3;
                }
                break;
            case 213:
                {
                alt235=4;
                }
                break;
            case 214:
                {
                alt235=5;
                }
                break;
            case 215:
                {
                alt235=6;
                }
                break;
            case 216:
                {
                alt235=7;
                }
                break;
            case 217:
                {
                alt235=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 235, 0, input);

                throw nvae;
            }

            switch (alt235) {
                case 1 :
                    // InternalRsDsl.g:9657:3: (enumLiteral_0= 'COSINE_SIMILARITY' )
                    {
                    // InternalRsDsl.g:9657:3: (enumLiteral_0= 'COSINE_SIMILARITY' )
                    // InternalRsDsl.g:9658:4: enumLiteral_0= 'COSINE_SIMILARITY'
                    {
                    enumLiteral_0=(Token)match(input,210,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getCOSINE_SIMILARITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimilarityFunctionAccess().getCOSINE_SIMILARITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9665:3: (enumLiteral_1= 'JACCARD_DISTANCE' )
                    {
                    // InternalRsDsl.g:9665:3: (enumLiteral_1= 'JACCARD_DISTANCE' )
                    // InternalRsDsl.g:9666:4: enumLiteral_1= 'JACCARD_DISTANCE'
                    {
                    enumLiteral_1=(Token)match(input,211,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getJACCARD_DISTANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimilarityFunctionAccess().getJACCARD_DISTANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9673:3: (enumLiteral_2= 'WORD_EMBEDDINGS' )
                    {
                    // InternalRsDsl.g:9673:3: (enumLiteral_2= 'WORD_EMBEDDINGS' )
                    // InternalRsDsl.g:9674:4: enumLiteral_2= 'WORD_EMBEDDINGS'
                    {
                    enumLiteral_2=(Token)match(input,212,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getWORD_EMBEDDINGSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimilarityFunctionAccess().getWORD_EMBEDDINGSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9681:3: (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' )
                    {
                    // InternalRsDsl.g:9681:3: (enumLiteral_3= 'LEVENSHTEIN_DISTANCE' )
                    // InternalRsDsl.g:9682:4: enumLiteral_3= 'LEVENSHTEIN_DISTANCE'
                    {
                    enumLiteral_3=(Token)match(input,213,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getLEVENSHTEIN_DISTANCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimilarityFunctionAccess().getLEVENSHTEIN_DISTANCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9689:3: (enumLiteral_4= 'SVD' )
                    {
                    // InternalRsDsl.g:9689:3: (enumLiteral_4= 'SVD' )
                    // InternalRsDsl.g:9690:4: enumLiteral_4= 'SVD'
                    {
                    enumLiteral_4=(Token)match(input,214,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getSVDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimilarityFunctionAccess().getSVDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9697:3: (enumLiteral_5= 'GRAPH_BASED' )
                    {
                    // InternalRsDsl.g:9697:3: (enumLiteral_5= 'GRAPH_BASED' )
                    // InternalRsDsl.g:9698:4: enumLiteral_5= 'GRAPH_BASED'
                    {
                    enumLiteral_5=(Token)match(input,215,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getGRAPH_BASEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimilarityFunctionAccess().getGRAPH_BASEDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRsDsl.g:9705:3: (enumLiteral_6= 'MSD' )
                    {
                    // InternalRsDsl.g:9705:3: (enumLiteral_6= 'MSD' )
                    // InternalRsDsl.g:9706:4: enumLiteral_6= 'MSD'
                    {
                    enumLiteral_6=(Token)match(input,216,FOLLOW_2); 

                    				current = grammarAccess.getSimilarityFunctionAccess().getMSDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimilarityFunctionAccess().getMSDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRsDsl.g:9713:3: (enumLiteral_7= 'EUCLIDEAN_DISTANCE' )
                    {
                    // InternalRsDsl.g:9713:3: (enumLiteral_7= 'EUCLIDEAN_DISTANCE' )
                    // InternalRsDsl.g:9714:4: enumLiteral_7= 'EUCLIDEAN_DISTANCE'
                    {
                    enumLiteral_7=(Token)match(input,217,FOLLOW_2); 

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
    // InternalRsDsl.g:9724:1: ruleDataMiningRSAlgorithm returns [Enumerator current=null] : ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) ) ;
    public final Enumerator ruleDataMiningRSAlgorithm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9730:2: ( ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) ) )
            // InternalRsDsl.g:9731:2: ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) )
            {
            // InternalRsDsl.g:9731:2: ( (enumLiteral_0= 'CLUSTERING' ) | (enumLiteral_1= 'FREQUENT_ITEM_SET' ) | (enumLiteral_2= 'ASSOCIATION_RULE' ) | (enumLiteral_3= 'EVENT_STREAM' ) | (enumLiteral_4= 'TEXT_MINING' ) )
            int alt236=5;
            switch ( input.LA(1) ) {
            case 218:
                {
                alt236=1;
                }
                break;
            case 219:
                {
                alt236=2;
                }
                break;
            case 220:
                {
                alt236=3;
                }
                break;
            case 221:
                {
                alt236=4;
                }
                break;
            case 222:
                {
                alt236=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 236, 0, input);

                throw nvae;
            }

            switch (alt236) {
                case 1 :
                    // InternalRsDsl.g:9732:3: (enumLiteral_0= 'CLUSTERING' )
                    {
                    // InternalRsDsl.g:9732:3: (enumLiteral_0= 'CLUSTERING' )
                    // InternalRsDsl.g:9733:4: enumLiteral_0= 'CLUSTERING'
                    {
                    enumLiteral_0=(Token)match(input,218,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getCLUSTERINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataMiningRSAlgorithmAccess().getCLUSTERINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9740:3: (enumLiteral_1= 'FREQUENT_ITEM_SET' )
                    {
                    // InternalRsDsl.g:9740:3: (enumLiteral_1= 'FREQUENT_ITEM_SET' )
                    // InternalRsDsl.g:9741:4: enumLiteral_1= 'FREQUENT_ITEM_SET'
                    {
                    enumLiteral_1=(Token)match(input,219,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getFREQUENT_ITEM_SETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataMiningRSAlgorithmAccess().getFREQUENT_ITEM_SETEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9748:3: (enumLiteral_2= 'ASSOCIATION_RULE' )
                    {
                    // InternalRsDsl.g:9748:3: (enumLiteral_2= 'ASSOCIATION_RULE' )
                    // InternalRsDsl.g:9749:4: enumLiteral_2= 'ASSOCIATION_RULE'
                    {
                    enumLiteral_2=(Token)match(input,220,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getASSOCIATION_RULEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataMiningRSAlgorithmAccess().getASSOCIATION_RULEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9756:3: (enumLiteral_3= 'EVENT_STREAM' )
                    {
                    // InternalRsDsl.g:9756:3: (enumLiteral_3= 'EVENT_STREAM' )
                    // InternalRsDsl.g:9757:4: enumLiteral_3= 'EVENT_STREAM'
                    {
                    enumLiteral_3=(Token)match(input,221,FOLLOW_2); 

                    				current = grammarAccess.getDataMiningRSAlgorithmAccess().getEVENT_STREAMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataMiningRSAlgorithmAccess().getEVENT_STREAMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9764:3: (enumLiteral_4= 'TEXT_MINING' )
                    {
                    // InternalRsDsl.g:9764:3: (enumLiteral_4= 'TEXT_MINING' )
                    // InternalRsDsl.g:9765:4: enumLiteral_4= 'TEXT_MINING'
                    {
                    enumLiteral_4=(Token)match(input,222,FOLLOW_2); 

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
    // InternalRsDsl.g:9775:1: ruleSearchStrategy returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) ) ;
    public final Enumerator ruleSearchStrategy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9781:2: ( ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) ) )
            // InternalRsDsl.g:9782:2: ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) )
            {
            // InternalRsDsl.g:9782:2: ( (enumLiteral_0= 'SIMULATED_ANNELING' ) | (enumLiteral_1= 'HILL_CLIMBING' ) | (enumLiteral_2= 'GRADIENT_DESCENT' ) | (enumLiteral_3= 'EGGHOLDER_FUNCTION' ) )
            int alt237=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 237, 0, input);

                throw nvae;
            }

            switch (alt237) {
                case 1 :
                    // InternalRsDsl.g:9783:3: (enumLiteral_0= 'SIMULATED_ANNELING' )
                    {
                    // InternalRsDsl.g:9783:3: (enumLiteral_0= 'SIMULATED_ANNELING' )
                    // InternalRsDsl.g:9784:4: enumLiteral_0= 'SIMULATED_ANNELING'
                    {
                    enumLiteral_0=(Token)match(input,223,FOLLOW_2); 

                    				current = grammarAccess.getSearchStrategyAccess().getSIMULATED_ANNELINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSearchStrategyAccess().getSIMULATED_ANNELINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9791:3: (enumLiteral_1= 'HILL_CLIMBING' )
                    {
                    // InternalRsDsl.g:9791:3: (enumLiteral_1= 'HILL_CLIMBING' )
                    // InternalRsDsl.g:9792:4: enumLiteral_1= 'HILL_CLIMBING'
                    {
                    enumLiteral_1=(Token)match(input,224,FOLLOW_2); 

                    				current = grammarAccess.getSearchStrategyAccess().getHILL_CLIMBINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSearchStrategyAccess().getHILL_CLIMBINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9799:3: (enumLiteral_2= 'GRADIENT_DESCENT' )
                    {
                    // InternalRsDsl.g:9799:3: (enumLiteral_2= 'GRADIENT_DESCENT' )
                    // InternalRsDsl.g:9800:4: enumLiteral_2= 'GRADIENT_DESCENT'
                    {
                    enumLiteral_2=(Token)match(input,225,FOLLOW_2); 

                    				current = grammarAccess.getSearchStrategyAccess().getGRADIENT_DESCENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSearchStrategyAccess().getGRADIENT_DESCENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9807:3: (enumLiteral_3= 'EGGHOLDER_FUNCTION' )
                    {
                    // InternalRsDsl.g:9807:3: (enumLiteral_3= 'EGGHOLDER_FUNCTION' )
                    // InternalRsDsl.g:9808:4: enumLiteral_3= 'EGGHOLDER_FUNCTION'
                    {
                    enumLiteral_3=(Token)match(input,226,FOLLOW_2); 

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
    // InternalRsDsl.g:9818:1: ruleMutationOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) ) ;
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
            // InternalRsDsl.g:9824:2: ( ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) ) )
            // InternalRsDsl.g:9825:2: ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) )
            {
            // InternalRsDsl.g:9825:2: ( (enumLiteral_0= 'FIT_BIT' ) | (enumLiteral_1= 'CROSSOVER' ) | (enumLiteral_2= 'SHRINK_MUTATION' ) | (enumLiteral_3= 'REPACE_MUTATION' ) | (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' ) | (enumLiteral_5= 'DUPLICATION' ) )
            int alt238=6;
            switch ( input.LA(1) ) {
            case 227:
                {
                alt238=1;
                }
                break;
            case 228:
                {
                alt238=2;
                }
                break;
            case 229:
                {
                alt238=3;
                }
                break;
            case 230:
                {
                alt238=4;
                }
                break;
            case 231:
                {
                alt238=5;
                }
                break;
            case 232:
                {
                alt238=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 238, 0, input);

                throw nvae;
            }

            switch (alt238) {
                case 1 :
                    // InternalRsDsl.g:9826:3: (enumLiteral_0= 'FIT_BIT' )
                    {
                    // InternalRsDsl.g:9826:3: (enumLiteral_0= 'FIT_BIT' )
                    // InternalRsDsl.g:9827:4: enumLiteral_0= 'FIT_BIT'
                    {
                    enumLiteral_0=(Token)match(input,227,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getFIT_BITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMutationOperationAccess().getFIT_BITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9834:3: (enumLiteral_1= 'CROSSOVER' )
                    {
                    // InternalRsDsl.g:9834:3: (enumLiteral_1= 'CROSSOVER' )
                    // InternalRsDsl.g:9835:4: enumLiteral_1= 'CROSSOVER'
                    {
                    enumLiteral_1=(Token)match(input,228,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getCROSSOVEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMutationOperationAccess().getCROSSOVEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9842:3: (enumLiteral_2= 'SHRINK_MUTATION' )
                    {
                    // InternalRsDsl.g:9842:3: (enumLiteral_2= 'SHRINK_MUTATION' )
                    // InternalRsDsl.g:9843:4: enumLiteral_2= 'SHRINK_MUTATION'
                    {
                    enumLiteral_2=(Token)match(input,229,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getSHRINK_MUTATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMutationOperationAccess().getSHRINK_MUTATIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9850:3: (enumLiteral_3= 'REPACE_MUTATION' )
                    {
                    // InternalRsDsl.g:9850:3: (enumLiteral_3= 'REPACE_MUTATION' )
                    // InternalRsDsl.g:9851:4: enumLiteral_3= 'REPACE_MUTATION'
                    {
                    enumLiteral_3=(Token)match(input,230,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getREPACE_MUTATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMutationOperationAccess().getREPACE_MUTATIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9858:3: (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' )
                    {
                    // InternalRsDsl.g:9858:3: (enumLiteral_4= 'PARTIAL_HYPER_MUTATION' )
                    // InternalRsDsl.g:9859:4: enumLiteral_4= 'PARTIAL_HYPER_MUTATION'
                    {
                    enumLiteral_4=(Token)match(input,231,FOLLOW_2); 

                    				current = grammarAccess.getMutationOperationAccess().getPARTIAL_HYPER_MUTATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMutationOperationAccess().getPARTIAL_HYPER_MUTATIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRsDsl.g:9866:3: (enumLiteral_5= 'DUPLICATION' )
                    {
                    // InternalRsDsl.g:9866:3: (enumLiteral_5= 'DUPLICATION' )
                    // InternalRsDsl.g:9867:4: enumLiteral_5= 'DUPLICATION'
                    {
                    enumLiteral_5=(Token)match(input,232,FOLLOW_2); 

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
    // InternalRsDsl.g:9877:1: ruleKernelType returns [Enumerator current=null] : ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) ) ;
    public final Enumerator ruleKernelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9883:2: ( ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) ) )
            // InternalRsDsl.g:9884:2: ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) )
            {
            // InternalRsDsl.g:9884:2: ( (enumLiteral_0= 'PRECOMPUTED' ) | (enumLiteral_1= 'LINEAR' ) | (enumLiteral_2= 'POLY' ) | (enumLiteral_3= 'RBF' ) | (enumLiteral_4= 'SIGMOID' ) )
            int alt239=5;
            switch ( input.LA(1) ) {
            case 233:
                {
                alt239=1;
                }
                break;
            case 234:
                {
                alt239=2;
                }
                break;
            case 235:
                {
                alt239=3;
                }
                break;
            case 236:
                {
                alt239=4;
                }
                break;
            case 237:
                {
                alt239=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 239, 0, input);

                throw nvae;
            }

            switch (alt239) {
                case 1 :
                    // InternalRsDsl.g:9885:3: (enumLiteral_0= 'PRECOMPUTED' )
                    {
                    // InternalRsDsl.g:9885:3: (enumLiteral_0= 'PRECOMPUTED' )
                    // InternalRsDsl.g:9886:4: enumLiteral_0= 'PRECOMPUTED'
                    {
                    enumLiteral_0=(Token)match(input,233,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getPRECOMPUTEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKernelTypeAccess().getPRECOMPUTEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9893:3: (enumLiteral_1= 'LINEAR' )
                    {
                    // InternalRsDsl.g:9893:3: (enumLiteral_1= 'LINEAR' )
                    // InternalRsDsl.g:9894:4: enumLiteral_1= 'LINEAR'
                    {
                    enumLiteral_1=(Token)match(input,234,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getLINEAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKernelTypeAccess().getLINEAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9901:3: (enumLiteral_2= 'POLY' )
                    {
                    // InternalRsDsl.g:9901:3: (enumLiteral_2= 'POLY' )
                    // InternalRsDsl.g:9902:4: enumLiteral_2= 'POLY'
                    {
                    enumLiteral_2=(Token)match(input,235,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getPOLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getKernelTypeAccess().getPOLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:9909:3: (enumLiteral_3= 'RBF' )
                    {
                    // InternalRsDsl.g:9909:3: (enumLiteral_3= 'RBF' )
                    // InternalRsDsl.g:9910:4: enumLiteral_3= 'RBF'
                    {
                    enumLiteral_3=(Token)match(input,236,FOLLOW_2); 

                    				current = grammarAccess.getKernelTypeAccess().getRBFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getKernelTypeAccess().getRBFEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:9917:3: (enumLiteral_4= 'SIGMOID' )
                    {
                    // InternalRsDsl.g:9917:3: (enumLiteral_4= 'SIGMOID' )
                    // InternalRsDsl.g:9918:4: enumLiteral_4= 'SIGMOID'
                    {
                    enumLiteral_4=(Token)match(input,237,FOLLOW_2); 

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
    // InternalRsDsl.g:9928:1: ruleSolverType returns [Enumerator current=null] : ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) ) ;
    public final Enumerator ruleSolverType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9934:2: ( ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) ) )
            // InternalRsDsl.g:9935:2: ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) )
            {
            // InternalRsDsl.g:9935:2: ( (enumLiteral_0= 'ADAM' ) | (enumLiteral_1= 'LBFGS' ) | (enumLiteral_2= 'SGD' ) )
            int alt240=3;
            switch ( input.LA(1) ) {
            case 238:
                {
                alt240=1;
                }
                break;
            case 239:
                {
                alt240=2;
                }
                break;
            case 240:
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
                    // InternalRsDsl.g:9936:3: (enumLiteral_0= 'ADAM' )
                    {
                    // InternalRsDsl.g:9936:3: (enumLiteral_0= 'ADAM' )
                    // InternalRsDsl.g:9937:4: enumLiteral_0= 'ADAM'
                    {
                    enumLiteral_0=(Token)match(input,238,FOLLOW_2); 

                    				current = grammarAccess.getSolverTypeAccess().getADAMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSolverTypeAccess().getADAMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9944:3: (enumLiteral_1= 'LBFGS' )
                    {
                    // InternalRsDsl.g:9944:3: (enumLiteral_1= 'LBFGS' )
                    // InternalRsDsl.g:9945:4: enumLiteral_1= 'LBFGS'
                    {
                    enumLiteral_1=(Token)match(input,239,FOLLOW_2); 

                    				current = grammarAccess.getSolverTypeAccess().getLBFGSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSolverTypeAccess().getLBFGSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9952:3: (enumLiteral_2= 'SGD' )
                    {
                    // InternalRsDsl.g:9952:3: (enumLiteral_2= 'SGD' )
                    // InternalRsDsl.g:9953:4: enumLiteral_2= 'SGD'
                    {
                    enumLiteral_2=(Token)match(input,240,FOLLOW_2); 

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
    // InternalRsDsl.g:9963:1: ruleActivationType returns [Enumerator current=null] : ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) ) ;
    public final Enumerator ruleActivationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRsDsl.g:9969:2: ( ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) ) )
            // InternalRsDsl.g:9970:2: ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) )
            {
            // InternalRsDsl.g:9970:2: ( (enumLiteral_0= 'RELU' ) | (enumLiteral_1= 'SIGMOID' ) | (enumLiteral_2= 'TANH' ) )
            int alt241=3;
            switch ( input.LA(1) ) {
            case 241:
                {
                alt241=1;
                }
                break;
            case 237:
                {
                alt241=2;
                }
                break;
            case 242:
                {
                alt241=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 241, 0, input);

                throw nvae;
            }

            switch (alt241) {
                case 1 :
                    // InternalRsDsl.g:9971:3: (enumLiteral_0= 'RELU' )
                    {
                    // InternalRsDsl.g:9971:3: (enumLiteral_0= 'RELU' )
                    // InternalRsDsl.g:9972:4: enumLiteral_0= 'RELU'
                    {
                    enumLiteral_0=(Token)match(input,241,FOLLOW_2); 

                    				current = grammarAccess.getActivationTypeAccess().getRELUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActivationTypeAccess().getRELUEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:9979:3: (enumLiteral_1= 'SIGMOID' )
                    {
                    // InternalRsDsl.g:9979:3: (enumLiteral_1= 'SIGMOID' )
                    // InternalRsDsl.g:9980:4: enumLiteral_1= 'SIGMOID'
                    {
                    enumLiteral_1=(Token)match(input,237,FOLLOW_2); 

                    				current = grammarAccess.getActivationTypeAccess().getSIGMOIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActivationTypeAccess().getSIGMOIDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:9987:3: (enumLiteral_2= 'TANH' )
                    {
                    // InternalRsDsl.g:9987:3: (enumLiteral_2= 'TANH' )
                    // InternalRsDsl.g:9988:4: enumLiteral_2= 'TANH'
                    {
                    enumLiteral_2=(Token)match(input,242,FOLLOW_2); 

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
    // InternalRsDsl.g:9998:1: ruleFeedbackLibType returns [Enumerator current=null] : ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) ) ;
    public final Enumerator ruleFeedbackLibType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRsDsl.g:10004:2: ( ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) ) )
            // InternalRsDsl.g:10005:2: ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) )
            {
            // InternalRsDsl.g:10005:2: ( (enumLiteral_0= 'LIGHTFM' ) | (enumLiteral_1= 'LIGHTGBM' ) )
            int alt242=2;
            int LA242_0 = input.LA(1);

            if ( (LA242_0==243) ) {
                alt242=1;
            }
            else if ( (LA242_0==244) ) {
                alt242=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 242, 0, input);

                throw nvae;
            }
            switch (alt242) {
                case 1 :
                    // InternalRsDsl.g:10006:3: (enumLiteral_0= 'LIGHTFM' )
                    {
                    // InternalRsDsl.g:10006:3: (enumLiteral_0= 'LIGHTFM' )
                    // InternalRsDsl.g:10007:4: enumLiteral_0= 'LIGHTFM'
                    {
                    enumLiteral_0=(Token)match(input,243,FOLLOW_2); 

                    				current = grammarAccess.getFeedbackLibTypeAccess().getLIGHTFMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeedbackLibTypeAccess().getLIGHTFMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:10014:3: (enumLiteral_1= 'LIGHTGBM' )
                    {
                    // InternalRsDsl.g:10014:3: (enumLiteral_1= 'LIGHTGBM' )
                    // InternalRsDsl.g:10015:4: enumLiteral_1= 'LIGHTGBM'
                    {
                    enumLiteral_1=(Token)match(input,244,FOLLOW_2); 

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
    // InternalRsDsl.g:10025:1: ruleRatingType returns [Enumerator current=null] : ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) ) ;
    public final Enumerator ruleRatingType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRsDsl.g:10031:2: ( ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) ) )
            // InternalRsDsl.g:10032:2: ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) )
            {
            // InternalRsDsl.g:10032:2: ( (enumLiteral_0= 'POSITIVE' ) | (enumLiteral_1= 'NEGATIVE' ) | (enumLiteral_2= 'NUMERICAL' ) | (enumLiteral_3= 'ORDINAL' ) | (enumLiteral_4= 'UNARY' ) )
            int alt243=5;
            switch ( input.LA(1) ) {
            case 245:
                {
                alt243=1;
                }
                break;
            case 246:
                {
                alt243=2;
                }
                break;
            case 247:
                {
                alt243=3;
                }
                break;
            case 248:
                {
                alt243=4;
                }
                break;
            case 249:
                {
                alt243=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 243, 0, input);

                throw nvae;
            }

            switch (alt243) {
                case 1 :
                    // InternalRsDsl.g:10033:3: (enumLiteral_0= 'POSITIVE' )
                    {
                    // InternalRsDsl.g:10033:3: (enumLiteral_0= 'POSITIVE' )
                    // InternalRsDsl.g:10034:4: enumLiteral_0= 'POSITIVE'
                    {
                    enumLiteral_0=(Token)match(input,245,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getPOSITIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRatingTypeAccess().getPOSITIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRsDsl.g:10041:3: (enumLiteral_1= 'NEGATIVE' )
                    {
                    // InternalRsDsl.g:10041:3: (enumLiteral_1= 'NEGATIVE' )
                    // InternalRsDsl.g:10042:4: enumLiteral_1= 'NEGATIVE'
                    {
                    enumLiteral_1=(Token)match(input,246,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getNEGATIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRatingTypeAccess().getNEGATIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRsDsl.g:10049:3: (enumLiteral_2= 'NUMERICAL' )
                    {
                    // InternalRsDsl.g:10049:3: (enumLiteral_2= 'NUMERICAL' )
                    // InternalRsDsl.g:10050:4: enumLiteral_2= 'NUMERICAL'
                    {
                    enumLiteral_2=(Token)match(input,247,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getNUMERICALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRatingTypeAccess().getNUMERICALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRsDsl.g:10057:3: (enumLiteral_3= 'ORDINAL' )
                    {
                    // InternalRsDsl.g:10057:3: (enumLiteral_3= 'ORDINAL' )
                    // InternalRsDsl.g:10058:4: enumLiteral_3= 'ORDINAL'
                    {
                    enumLiteral_3=(Token)match(input,248,FOLLOW_2); 

                    				current = grammarAccess.getRatingTypeAccess().getORDINALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRatingTypeAccess().getORDINALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRsDsl.g:10065:3: (enumLiteral_4= 'UNARY' )
                    {
                    // InternalRsDsl.g:10065:3: (enumLiteral_4= 'UNARY' )
                    // InternalRsDsl.g:10066:4: enumLiteral_4= 'UNARY'
                    {
                    enumLiteral_4=(Token)match(input,249,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000086000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x00000000001B9400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x8100000000000000L,0x000000000037A250L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006280000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFE00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0001A48000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000009A0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0003E00000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000019000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000007F000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000060000080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040000080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xD080000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000160000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0060000000080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000080000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0900000000080000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000080000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000080000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000003L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000060L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000010080000L,0x0000000000000800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000010080000L,0x0000000000006800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000080000L,0x0000000000006800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000080000L,0x0000000000004800L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040800L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000080000L,0x0000000000200800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000080000L,0x0000000003800000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000080000L,0x0000000003000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000080000L,0x0000000002000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000080000L,0x0000000038000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000080000L,0x0000000030000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000080000L,0x0000000020000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000080000L,0x0000000100000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000080000L,0x0000001003800000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000080000L,0x0000001003000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000080000L,0x0000001002000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000040L,0x0000004000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000400080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000010080000L,0x0000180000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000080000L,0x0000180000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000080000L,0x0000100000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000080000L,0x0000400000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000080000L,0x001C000000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000080000L,0x0018000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000080000L,0x0010000000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000080000L,0x7E00000001000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000080000L,0x7C00000001000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000080000L,0x7800000001000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000080000L,0x7000000001000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000080000L,0x4000000001000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000080000L,0x0000000001000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000080000L,0x6200000001000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003FC0000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000080000L,0x6200000001000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000080000L,0x6200000001000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000080000L,0x6200000001000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000080000L,0x7E00000001000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000080000L,0x7C00000001000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000080000L,0x7800000001000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000080000L,0x7000000001000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000080000L,0x7E00000001000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000080000L,0x7C00000001000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000000080000L,0x7800000001000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000080000L,0x7000000001000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000080000L,0x7E00000001000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000080000L,0x7C00000001000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000080000L,0x7800000001000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000080000L,0x7000000001000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000000040L,0x0000004000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0006200000000000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000000080000L,0x6000000001000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_168 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_169 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000640000000L});
    public static final BitSet FOLLOW_170 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000440000000L});
    public static final BitSet FOLLOW_171 = new BitSet(new long[]{0x0000000400080000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x03E0000000000000L});

}