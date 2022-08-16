<script>
import FormAPI from "../services/FormAPI"
import Input from "./Input.vue"

export default {
    data () {
        return {
            formInfo: []
        }
    },
    mounted () {
        // Pull data from the back-end and put it into formInfo to display. 
        this.getData()
        .then((data) => {
            this.formInfo = JSON.parse(JSON.stringify(data.data));
        });
    },
    methods: {
        /**
         * Get data from back-end base on the id.
         * 
         */
        getData () {
            return FormAPI.getConfig(this.$route.params.formID);
        },
    },
    components: {
        Input
    }
}
</script>

<template>
    <!-- Displaying general information about the config -->
    <div class="container my-12 mx-12 text-lg w-[100%] shadow-md shadow-blue-500/50 rounded-lg p-12">
        <p>Job Name: {{this.formInfo.configName}}</p>
        <p>File Type: {{this.formInfo.fileType}} </p>
        <p>Description: {{this.formInfo.description}}</p>
        <p> URL: {{ this.formInfo.urlToDownload}}</p>
    </div>
</template>