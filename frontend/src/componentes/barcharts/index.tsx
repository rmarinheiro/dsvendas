import axios from 'axios';
import { useEffect, useState } from 'react'
import Chart from 'react-apexcharts'
import { SaleSuccess } from 'types/sale';
import { round } from 'utils/format';
import { BASE_URL } from 'utils/request';

const BarChart = () => {

    const [chartData, setChartData] = useState<CharData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/sucess-by-seller`)
            .then(res => {
                const data = res.data as SaleSuccess[];
                const myLabels = data.map(x=> x.sellerName);
                const mySeries = data.map(x => round(100.0* x.details/x.visited,1));

                setChartData({   
                    labels: {
                    categories: myLabels
                },
                series: [
                    {
                        name: "% Sucess",
                        data: mySeries
                    }
                ]
            });


            });

    }, []);

    type SeriesData = {
        name: string;
        data: number[];
    }

    type CharData = {
        labels: {
            categories: string[]
        };
        series: SeriesData[]
    }

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    

    return (
        <Chart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarChart;